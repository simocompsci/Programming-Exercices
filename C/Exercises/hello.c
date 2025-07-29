#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

// float sircumference(int r); // this is needed so that the function can be detected and executed (called function prototype)

void printAge(int *pAge){
    printf("you are %d years old" ,  *pAge);
}

int main()
{
    // Pointer = a "variable-like" reference that holds a memeory address to another variable , 
    //           as a value to another variable , array , atc.
    //           * = indirection operator (value at adress)
    // Advantages of using Pointers :
    // Less time in program execution 
    // Working on the original execution 
    // With the help of pointers , we can create data structures (linked-list , queue)
    // Returning more than one value from functions
    // Searching and sorting large data very easily
    // Dynamically memory allocation
    
    int age = 21;
    int *pAge = &age; // we can use either ADDRESSOF or & to access adrress of variables

    // printf("adress of age : %p \n" , &age);
    // printf("value of pAge : %p \n" , pAge); // when we print the value of pAge we get that the value = adrees of age
    
    // printf("value of age : %d \n" , age);
    // printf("value of stored adress : %d \n" , *pAge);

    printAge(pAge);
    return 0;
};

// printf("back to relearning C , the goat as they say \n");
// int age = 22;
// float gpa = 17.37;
// char grade = 'A';
// // we can also write char a = 74; then when we decide to display it we can use %c(to display it as a char) or %d(to display it
// //as number int) its between -128 and 127 or use unsigned char (numbers from 0 - 255 )
// char name[] = "Mohammed"; // string type syntax
// double y = 3.124778985564156898945;
// bool isStudent = false;
// short int a = 700; // int between (-32768 and 32767)
// unsigned short int b = 30000; // (0-65535)
// long long int c = 932112225145458484849498498; // (-9 quintillion to 9 quintillion)
// unsigned long long int d = 180000000000000000000000; // (0 - 18 quintillion)

// if (isStudent)
// {
//     printf("Hi Everyone , my name is %s , i am %d years old , i have got a %f in my finals and a %c in overal grade " , name , age , gpa , grade);
//     return 0;
// }
// printf("I am a non educated indevidual");
// return 0;

// int age;
// printf("how old are you : ");
// scanf("%d" , &age); // this syntax is used to take input from user and store it in the age variable
// printf("you are %d years old" , age);
// return 0;

// char name[25];
// printf("enter your name : ");
// scanf("%s" , &name); // this syntax is to get a single string with no spaces or anything
// printf("your name is %s " , name);
// return 0;

// In the case the string is a long text that contains spaces
// printf("enter a text you want !!!");
// char text[100];
// fgets(text , sizeof(text) , stdin);
// printf(text);

// float sircumference(int r){ // this is how to define  a function
//     float result = r *2*3.14; // there is a lot of math functions wich we will revist later
//     return result;
// }

// conditionnals (the same as always)
// int age;
// printf("enter your age : ");
// scanf("%d" , &age);
// if (age >= 18)
// {
//     printf("you are an adult!!!!");
// }
// else{
//     printf("you are not an adult!!!!");
// }

// switchs
// we can not use strings with switchs (to know in the futur)
// char grade = 'F';
// switch (grade){
// case 'A':
//     printf("YOU R THE BEST");
//     break;
// case 'B':
//     printf("YOUR THE SECOND BEST");
//     break;
// case 'C':
//     printf("YOUR AVERAGE");
//     break;
// case'D':
//     printf("YOUR BELOW AVERAGE");
//     break;

// default:
// printf("YOU FAILED DUMDUM");
//     break;
// }

// These are some useful string methods as always

// char string1[] = "Mohammed";
// char string2[] = "Hassan";
// printf(strlwr(string1));
// printf(strupr(string1));
// printf("%d" , strlen(string1));
// printf(strcat(string1 , string2));
// printf(strcpy(string1 , string2));
// printf(strset(string1 , '?'));
// printf(strnset(string1 , '?' , 3));

// Loops as always the same thing
// for (int i = 10; i >= 0; i--)
// {
//     printf("%d \n" , i);
//     if (i == 0)
//     {
//         printf("happy new year");
//     }

// }
// while (0 != 1)
// {
//     printf("infinit loop!!!!");
// }

// double prices[] = {12.5 , 25.4 , 77.5}; // storing values in ana array
// double grades[5]; // or we can define them like this with no values and then assign them later not above 5
// // sizeof is an operator that returns the size of a varaible in bytes (in this case double is 8 bytes)
// for (int i = 0; i <sizeof(prices)/sizeof(prices[0]) ; i++) // a way to loop through elements of an array
// {
//     printf("$%.2f \t" , prices[i]);
// }

// 2D arrays
// int numbers[][3] = {{1,2,3} , {4,5,6}};

