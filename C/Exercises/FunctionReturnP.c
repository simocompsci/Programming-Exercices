#include <stdio.h>

int* MyFunction(int *a , int *b){
    if (*a > *b)
    {
        return a;
    }
    else
    {
        return b;
    }
    
}

int main(){
    int a , b;
    printf("Enter the first number : ");
    scanf("%d" , &a);
    printf("Enter the second number : ");
    scanf("%d" , &b);
    int *ptr1 = &a;
    int *ptr2 = &b;
    int *ptr3 = MyFunction(ptr1 , ptr2);
    printf("the biggest number between the two is : %d " , *ptr3);
    return 0;
}