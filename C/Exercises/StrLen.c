#include <stdio.h>

int main(){
    char phrase[20];
    int len = 0;
    printf("enter a string : ");
    fgets(phrase , 20 , stdin);
    char *ptr = phrase;
    while (*ptr != '\0')
    {
        ptr++;
        len++; 

    }
    printf("the length of the array is : %d  " , len - 1);
    
    return 0;
}