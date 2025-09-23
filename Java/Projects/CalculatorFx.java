import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ModernCalculator extends Application {
    
    private Label display;
    private Label historyDisplay;
    private String currentInput = "";
    private String currentOperator = "";
    private double firstOperand = 0;
    private boolean startNewInput = true;
    private String calculationHistory = "";
    
    // Color scheme
    private final Color PRIMARY_COLOR = Color.web("#2D3748");
    private final Color SECONDARY_COLOR = Color.web("#4A5568");
    private final Color ACCENT_COLOR = Color.web("#3182CE");
    private final Color OPERATOR_COLOR = Color.web("#E53E3E");
    private final Color DISPLAY_BG = Color.web("#1A202C");
    private final Color BUTTON_TEXT = Color.WHITE;
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Modern Calculator");
        
        // Main container
        VBox mainContainer = new VBox(20);
        mainContainer.setAlignment(Pos.CENTER);
        mainContainer.setPadding(new Insets(20));
        mainContainer.setStyle("-fx-background-color: " + toHex(PRIMARY_COLOR) + ";");
        
        // Create displays
        createDisplays(mainContainer);
        
        // Create button grid
        createButtonGrid(mainContainer);
        
        Scene scene = new Scene(mainContainer, 350, 500);
        scene.setFill(PRIMARY_COLOR);
        
        // Add keyboard support
        setupKeyboardSupport(scene);
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    private void createDisplays(VBox parent) {
        VBox displayContainer = new VBox(10);
        displayContainer.setAlignment(Pos.CENTER_RIGHT);
        displayContainer.setPadding(new Insets(10));
        displayContainer.setBackground(new Background(new BackgroundFill(
            DISPLAY_BG, new CornerRadii(15), Insets.EMPTY)));
        displayContainer.setMaxWidth(Double.MAX_VALUE);
        
        // History display (smaller, shows previous calculations)
        historyDisplay = new Label();
        historyDisplay.setTextFill(Color.web("#A0AEC0"));
        historyDisplay.setFont(Font.font("Arial", 14));
        historyDisplay.setAlignment(Pos.CENTER_RIGHT);
        historyDisplay.setMaxWidth(Double.MAX_VALUE);
        
        // Main display
        display = new Label("0");
        display.setTextFill(Color.WHITE);
        display.setFont(Font.font("Arial", 36));
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setMaxWidth(Double.MAX_VALUE);
        
        displayContainer.getChildren().addAll(historyDisplay, display);
        parent.getChildren().add(displayContainer);
    }
    
    private void createButtonGrid(VBox parent) {
        GridPane buttonGrid = new GridPane();
        buttonGrid.setAlignment(Pos.CENTER);
        buttonGrid.setHgap(10);
        buttonGrid.setVgap(10);
        buttonGrid.setPadding(new Insets(10));
        
        // Button definitions: [text, column, row, colSpan, isOperator, specialColor]
        String[][] buttonConfig = {
            {"C", 0, 0, 1, true, OPERATOR_COLOR}, 
            {"±", 1, 0, 1, true, OPERATOR_COLOR},
            {"%", 2, 0, 1, true, OPERATOR_COLOR},
            {"÷", 3, 0, 1, true, OPERATOR_COLOR},
            
            {"7", 0, 1, 1, false, null}, 
            {"8", 1, 1, 1, false, null},
            {"9", 2, 1, 1, false, null},
            {"×", 3, 1, 1, true, OPERATOR_COLOR},
            
            {"4", 0, 2, 1, false, null}, 
            {"5", 1, 2, 1, false, null},
            {"6", 2, 2, 1, false, null},
            {"-", 3, 2, 1, true, OPERATOR_COLOR},
            
            {"1", 0, 3, 1, false, null}, 
            {"2", 1, 3, 1, false, null},
            {"3", 2, 3, 1, false, null},
            {"+", 3, 3, 1, true, OPERATOR_COLOR},
            
            {"0", 0, 4, 2, false, null}, 
            {".", 2, 4, 1, false, null},
            {"=", 3, 4, 1, true, ACCENT_COLOR}
        };
        
        for (String[] config : buttonConfig) {
            Button button = createStyledButton(config[0], config[4].equals("true"), config[5]);
            button.setOnAction(e -> handleButtonClick(config[0]));
            
            int colSpan = Integer.parseInt(config[3]);
            if (colSpan > 1) {
                GridPane.setColumnSpan(button, colSpan);
                button.setMaxWidth(Double.MAX_VALUE);
            }
            
            buttonGrid.add(button, Integer.parseInt(config[1]), Integer.parseInt(config[2]));
        }
        
        // Make buttons expand to fill space
        ColumnConstraints colConstraints = new ColumnConstraints();
        colConstraints.setHgrow(Priority.ALWAYS);
        for (int i = 0; i < 4; i++) {
            buttonGrid.getColumnConstraints().add(colConstraints);
        }
        
        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setVgrow(Priority.ALWAYS);
        for (int i = 0; i < 5; i++) {
            buttonGrid.getRowConstraints().add(rowConstraints);
        }
        
        parent.getChildren().add(buttonGrid);
    }
    
    private Button createStyledButton(String text, boolean isOperator, String specialColor) {
        Button button = new Button(text);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setFont(Font.font("Arial", 20));
        
        // Determine button color
        String backgroundColor;
        if (specialColor != null) {
            backgroundColor = toHex(Color.web(specialColor));
        } else if (isOperator) {
            backgroundColor = toHex(OPERATOR_COLOR);
        } else {
            backgroundColor = toHex(SECONDARY_COLOR);
        }
        
        // Base style
        String baseStyle = "-fx-background-color: " + backgroundColor + "; " +
                          "-fx-text-fill: white; " +
                          "-fx-border-radius: 10; " +
                          "-fx-background-radius: 10; " +
                          "-fx-cursor: hand;";
        
        // Hover effect
        String hoverStyle = "-fx-background-color: derive(" + backgroundColor + ", 20%);";
        
        // Pressed effect
        String pressedStyle = "-fx-background-color: derive(" + backgroundColor + ", -10%);";
        
        button.setStyle(baseStyle);
        
        // Add hover effects
        button.setOnMouseEntered(e -> button.setStyle(baseStyle + hoverStyle));
        button.setOnMouseExited(e -> button.setStyle(baseStyle));
        button.setOnMousePressed(e -> button.setStyle(baseStyle + pressedStyle));
        button.setOnMouseReleased(e -> button.setStyle(baseStyle + hoverStyle));
        
        return button;
    }
    
    private void handleButtonClick(String value) {
        switch (value) {
            case "0": case "1": case "2": case "3": case "4":
            case "5": case "6": case "7": case "8": case "9":
                inputNumber(value);
                break;
                
            case ".":
                inputDecimal();
                break;
                
            case "+": case "-": case "×": case "÷":
                setOperator(value);
                break;
                
            case "=":
                calculate();
                break;
                
            case "C":
                clear();
                break;
                
            case "±":
                toggleSign();
                break;
                
            case "%":
                percentage();
                break;
        }
    }
    
    private void inputNumber(String number) {
        if (startNewInput) {
            currentInput = number;
            startNewInput = false;
        } else {
            currentInput += number;
        }
        updateDisplay();
    }
    
    private void inputDecimal() {
        if (startNewInput) {
            currentInput = "0.";
            startNewInput = false;
        } else if (!currentInput.contains(".")) {
            currentInput += ".";
        }
        updateDisplay();
    }
    
    private void setOperator(String operator) {
        if (!currentInput.isEmpty()) {
            if (!currentOperator.isEmpty()) {
                calculate();
            }
            firstOperand = Double.parseDouble(currentInput);
            currentOperator = operator;
            calculationHistory = formatNumber(firstOperand) + " " + operator;
            historyDisplay.setText(calculationHistory);
            startNewInput = true;
        } else if (!currentOperator.isEmpty()) {
            // Allow changing operator
            currentOperator = operator;
            calculationHistory = formatNumber(firstOperand) + " " + operator;
            historyDisplay.setText(calculationHistory);
        }
    }
    
    private void calculate() {
        if (currentOperator.isEmpty() || currentInput.isEmpty()) {
            return;
        }
        
        double secondOperand = Double.parseDouble(currentInput);
        double result = 0;
        
        try {
            switch (currentOperator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "×":
                    result = firstOperand * secondOperand;
                    break;
                case "÷":
                    if (secondOperand == 0) {
                        display.setText("Error");
                        calculationHistory += " " + formatNumber(secondOperand) + " = Error";
                        historyDisplay.setText(calculationHistory);
                        resetCalculator();
                        return;
                    }
                    result = firstOperand / secondOperand;
                    break;
            }
            
            // Update history
            calculationHistory += " " + formatNumber(secondOperand) + " = " + formatNumber(result);
            historyDisplay.setText(calculationHistory);
            
            currentInput = String.valueOf(result);
            currentOperator = "";
            startNewInput = true;
            updateDisplay();
            
        } catch (Exception e) {
            display.setText("Error");
            resetCalculator();
        }
    }
    
    private void clear() {
        currentInput = "";
        currentOperator = "";
        firstOperand = 0;
        startNewInput = true;
        calculationHistory = "";
        historyDisplay.setText("");
        display.setText("0");
    }
    
    private void toggleSign() {
        if (!currentInput.isEmpty() && !currentInput.equals("0")) {
            if (currentInput.startsWith("-")) {
                currentInput = currentInput.substring(1);
            } else {
                currentInput = "-" + currentInput;
            }
            updateDisplay();
        }
    }
    
    private void percentage() {
        if (!currentInput.isEmpty()) {
            double value = Double.parseDouble(currentInput) / 100;
            currentInput = String.valueOf(value);
            updateDisplay();
        }
    }
    
    private void updateDisplay() {
        if (currentInput.isEmpty()) {
            display.setText("0");
        } else {
            try {
                double value = Double.parseDouble(currentInput);
                display.setText(formatNumber(value));
            } catch (NumberFormatException e) {
                display.setText("Error");
            }
        }
    }
    
    private String formatNumber(double value) {
        if (value == (long) value) {
            return String.format("%d", (long) value);
        } else {
            return String.format("%s", value).replaceAll("\\.?0+$", "");
        }
    }
    
    private void resetCalculator() {
        currentInput = "";
        currentOperator = "";
        firstOperand = 0;
        startNewInput = true;
    }
    
    private void setupKeyboardSupport(Scene scene) {
        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            KeyCode code = event.getCode();
            
            if (code.isDigitKey()) {
                handleButtonClick(code.getName());
            } else {
                switch (code) {
                    case DECIMAL: case PERIOD:
                        handleButtonClick(".");
                        break;
                    case ADD:
                        handleButtonClick("+");
                        break;
                    case SUBTRACT: case MINUS:
                        handleButtonClick("-");
                        break;
                    case MULTIPLY:
                        handleButtonClick("×");
                        break;
                    case DIVIDE: case SLASH:
                        handleButtonClick("÷");
                        break;
                    case ENTER: case EQUALS:
                        handleButtonClick("=");
                        break;
                    case ESCAPE: case DELETE:
                        handleButtonClick("C");
                        break;
                    case BACK_SPACE:
                        if (!currentInput.isEmpty()) {
                            currentInput = currentInput.substring(0, currentInput.length() - 1);
                            updateDisplay();
                        }
                        break;
                }
            }
            event.consume();
        });
    }
    
    private String toHex(Color color) {
        return String.format("#%02X%02X%02X",
            (int) (color.getRed() * 255),
            (int) (color.getGreen() * 255),
            (int) (color.getBlue() * 255));
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}