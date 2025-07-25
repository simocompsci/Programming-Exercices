#include <stdio.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>


// float sircumference(int r); // this is needed so that the function can be detected and executed (called function prototype)
int main()
{

    double prices[] = {12.5 , 25.4 , 77.5}; // storing values in ana array 
    double grades[5]; // or we can define them like this with no values and then assign them later not above 5
    // sizeof is an operator that returns the size of a varaible in bytes (in this case double is 8 bytes)
    for (int i = 0; i <sizeof(prices)/sizeof(prices[0]) ; i++) // a way to loop through elements of an array
    {
        printf("$%.2f \t" , prices[i]);
    }
    
    
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