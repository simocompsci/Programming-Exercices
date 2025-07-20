
public class HelloWorld {

    public static void main(String[] args) {
        // MultiThreading = Enables to run multiple threads concurently
        // (Thread = a set of instructions that run independently)
        // Useful for background tasks or time-consuming operations

        MyRunnable2 myRunnable2 = new MyRunnable2();
        MyRunnable3 myRunnable3 = new MyRunnable3();
        Thread thread1 = new Thread(myRunnable2);
        Thread thread2 = new Thread(myRunnable3);

        System.out.println("Game starts");
        thread1.start();
        thread2.start(); // when we run this programm the result is that they both display i at the same
                         // time (ping pong ....)
        // Theres is another way that brocode have done , not like mine that i should
        // consider to

        try {
            thread1.join();
            thread2.join(); // this block of code lets our main thread to wait for our other threads to finish
                            // and then executes the  System.out.println("Game over")
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Game over");

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
    // // there is other methods like nextline and nextint . EX: nextdouble ,
    // nextBoolean...
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
    // int number = random.nextInt(3 , 34); for these methods of next.. they are the
    // same
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
    // System.out.printf("your age is : %d \n" , age);
    // System.out.printf("your salary is %.1f \n" , salary);
    // System.out.printf("your gpa is %c \n" , gpa);
    // System.out.printf("is spongbob employed , %b \n" , isEmployed);
    // double num1;
    // double num2;
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Give me a number between 0 and 1 : ");
    // num1 = scanner.nextDouble();
    // System.out.print("Give me a second number between 0 and 1 : ");
    // num2 = scanner.nextDouble();
    // if ( (num1 < 1 && num1 > 0) && (num2 < 1 && num2 > 0)) {
    // System.out.print(true);
    // }
    // else{
    // System.out.println(false);
    // }
    // scanner.close();
    // String name = "spongbob";
    // int length = name.length();
    // System.out.println("\n the length of the string is " + length);
    // int number = 1;
    // while (number < 11 ) {
    // System.out.println(number);
    // number++;
    // }
    // Random random = new Random();
    // Scanner scanner = new Scanner(System.in);
    // int guess;
    // int attempts = 0;
    // int number = random.nextInt(1, 11);
    // System.out.println("Guess a number between 1 - 100");
    // do {
    // System.out.println("Enter a guess");
    // guess = scanner.nextInt();
    // attempts++;
    // if (guess > number) {
    // System.out.println("the number is too high");
    // } else if (guess < number) {
    // System.out.println("the number is too low");
    // } else {
    // System.out.println("You have guessed right");
    // return;
    // }
    // } while (guess != number);
    // scanner.close();
    // for (int i = 0; i < 10; i++) {
    // System.out.println("pizza number : " + i);
    // }
    // we can use break or continue within our loops not only in switches
    // Nested Loops
    // for (int i = 0; i <= 10; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("#");
    // // System.out.print(("#").repeat(j));
    // }
    // System.out.println();
    // }
    // Methods or functions AND There is a type of methods called Overloaded
    // Methods: these are the functions that share the
    // same name but contains different Parameters wich gives them different
    // signature
    // public static void main(String[] args) {
    //
    // HappyBirthday("mohammed" , 21);
    // int result = Factorial(5);
    // System.out.println(result);
    // }
    // static void HappyBirthday(String name, int age) {
    // System.out.printf("Happy birthday to you %s \n", name);
    // System.out.printf("Happy birthday to you %s \n", name);
    // System.out.printf("you are now %d years old \n", age);
    // }
    // static int Factorial(int number) {
    // int facto = 1;
    // for (int i = 1; i <= number; i++) {
    // facto = facto * i;
    // }
    // return facto;
    // }
    // Arrays
    // String[] Fruits = {"bannana" ,"apple" ,"orange" ,"cocunut" ,"bannana" };
    // Fruits[2] = "orange"; to change the value of a specific element in the array
    // System.out.println(Fruits); when we print an array we get a memory address
    // because its referenced datatype
    // System.out.println(Fruits[2]);
    // for (int i = 0; i < Fruits.length; i++) {
    // System.out.println(Fruits[i]);
    // }
    /*
     * we use these array methods before the lines of code we want to display the
     * result because we cant
     * store these in variables
     */
    // Arrays.sort(Fruits); to sort an array
    // Arrays.fill(Fruits, "is good"); to change all the values within our array
    // for (String elem : Fruits) { // this is an enhanced array like (for each) in
    // javascript
    // System.out.println(elem);
    // }
    // This code is to enter user input into an array
    // String[] Foods = new String[8]; // we create an empty array that can store 8
    // elements in the memory
    // String goodies;
    // Scanner scanner = new Scanner(System.in);
    // for (int i = 0; i < Foods.length; i++) {
    // System.out.print("\nPlease enter a value to add to the array: ");
    // goodies = scanner.next();
    // Foods[i] = goodies;
    // }
    // System.out.printf("the length of the array is : %d \n" , Foods.length);
    // for (String food : Foods) {
    // System.out.println(food);
    // }
    // scanner.close();
    // this is linear search to search the elements of an array
    // int[] numbers = {1, 9, 8, 6, 7, 5, 2, 4};
    // int target = 2;
    // String target2 = "zinfandel";
    // boolean found = false;
    // String[] words = {
    // "apple", "banana", "cherry", "date", "elderberry", "fig", "grape",
    // "honeydew", "kiwi", "lemon", "mango", "nectarine", "orange", "papaya",
    // "quince", "raspberry", "strawberry", "tangerine", "ugli", "vanilla",
    // "watermelon", "xigua", "yam", "zucchini", "apricot", "blackberry",
    // "cantaloupe", "dragonfruit", "eggplant", "feijoa", "guava", "hackberry",
    // "imbe", "jackfruit", "kumquat", "lime", "mulberry", "navel", "olive",
    // "peach", "quenepa", "rambutan", "soursop", "tomato", "uva", "voavanga",
    // "wolfberry", "ximenia", "yuzu", "zinfandel"
    // };
    // for (int num : numbers) {
    // if (num == target) {
    // System.out.println("You have fond your target : " + target);
    // found = true;
    // break;
    // }
    // }
    // for (int i = 0; i < words.length; i++) {
    // if(target2.equals(words[i])) {
    // System.out.println("You have found your taget at the index : " + i);
    // break;
    // }
    // if (!found) {
    // System.out.println("Your target doesnt exist in the array");
    // }
    // }

    /*
     * VarArgs (variable arguments) in Java these are used in methods to let them
     * accept any amout of arguments without the need to create overloaded metthods
     */
    // System.out.println(add(1, 5, 2, 4, 8));
    // System.out.println(average(15, 15.2, 17, 33.5));
    // static int add(int... numbers){
    // int sum = 0;
    // for (int num : numbers) {
    // sum += num;
    // }
    // return sum;
    // }
    // static double average(double ... grades){
    // double sum = 0;
    // for (double num : grades) {
    // sum += num;
    // }
    // return sum/grades.length;
    // }
    // 2D arrays = An array where each element is an array useful for storing a
    // matrix of data
    // String[] fastfood = {"pizza" , "lasagna" , "spagetti"};
    // String[] vegetables = {"carrots" , "potattos" , "tomattos"};
    // String[] fruits = {"apple" , "orange" , "bannana"};
    // String[][] groceries = {
    // fastfood,
    // vegetables,
    // fruits,
    // };
    // // groceries[0][0] = "hello";
    // for (String[] foods : groceries) {
    // System.out.print("food to get :");
    // for (Object food : foods) {
    // System.out.print(food + " ");
    // }
    // System.out.println();
    // }
    // Array Lists : a resizeable array that stores objects or primitives
    // (autoboxing).
    // Arrays are fixed in size , but arraylists can change
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // System.out.println(list);
    // ArrayList<String> fruit = new ArrayList<>();
    // fruit.add("orange");
    // fruit.add("banana");
    // fruit.add("raisins");
    // fruit.remove(2);
    // Collections.sort(fruit);
    // for (String item : fruit) {
    // System.out.printf("the %s is good for your health \n" , item);
    // }
    // System.out.println(fruit);
    // there is a lot of arraylist methods , when you need them you can google them
    // Scanner scanner = new Scanner(System.in);
    // ArrayList<String> groceries = new ArrayList<>();
    // String item;
    // System.out.print("Enter the number of groceries you want :");
    // int numItems = scanner.nextInt();
    // int i = 1;
    // do {
    // System.out.print("Enter the item # " + i + ":");
    // item = scanner.next();
    // groceries.add(item);
    // i++;
    // } while (i <= numItems);
    // scanner.close();
    // System.out.println(groceries);
    // Exeption = An event that interrupts the normal flow of a programm (dividing
    // by 0 , file not found...)
    // Surround any dangerous code with a try{} block try{} , catch{} , finally{}
    // To handle an exeption we copy its name (after running the programm or
    // serching for it)
    // then write the code that will treat it in the catch block , we can use as
    // many catch as we want
    // Scanner scanner = new Scanner(System.in);
    // try {
    // System.out.print("Enter a number : ");
    // int num = scanner.nextInt();
    // System.out.println(num);
    // } catch (InputMismatchException e) {
    // System.out.println("You should enter a number idiot");
    // }
    // finally{
    // scanner.close();
    // System.out.println("the finnaly block always executes");
    // // finally is often used for clean up of the programm
    // }
    // In this part we will be working with DATES && TIMES using java
    // (LocalDate , LocalTime , LocalDateTime , UTC Timestamps)
    // LocalDate date = LocalDate.now(); // gives the day in this format
    // (year-mounth-day)
    // LocalTime time = LocalTime.now(); // gives the time in this format
    // (hour:min:seconds)
    // LocalDateTime dateTime = LocalDateTime.now(); // gives the date/time in this
    // format (year-mounth-dayThour:min:seconds)
    // Instant instant = Instant.now(); // gives the date/time in UTC time
    // Custom format for date/time
    // LocalDateTime dateTime1 = LocalDateTime.now();
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy
    // HH:mm:ss");
    // String newdate = formatter.format(dateTime1);
    // LocalDate date1 = LocalDate.of(2024, 12, 25); // this is to define a date of
    // our choice
    // LocalDate date2 = LocalDate.of(2025, 06, 30);
    // if (date1.isBefore(date2)) {
    // System.out.println(date1 + " is earlier than " + date2);
    // return;
    // } else if (date1.isAfter(date2)) {
    // System.out.println(date1 + " is after " + date2);
    // return;
    // }
    // System.out.println(date1 + " and " + date2 + " are the same day");
    // System.out.println(date);
    // System.out.println(time);
    // System.out.println(dateTime);
    // System.out.println(instant);
    // System.out.println(newdate);
    // Anonymous classes = A class that doesn t have a name . cannaot be reused.
    // Add custom behavior without having to create a new class.
    // We often use them when we are in the case of creating only one object that
    // doesn t have a class
    // Other used for one time uses (Timertask , Runnable , Callback)
    // Dog dog1 = new Dog("scooby"){
    // @Override
    // void dogName(){
    // System.out.println("the dog name is scooby do");
    // }
    // };
    // dog1.dogName();
    // Timer = Class that schedules tasks at specific times or periodically
    // Useful for: sending notifications , scheduled updates , repetitive actions
    // TimerTask = Represents the task that will be executed by the timer
    // You will extend the TimerTask class to define your task using annonymous
    // classes
    // Create a subclass of timertask and @Override run()
    // Timer timer = new Timer();
    // TimerTask task = new TimerTask() {
    // int count = 3;
    // @Override
    // public void run(){
    // System.out.println("the run method is ovveriden");
    // count--;
    // if(count == 0){
    // System.out.println("task complete");
    // timer.cancel();
    // }
    // }
    // };
    // //timer.schedule(task, 3000); // takes two arguments the task and the delay
    // in ms
    // timer.scheduleAtFixedRate(task, 100, 1000); // repeats the task every 1s
    // This is a small application of the timer and timertask classes in java
    // (countdown programm)
    // int seconds;
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter the number of seconds to countdown from : ");
    // seconds = scanner.nextInt();
    // Timer timer = new Timer();
    // TimerTask countdown = new TimerTask() {
    // int count = seconds;
    // @Override
    // public void run(){
    // System.out.println(count);
    // count--;
    // if (count == 0) {
    // System.err.println("Fuck off there is no new year for you !!!!");
    // timer.cancel();
    // }
    // }
    // };
    // timer.schedule(countdown, 0 , 1000);
    // scanner.close();

    // Generics = a concept where you can write a class , interface , or method
    // that is compatible with different data types.
    // <T , U> type parameter (placeholder that gets replaced with a real type) ,
    // and we can have more than one parm
    // <String> type argument (specifies the type)

    // ArrayList<String> fruits = new ArrayList<>(); // an example of using Generics
    // (<String> type argument)
    // using the Box class we created we will demonstrate how generics work
    // Box<String> box = new Box<>();
    // box.setItem("bananna");
    // System.out.println(box.getItem());
    // // See we can store any type in our class by using generics
    // Box<Integer> box1 = new Box<>();
    // box1.setItem(300);
    // System.out.println(box1.getItem());

    // // Now using multi parameters in the product class
    // Product<String , Integer> product1 = new Product<>();
    // product1.setName("umbrella");
    // product1.setPrice(399);

    // System.out.println("the price of the " + product1.getName() + " is " +
    // product1.getPrice());

    // Enums = (Enumerations) A special kind of class that represents a fixed set of
    // constants
    // They improve code readabiltiy and are easy to maintain.
    // More efficient with switches when comparing strings
    // We have created an enum class called Day that we will use in our
    // demonstration
    // Day day = Day.MONDAY;
    // System.out.println(day);
    // System.out.println(day.getDayNumber());

    // This is helpfull when working with switches
    // There is a way to get data from user ny the scanner and covert the string to
    // Day day = Day.valueOf(userInput)
    // switch (day) {
    // case SYNDAY -> System.out.println(day.getDayNumber());
    // case MONDAY -> System.out.println(day.getDayNumber());
    // case TUESDAY -> System.out.println(day.getDayNumber());
    // case WEDNESDAY -> System.out.println(day.getDayNumber());
    // case THURSDAY -> System.out.println(day.getDayNumber());
    // case FRIDAY -> System.out.println(day.getDayNumber());
    // case SATURDAY -> System.out.println(day.getDayNumber());
    // }

    // Threading = Allows a program to run multiple tasks simultaneouasly
    // helps improve performance with time-consumming operations
    // (File I/O , network communication , or any background tasks)

    // How to create a thread
    // Option 1 : Extend the Thread class (simpler)
    // Option 2 : Implement the Runnable interface (better)

    // Scanner scanner = new Scanner(System.in);

    // System.err.println("You have 5 seconds to enter your name !!!!");
    // MyRunnable myRunnable = new MyRunnable(); // create an object of the thread
    // we created
    // Thread thread = new Thread(myRunnable); // this is the line that lets your
    // run the other thread alongside the main one
    // thread.setDaemon(true); // this ends our other thread once the main thread is
    // finished
    // thread.start();// starts the other thread

    // System.err.println("Enter your name !!!");
    // String name = scanner.next();
    // System.out.println("hello " + name);

    // scanner.close();
}