// int numbers[2][3];
// numbers[0][0] = 10;
// numbers[0][1] = 30;
// numbers[0][2] = 41;
// numbers[1][0] = 44;
// numbers[1][1] = 55;
// numbers[1][2] = 88;

// for (int i = 0; i < sizeof(numbers)/sizeof(numbers[0]); i++)
// {

//     for (int j = 0; j < sizeof(numbers[i])/sizeof(numbers[i][j]); j++)
//     {
//         printf("%d " , numbers[i][j]);
//     }
//     printf("\n");

// }

// Array of strings is like a 2d array
// char cars[][10] = {"Mustang", "camaro", "mercedes"};
// strcpy(cars[0] , "golf");
// for (int i = 0; i < sizeof(cars)/sizeof(cars[0]) ; i++)
// {
//     printf("%s \n" , cars[i]);
// }

// swapping variable values
// int x = 1;
// int y = 3;
// int z;

// z = x;
// x = y;
// y = z;
// printf("x :%d , y:%d" , x , y);

// char a[15] = "water"; // we added 15 because when we try to copy string b that is less than a it wont work
// char b[15] = "soda";
// char temp[15];

// strcpy(temp , a);
// strcpy(a , b);
// strcpy(b , temp);
// printf("a : %s , b:%s" , a ,b);

// You have just implemented bubble sort
// int array[] = {1, 8, 7, 6, 9, 5, 4, 77, 84, 85, 13};
// int temp;

// for (int i = 0; i < sizeof(array) / sizeof(array[0]); i++)
// {
//     for (int j = 0; j < sizeof(array) / sizeof(array[0]) - 1; j++)
//     {
//         if (array[j] > array[j + 1]) // if we want it in descending order we can change the operator to <
//         {
//             temp = array[j];
//             array[j] = array[j + 1];
//             array[j + 1] = temp;
//         }
//     }
// }

// for (int i = 0; i <= sizeof(array) / sizeof(array[0]) - 1 ; i++)
// {
//     printf("%d ", array[i]);
// }

// Structs = collection of related members (variables) they can be different data types listed under one name in a block of
//  memory . They are very semilar to classes in oop but dont contain methods

// struct User
// {
//     char name[25];
//     int age;
// };

// typedef char boba[20]; // this means a char array of 20 bytes will be named boba Ex: boba boba1 = "hihiih";
// // we often use typedef with structs
// typedef struct
// {
//     char name[25];
//     int score;

// } player;

// struct User user1 = {"simo" , 22};
// struct User user2 = {"ahmed" , 33};
// printf("%s is my name , and i am %d years old \n" , user1.name , user1.age);
// printf("%s is my name , and i am %d years old \n" , user2.name , user2.age);

// // typedef = a reserved keyword that gives an existing datatype a nickname
// player player1 = {"mohammed" , 20};
// player player2 = {"hasna" , 30};
// printf("%s is my name , and i scored %d \n" , player1.name , player1.score);
// printf("%s is my name , and i scored %d \n" , player2.name , player2.score);

// Array of structs
// typedef struct
// {
//     char name[20];
//     float gpa;
//     int age;

// } Student;

// Student student1 = {"hassan" , 3.55 , 20};
// Student student2 = {"wael" , 4.0 , 21};

// Student students[] = {student1 , student2};

// for (int i = 0; i < sizeof(students)/sizeof(students[0]) ; i++)
// {
//     printf("%s " , students[i].name);
//     printf("%.2f " , students[i].gpa);
//     printf("%d " , students[i].age);
//     printf("\n");
// }

// Enums in C
// we can declare them inside or outside the main function
// enum Day{SUN, MON, TUE, WED, THUR, FRI, SAT};
// or we can put enum Day{SUN = 1 , MON = 2 ....};
// enum Day today = MON;
// printf("%d" , today); // enums are treated like integers
// if (today == MON || SAT)
// {
//     printf("it s the weekend");
// }

// Pseudo random numbers = a set of values or elements that are statistically random
// (dont use these for any array sort or cryptographic security)
// srand(time(0)); // we use srand so that different nums get generated
// int num1 = (rand() % 6) + 1 ; // between 1-6
// printf("%d" , num1);

// Memory = an array of bytes within RAM
// Memory Block = a single (byte) within memory , used to hold some value
// Memory Adress = the adress of where a memory block is located

// char a = 'X';
// char b = 'E';
// char c = 'A';
// printf("%d \n" , sizeof(a));
// printf("%d \n" , sizeof(b));
// printf("%d \n" , sizeof(c));

// printf("%p \n" , _ADDRESSOF(a)); // these are the memory adresses in hexadecimal
// printf("%p \n" , _ADDRESSOF(b)); // in this example they are stored one after the other
// printf("%p \n" , _ADDRESSOF(c));

// char array[20];
// printf("%d \n" , sizeof(array)); // it prints 20 bytes 20 * 1byte of char (we can do the same to every datatype)