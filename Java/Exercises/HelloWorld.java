
public class HelloWorld {

    public static void main(String[] args) {
        // 2D arrays = An array where each element is an array useful for storing a matrix of data

        String[] fastfood = {"pizza" , "lasagna" , "spagetti"};
        String[] vegetables = {"carrots" , "potattos" , "tomattos"};
        String[] fruits = {"apple" , "orange" , "bannana"};

        String[][] groceries = {
            fastfood,
            vegetables,
            fruits,
        };
           
        // groceries[0][0] = "hello";

        for (String[] foods : groceries) {
            System.out.print("food to get :");
            for (Object food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

     
        
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
    // Arrays
    // String[] Fruits = {"bannana" ,"apple" ,"orange" ,"cocunut" ,"bannana" };
    // Fruits[2] = "orange"; to change the value of a specific element in the array 
    // System.out.println(Fruits);  when we print an array we get a memory address because its referenced datatype
    // System.out.println(Fruits[2]);
    // for (int i = 0; i < Fruits.length; i++) {
    //     System.out.println(Fruits[i]);
    // }
    /* we use these array methods before the lines of code we want to display the result because we cant 
        store these in variables */
    // Arrays.sort(Fruits); to sort an array
    // Arrays.fill(Fruits, "is good"); to change all the values within our array
    // for (String elem : Fruits) { // this is an enhanced array like (for each) in javascript
    //     System.out.println(elem);
    // }
    // This code is to enter user input into an array
    // String[] Foods = new String[8]; // we create an empty array that can store 8 elements in the memory
    // String goodies;
    // Scanner scanner = new Scanner(System.in);
    // for (int i = 0; i < Foods.length; i++) {
    //     System.out.print("\nPlease enter a value to add to the array: ");
    //     goodies = scanner.next();
    //     Foods[i] = goodies;
    // }
    // System.out.printf("the length of the array is : %d \n" , Foods.length);
    // for (String food : Foods) {
    //     System.out.println(food);
    // }
    // scanner.close(); 
    // this is linear search to search the elements of an array
    // int[] numbers = {1, 9, 8, 6, 7, 5, 2, 4};
    // int target = 2;
    // String target2 = "zinfandel";
    // boolean found = false;
    // String[] words = {
    //     "apple", "banana", "cherry", "date", "elderberry", "fig", "grape",
    //     "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya",
    //     "quince", "raspberry", "strawberry", "tangerine", "ugli", "vanilla",
    //     "watermelon", "xigua", "yam", "zucchini", "apricot", "blackberry",
    //     "cantaloupe", "dragonfruit", "eggplant", "feijoa", "guava", "hackberry",
    //     "imbe", "jackfruit", "kumquat", "lime", "mulberry", "navel", "olive",
    //     "peach", "quenepa", "rambutan", "soursop", "tomato", "uva", "voavanga",
    //     "wolfberry", "ximenia", "yuzu", "zinfandel"
    // };
    // for (int num : numbers) {
    //     if (num == target) {    
    //         System.out.println("You have fond your target : " + target);
    //         found = true;
    //         break;
    //     }
    // }
    // for (int i = 0; i < words.length; i++) {
    //     if(target2.equals(words[i])) {
    //         System.out.println("You have found your taget at the index : " + i);
    //         break;
    //     }
    //     if (!found) {
    //         System.out.println("Your target doesnt exist in the array");
    //     }
    // }

    /* VarArgs (variable arguments) in Java these are used in methods to let them accept any amout of arguments without the need to create overloaded metthods*/

    // System.out.println(add(1, 5, 2, 4, 8));
    // System.out.println(average(15, 15.2, 17, 33.5));

    // static int add(int... numbers){
    //     int sum = 0;
    //     for (int num  : numbers) {
    //         sum += num;
    //     }
    //     return sum;
    // }
    // static double average(double ... grades){
    //     double sum = 0;
    //     for (double num : grades) {
    //         sum += num;
    //     }
    //     return sum/grades.length;
    // }
}
