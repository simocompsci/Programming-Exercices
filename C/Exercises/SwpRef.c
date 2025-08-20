#include <stdio.h>

void SwapByRef(int *x , int *y , int *z){
    int temp1;
    int temp2;
    temp1 = *x;
    *x = *y;
    *y = temp1;
    temp2 = *x;
    *x = *z;
    *z = temp2;

}

int main(){
    int a , b , c;
    int temp;
    printf("Enter 3 integers : \n");
    printf("Enter value of 1st element : ");
    scanf("%d" , &a);
    printf("Enter value of 2nd element : ");
    scanf("%d" , &b);
    printf("Enter value of 3rd element : ");
    scanf("%d" , &c);
    SwapByRef(&a , &b , &c);
    printf("The values after swapping are : \n");
    printf("the value of a is : %d \n" , a);
    printf("the value of b is : %d \n" , b);
    printf("the value of c is : %d \n" , c);


    return 0;
}