#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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

 int main() {
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

    printf("\n=== 10. Pointer to Pointer ===\n");
    int y = 200; // 100
    int *py = &y; // 200
    int **ppy = &py; // 300
    int ***pppy = &ppy; // 400
    printf("y = %d, *py = %d, **ppy = %d , **pppy = %d\n", y, *py, **ppy , ***pppy);

    return 0;
}
