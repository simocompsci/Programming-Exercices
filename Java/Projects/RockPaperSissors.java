
import java.util.Random;
import java.util.Scanner;

public class RockPaperSissors {

    public static void main(String[] args) {
        // array of strings (rock , paper , siscors) for computer to chose from
        String[] handsigns = {"rock", "paper", "scissors"};
        Random random = new Random();
        int randomNumber;
        String cpuHand = null;
        String userHand = null;
        String answer;
        boolean wannaPlay = false;

        // we then create a variable that stores a random number between 1-3 and assign each of these numbers to an element of the 
        // array
        Scanner scanner = new Scanner(System.in);
        while (true) {
            while (cpuHand == null && userHand == null) {
                System.out.println("Please chose an option (rock/paper/scissors): ");

                userHand = scanner.next();
            }

            randomNumber = randomNumber = random.nextInt(1, 4);
            switch (randomNumber) {
                case 1:
                    cpuHand = handsigns[0];
                    break;
                case 2:
                    cpuHand = handsigns[1];
                    break;
                case 3:
                    cpuHand = handsigns[2];
                    break;
                default:
                    System.out.println("nothing");

            }

            if (cpuHand.equals("scissors") && userHand.equals("paper")) {
                System.out.println("the cpu chosen" + cpuHand);
                System.out.println("the cpu won");
            } else if (cpuHand.equals("scissors") && userHand.equals("rock")) {
                System.out.println("the cpu chosen" + cpuHand);
                System.out.println("you have won");
            } else if (cpuHand.equals("paper") && userHand.equals("scissors")) {
                System.out.println("the cpu chosen" + cpuHand);
                System.out.println("you have won");
            } else if (cpuHand.equals("paper") && userHand.equals("rock")) {
                System.out.println("the cpu chosen" + cpuHand);
                System.out.println("the cpu won");
            } else if (cpuHand.equals("rock") && userHand.equals("paper")) {
                System.out.println("the cpu chosen" + cpuHand);
                System.out.println("you have won");
            } else if (cpuHand.equals("rock") && userHand.equals("scissors")) {
                System.out.println("the cpu chosen" + cpuHand);
                System.out.println("the cpu won");
            } else {
                System.out.println("the cpu chose the same a s you");
                System.out.println("equal");
            }

            System.out.println("Do you want to continue playing (yes/no) ? ");
            answer = scanner.next();
            if (answer.equals("yes")) {
                wannaPlay = true;
                cpuHand = null;
                userHand = null;
            } else {
                wannaPlay = false;
                break;
            }

        }
        scanner.close();

        // test wich thing the user have chosen and wich one the computer did chose by comparing elements and returning wich one won
    }

}
