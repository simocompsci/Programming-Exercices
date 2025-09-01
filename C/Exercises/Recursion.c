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


// int printChar(int count){
//     if (count == 0)
//     {
//         return 1;
//     }
//     printf("#");
//     return printChar(count - 1);
// }

// int mario(int n){
//     if (n == 0)
//     {
//         return 1;
//     }
//     mario(n - 1);
//     printChar(n);
//     printf("\n");
//     return 1;
// }

// prints all natural numbers from 1 to 50
// int prntN(int n){
//     if (n == 50)
//     {
//         return 50;
//     }
//     printf("%d " , n);
//     return prntN(n + 1);
    
// }
// int main(){
//     printf("%d " , prntN(1));
//     return 0;
// }


// int sumRec(int n){
//     if (n == 1)
//     {
//         return 1;
//     }
//     return n + sumRec(n - 1);
    
// }

//  int main(){
//     printf("%d\n" , sumRec(5));
//     return 0;
// }

// int PrintArr(int* arr , int n , int size){
//     if (n == size)
//     {
//         return n;
//     }
//     printf("%d\n" , arr[n]);
//     return PrintArr(arr , n +1 , size);
    
// }


// int main(){
//     int arr[] = {1,2,4,5,7};
//     int size = sizeof(arr)/sizeof(int);
//     int* ptr = arr;
//     int n = 0;
//     PrintArr(ptr , n , size);
//     return 0;
// }

int noOfDigits(int n1)
{
    static int ctr=0;

     if(n1!=0)
     {
          ctr++;
         noOfDigits(n1/10);
    }

    return ctr;
}

int main()
{
  int n1,ctr;
    printf("\n\n count the digits of a given number :\n");
	printf("-----------------------------------------\n");
    printf(" Input  a number : ");
    scanf("%d",&n1);

    ctr = noOfDigits(n1);

    printf(" The number of digits in the number is :  %d \n\n",ctr);
    return 0;
}

