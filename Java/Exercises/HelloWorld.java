import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class HelloWorld {
    public static void main(String[] args) {
        // int age = 20;
        // double gpa = 3.8;
        // char grade = 'A';
        // boolean isStudent = true;
        // String name = "mohammed";

        // System.out.print("hello world\n");
        // System.out.print("i like bodybuilding!\n");
        // System.out.println("my age is " + age + " and i got a " +gpa + " gpa in my cs
        // degree , \n with the grade :" + grade + " in all of my exams");
        // System.out.println("my name is " + name);

        // if (isStudent) {
        // System.out.println("you are a student");

        // }
        // else{
        // System.out.println("your are not a student");

        // }

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("enter your name: ");
        // String askName = scanner.nextLine();
        // System.out.print("what s your age: ");
        // int age = scanner.nextInt();
        // System.out.println("welcome to our school Mr." + askName);
        // System.out.println("you are " + age + " years old");
        // // there is other methods like nextline and nextint . EX: nextdouble , nextBoolean...

        // scanner.close();

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("kubernets is an: ");
        // scanner.nextLine();
        // System.out.print(". that helps us manage our : ");
        // scanner.nextLine();
        // System.out.print(". it was developped by : ");
        // scanner.nextLine();
        // System.out.print(". its relly used in : ");
        // scanner.nextLine();
        // System.out.print(". we can find it in : ");
        // scanner.nextLine();
        // System.out.print(" cloud service: ");
        // scanner.nextLine();
    
        // scanner.close();


        // int x = 10;
        // double y = 2.3;

        // double result = x % y;
        // System.out.println(result);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("what item do you want");
        // String item = scanner.nextLine();
        // System.out.print("how much does it cost");
        // double price = scanner.nextDouble();
        // System.out.print("how many " + item + " do you want");
        // int quantity = scanner.nextInt();
        // double total = price * quantity;


        // System.out.println("You have bought " + quantity + " " + item +"s");
        // System.out.println("Your total is " + total);


        // scanner.close();

        // Random random = new Random();
        // int number = random.nextInt(3 , 34);  for these methods of next.. they are the same
        // System.out.print("your random number is: " + number);


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Whats the value of the first side?");
        // double side1 = scanner.nextDouble();
        // System.out.print("Whats the value of the second side?");
        // double side2 = scanner.nextDouble();
        // scanner.close();
        // double Hypothenuos = Math.sqrt((Math.pow(side1, 2))+ (Math.pow(side2, 2)));

        // System.out.printf("the Hypothenuos is :%f cm\n" , Hypothenuos);


        // in this chapter we will talk about printf
        String name = "spongbob";
        int age = 34;
        double salary = 2222.506666;
        char gpa = 'A';
        boolean isEmployed = true;

        System.out.printf("helllllllllllo %s \n" , name);
        System.out.printf("your age is :  %d \n" , age);
        System.out.printf("your salary is %.1f \n" , salary);
        System.out.printf("your gpa is  %c \n" , gpa);
        System.out.printf("is spongbob employed , %b \n" , isEmployed);


    }
}