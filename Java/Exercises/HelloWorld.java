
public class HelloWorld {
    
    public static void main(String[] args) {
        
        
    }


    
    
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
    // String name = "spongbob";
    // int age = 34;
    // double salary = 2222.506666;
    // char gpa = 'A';
    // boolean isEmployed = true;
    // System.out.printf("helllllllllllo %s \n" , name);
    // System.out.printf("your age is :  %d \n" , age);
    // System.out.printf("your salary is %.1f \n" , salary);
    // System.out.printf("your gpa is  %c \n" , gpa);
    // System.out.printf("is spongbob employed , %b \n" , isEmployed);
    // double num1;
    // double num2;
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Give me a number between 0 and 1 : ");
    // num1 = scanner.nextDouble();
    // System.out.print("Give me a second number between 0 and 1 : ");
    // num2 = scanner.nextDouble();
    // if ( (num1 < 1 && num1 > 0) && (num2 < 1 && num2 > 0)) {
    //     System.out.print(true);
    // }
    // else{
    //     System.out.println(false);
    // }
    // scanner.close();
    // String name = "spongbob";
    // int length = name.length();
    // System.out.println("\n the length of the string is " + length);
    // int number = 1;
    // while (number < 11 ) {
    //     System.out.println(number);
    //     number++;
    // }
    // Random random = new Random();
    // Scanner scanner = new Scanner(System.in);
    // int guess;
    // int attempts = 0;
    // int number = random.nextInt(1, 11);
    // System.out.println("Guess a number between 1 - 100");
    // do {
    //     System.out.println("Enter a guess");
    //     guess = scanner.nextInt();
    //     attempts++;
    //     if (guess > number) {
    //         System.out.println("the number is too high");
    //     } else if (guess < number) {
    //         System.out.println("the number is too low");
    //     } else {
    //         System.out.println("You have guessed right");
    //         return;
    //     }
    // } while (guess != number);
    // scanner.close();
    // for (int i = 0; i < 10; i++) {
    //     System.out.println("pizza number : " + i);
    // }
    // we can use break or continue within our loops not only in switches
    // Nested Loops 
    // for (int i = 0; i <= 10; i++) {
    //     for (int j = 1; j <= i; j++) {
    //         System.out.print("#");
    //         // System.out.print(("#").repeat(j));
    //     }
    //     System.out.println();
    // }

    // Methods or functions AND There is a type of methods called Overloaded Methods: these are the functions that share the 
    // same name but contains different Parameters wich gives them different signature

    // public static void main(String[] args) {
    //     
    //     HappyBirthday("mohammed" , 21);

    //     int result = Factorial(5);
    //     System.out.println(result);
        
    // }
    // static void HappyBirthday(String name, int age) {
    //     System.out.printf("Happy birthday to you %s \n",  name);
    //     System.out.printf("Happy birthday to you %s \n", name);
    //     System.out.printf("you are now %d years old \n", age);
    // }

    // static int Factorial(int number) {
    //     int facto = 1;
    //     for (int i = 1; i <= number; i++) {
    //          facto = facto * i;
             
    //     }
    //     return  facto;
    // }

}
