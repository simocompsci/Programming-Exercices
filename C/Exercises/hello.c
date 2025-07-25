#include <stdio.h>
#include <stdbool.h>

int main(){
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
    printf("enter a text you want !!!");
    char text[100];
    fgets(text , sizeof(text) , stdin);
    printf(text);



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