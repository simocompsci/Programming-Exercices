#include <stdio.h>

int ArraySum(int *arr, int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += *(arr + i); // the same as arr[i]
    }
    return sum;
}

int main()
{
    int n;
    int arr[n];
    printf("Input the number of elements to store in the array (max 10) : ");
    scanf("%d", &n);
    printf("Input %d number of elements in the array : ", n);
    printf("\n");
    for (int i = 0; i < n; i++)
    {
        printf("element - %d : ", i + 1);
        scanf("%d", &arr[i]);
    }
    int *ptr = arr;
    printf("the sum of the array is : %d\n", ArraySum(ptr, n));
    return 0;
}