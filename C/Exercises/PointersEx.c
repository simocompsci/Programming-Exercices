#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

// // Function that takes a pointer to int and modifies the value
// void increment(int *p) {
//     (*p)++;
// }

// // Function that demonstrates passing an array as a pointer
// void printArray(int *arr, size_t size) {
//     for (size_t i = 0; i < size; i++) {
//         printf("%d ", arr[i]); // arr[i] is *(arr + i)
//     }
//     printf("\n");
// }

// // Function pointer example
// int add(int a, int b) {
//     return a + b;
// }

// int maximum(int* a, int* b)
// {
//     return (*a > *b) ? *a : *b;
// }

// void printArr(int* Arr , int n){
//     for (size_t i = 0; i < n; i++)
//     {
//         printf("Element - %d : %d \n" , i, Arr[i]);
//     }
// }

// void swap(char *x, char *y)
// {
//     char temp = *x;
//     *x = *y;
//     *y = temp;
// }

// void permute(char *str, int l, int r)
// {
//     if (l == r) {
//         printf("%s\n", str);
//     } else {
//         for (int i = l; i <= r; i++) {
//             swap(&str[l], &str[i]);     // swap current index with i
//             permute(str, l + 1, r);     // recurse
//             swap(&str[l], &str[i]);     // backtrack
//         }
//     }
// }

