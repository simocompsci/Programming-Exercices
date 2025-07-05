
import java.util.Scanner;

public class BanckingProgramm {

    public static void main(String[] args) {
        System.err.println("**** Bancking Programm ****");

        double Amount = 0;
        boolean ExitValue = false;
        double depositValue;
        double withdrawValue;
        int choice;
        Scanner scanner = new Scanner(System.in);
        while (ExitValue == false) {
            System.err.println("Chose wich option you want:");
            System.out.println(" 1 - Amount \n 2 - Widhthdraw \n 3 - Deposit \n 4 - Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The amount is :" + GetAmout(Amount));
                    break;
                case 2:
                    if (Amount <= 0) {
                        System.out.println("broke bitch you ve got nothing");
                        break;
                    } else {
                        System.out.println("Please enter a value to withdraw");
                        withdrawValue = scanner.nextDouble();
                        
                        System.out.println("You withdrawed :" + withdrawValue);
                        System.out.println("You balance is :" + Widhthdraw(Amount, withdrawValue));
                        break;
                    }

                case 3:
                    System.out.println("Please enter a value to dispose");
                    depositValue = scanner.nextDouble();
                    System.out.println("You disposed :" + depositValue);
                    System.out.println("You balance is :" + Deposit(Amount, depositValue));
                    break;
                case 4:
                    ExitValue = true;
                    System.out.println("You have existed the system");
                    break;
                default:
                    System.out.println("Chose an option");
            }

        }
        scanner.close();
    }

    static double GetAmout(double Amount) {
        return Amount;
    }

    static double Widhthdraw(double Amount, double withdrawValue) {

        Amount = Amount - withdrawValue;
        return Amount;
    }

    static double Deposit(double Amount, double depositValue) {
        Amount = Amount + depositValue;
        return Amount;
    }
}
