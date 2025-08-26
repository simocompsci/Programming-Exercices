#include <stdio.h>
#include <string.h>

// int fun(int n){
//     if(n == 1){
//         return 1;
//     }
//     else return 1 + fun(n-1);
// }

// int main(){
//     int n = 3;
//     printf("%d\n" , fun(n));
//     return 0;
// }

// int rec(int n){
//     if (n == 6)
//     {
//         return 1;
//     }
//     printf("the level of recursion is : %d\n" , n);
//     rec(n + 1);
    
// }


int printChar(int count){
    if (count == 0)
    {
        return 1;
    }
    printf("#");
    return printChar(count - 1);
}

int mario(int n){
    if (n == 0)
    {
        return 1;
    }
    mario(n - 1);
    printChar(n);
    printf("\n");
    return 1;
}

int main(){
    int n = 5;  
    mario(n);
    return 0;
}