int main()
{
    //     printf("=== 1. Basic Pointer Declaration and Dereferencing ===\n");
    //     int x = 42;
    //     int *ptr = &x; // Pointer stores the address of x
    //     printf("x = %d, &x = %p, ptr = %p, *ptr = %d\n", x, &x, ptr, *ptr);

    //     *ptr = 100; // Change x via pointer
    //     printf("After *ptr = 100, x = %d\n", x);

    //     printf("\n=== 2. NULL Pointers ===\n");
    //     int *nullPtr = NULL;
    //     if (nullPtr == NULL) {
    //         printf("nullPtr is NULL, cannot dereference!\n");
    //     }

    //     printf("\n=== 3. Pointer Arithmetic with Arrays ===\n");
    //     int arr[5] = {10, 20, 30, 40, 50};
    //     int *pArr = arr; // Points to first element
    //     printf("First element: %d\n", *pArr);
    //     pArr++; // Move to next element
    //     printf("Second element via pointer arithmetic: %d\n", *pArr);

    //     printf("Printing array using pointer arithmetic: ");
    //     for (int i = 0; i < 5; i++) {
    //         printf("%d ", *(arr + i));
    //     }
    //     printf("\n");

    //     printf("\n=== 4. Pointers and Strings ===\n");
    //     char str[] = "Hello";
    //     char *pStr = str;
    //     while (*pStr) { // Loops until *pStr == '\0'
    //         printf("%c ", *pStr);
    //         pStr++;
    //     }
    //     printf("\n");

    //     printf("\n=== 5. Passing Pointers to Functions ===\n");
    //     int value = 5;
    //     printf("Before increment: %d\n", value);
    //     increment(&value);
    //     printf("After increment: %d\n", value);

    //     printf("\n=== 6. Pointers to Arrays and Multi-dimensional Arrays ===\n");
    //     int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};
    //     int (*pMatrix)[3] = matrix; // Pointer to an array of 3 ints
    //     printf("matrix[1][2] via pointer: %d\n", pMatrix[1][2]); // or *(*(pMatrix + 1) + 2)

    //     printf("\n=== 7. const Pointers and Pointer to const ===\n");
    //     const int constValue = 10;
    //     const int *ptrToConst = &constValue; // Can't change the value through this pointer
    //     // *ptrToConst = 20; // ERROR: not allowed
    //     int modifiableValue = 50;
    //     int *const constPtr = &modifiableValue; // Can't change the pointer itself
    //     *constPtr = 60; // But can modify the value
    //     printf("constPtr value: %d\n", *constPtr);

    //     printf("\n=== 8. Dynamic Memory Allocation ===\n");
    //     int *dynArr = (int *)malloc(5 * sizeof(int));
    //     if (!dynArr) {
    //         printf("Memory allocation failed!\n");
    //         return 1;
    //     }
    //     for (int i = 0; i < 5; i++) {
    //         dynArr[i] = i * 10;
    //     }
    //     printf("Dynamic array: ");
    //     printArray(dynArr, 5);
    //     free(dynArr);

    //     printf("\n=== 9. Pointers to Functions ===\n");
    //     int (*funcPtr)(int, int) = add;
    //     printf("add(2, 3) via function pointer: %d\n", funcPtr(2, 3));

    // printf("\n=== 10. Pointer to Pointer ===\n");
    // int y = 200; // 100
    // int *py = &y; // 200
    // int **ppy = &py; // 300
    // int ***pppy = &ppy; // 400
    // printf("y = %d, *py = %d, **ppy = %d , **pppy = %d\n", y, *py, **ppy , ***pppy);

    // int m = 10, n, o;
    // int *z = &m; // Declaring an integer pointer z and assigning the address of m to it

    // // Printing basic information about pointers and variables
    // printf("\n\n Pointer : Show the basic declaration of pointer :\n");
    // printf("-------------------------------------------------------\n");
    // printf(" Here is m=10, n and o are two integer variable and *z is an integer");
    // printf("\n\n z stores the address of m  = %p\n", z); // Printing the address stored in z using %p
    // printf("\n *z stores the value of m = %i\n", *z); // Printing the value pointed to by z using *z
    // printf("\n &m is the address of m = %p\n", &m); // Printing the address of m using &m
    // printf("\n &n stores the address of n = %p\n", &n); // Printing the address of n using &n
    // printf("\n &o  stores the address of o = %p\n", &o); // Printing the address of o using &o
    // printf("\n &z stores the address of z = %p\n\n", &z); // Printing the address of z using &z

    // int* ab; // Declare a pointer variable ab
    // int c;   // Declare an integer variable m

    // m = 29; // Assign the value 29 to the variable m

    // printf("\n\n Pointer : How to handle the pointers in the program :\n");
    // printf("------------------------------------------------------------\n");
    // printf(" Here in the declaration ab = int pointer, int m = 29\n\n");

    // printf(" Address of m : %p\n", &c); // Print the address of variable m
    // printf(" Value of m : %d\n\n", c); // Print the value of variable m

    // ab = &m; // Assign the address of m to the pointer variable ab

    // printf(" Now ab is assigned with the address of m.\n");
    // printf(" Address of pointer ab : %p\n", ab);      // Print the address stored in pointer ab
    // printf(" Content of pointer ab : %d\n\n", *ab);   // Print the value pointed to by ab

    // m = 34; // Assign the value 34 to the variable m

    // printf(" The value of m assigned to 34 now.\n");
    // printf(" Address of pointer ab : %p\n", ab);      // Print the address stored in pointer ab
    // printf(" Content of pointer ab : %d\n\n", *ab);   // Print the value pointed to by ab

    // *ab = 7; // Assign the value 7 to the variable pointed by ab

    // printf(" The pointer variable ab is assigned the value 7 now.\n");
    // printf(" Address of m : %p\n", &c);               // Print the address of variable m
    //                                                   // as ab contains the address of m
    //                                                   // *ab changed the value of m and now m becomes 7
    // printf(" Value of m : %d\n\n", c);                // Print the value of variable m
    // int a = 20 , b = 11;
    // printf("%d" , maximum(&a , &b));

    // printf("Input the number of elements to store in the array : \n");
    // int n;
    // scanf("%d" , &n);
    // int Numbers[n];
    // printf("Input %d number of elements in the array : \n" , n);
    // for (size_t i = 0; i < n; i++)
    // {
    //     printf("Element - %d : \n" , i);
    //     scanf("%d" , &Numbers[i]);
    // }
    // printArr(Numbers , n);

    // char str[] = "ABC";
    // int n = strlen(str);
    // printf("The permutations of the string are : \n");
    // permute(str, 0, n - 1);

    

    return 0;
}
