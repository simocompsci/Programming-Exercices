#include <stdio.h>

int CalculateFcto(int* a){
    int num = *a;
    int factorial = 1;
    for (int i = 1; i <= num ; i++)
    {
        factorial = factorial * i;
    }
    return factorial;

}

int main(){
    int num;
    printf("enter a number to calculate factorial !! ");
    scanf("%d" , &num);
    int *ptr = &num;
    printf("%d" , CalculateFcto(ptr));
    return 0;
}