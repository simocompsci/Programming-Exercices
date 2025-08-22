#include <stdio.h>

void Sort(int *Arr, int n)
{
    int temp;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - 1; j++)
        {
            if (Arr[j] > Arr[j + 1])
            {
                temp = Arr[j];
                Arr[j] = Arr[j + 1];
                Arr[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < n; i++)
    {
        printf("element - %d : %d\n", i + 1, Arr[i]);
    }
}

int main()
{
    int n;
    printf("Enter the number of elements to store in the array : ");
    scanf("%d", &n);
    int numbers[n];
    printf("Enter %d number/s of elements in the array : \n", n);
    for (int i = 0; i < n; i++)
    {
        printf("element - %d : ", i+1);
        scanf("%d", &numbers[i]);
        printf("\n");
    }
    int *ptr = numbers;
    Sort(ptr, n);

    return 0;
}