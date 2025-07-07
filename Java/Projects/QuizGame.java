
import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        // declare our variables 
        String guess;
        int result = 0;

        // create an array that conatins custom questions
        String[] questions = {
            "What is the capital of France?",
            "Who wrote 'Romeo and Juliet'?",
            "What planet is known as the Red Planet?",
            "Which element has the chemical symbol 'O'?",
            "Who painted the Mona Lisa?"
        };

        // create a 2D array that contains responses or options
        String[][] options = {
            {"A) Paris", "B) Madrid", "C) Berlin", "D) Rome"},
            {"A) William Shakespeare", "B) Mark Twain", "C) Charles Dickens", "D) Jane Austen"},
            {"A) Earth", "B) Venus", "C) Mars", "D) Jupiter"},
            {"A) Hydrogen", "B) Oxygen", "C) Gold", "D) Nitrogen"},
            {"A) Vincent van Gogh", "B) Pablo Picasso", "C) Leonardo da Vinci", "D) Michelangelo"}
        };

        String[] answers = {"A", "A", "C", "B", "C"};

        Scanner scanner = new Scanner(System.in);

        // list each question with a loop questions array
        for (int i = 0; i <= questions.length - 1; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {

                System.out.println(option);

            }
            System.out.print("Please enter a guess: ");
            guess = scanner.next().toUpperCase();
            if (answers[i].equals(guess)) {
                result++;
            }

        }
        System.out.printf("Your have answerd %d questions correctly", result);
        scanner.close();
    }

    // within this loop we list our option (2D array)
    // get guess from user and check it
    // we will store the users answer in a guess variable if the guess is correct we increment a value of result if not we do
    // nothing
}
