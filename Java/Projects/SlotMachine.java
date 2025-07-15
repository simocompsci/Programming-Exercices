
import java.util.Scanner;


public class SlotMachine {

    public static void main(String[] args) {
        int balance = 1000;
        boolean play = true;
        int bet;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*********************");
            System.out.println("Welcome to our Java slot machine");
            System.out.println("Symbols: & # @ || ");
            System.out.println("*********************");
            System.out.println("Current balance : $" + balance);
            System.out.print("Place your bet amount :");
            bet = scanner.nextInt();

            if(bet == 0){
                play = false;
                continue;
                
            }
            System.out.print("Spinning.....");
            

        }
        
        scanner.close();

    }
}
