#include <stdio.h>

void ArrayReverse(int *arr, int n)
{
    int temp;
    int mid = n / 2;
    for (int i = 0; i < mid; i++)
    {
        temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
    }

    printf("The reversed array is : \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d\n", arr[i]);
    }
}

int main()
{
    int n;
    printf("Input the number of elements to store in the array (max 15) : ");
    scanf("%d", &n);
    int arr[n];
    printf("Input %d number of elements in the array : ", n);
    printf("\n");
    for (int i = 0; i < n; i++)
    {
        printf("element - %d : ", i + 1);
        scanf("%d", &arr[i]);
    }
    int *ptr = arr;
    ArrayReverse(ptr, n);
    return 0;
}