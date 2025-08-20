#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number;
    printf("Input total number of elements (1 to 100) :");
    scanf("%d", &number);
    if (number <= 0 || number > 100)
    {
        printf("Enter a valid number (1 to 100)!!! \n");
        return 1;
    }
    else
    {
        int *ptr = malloc(sizeof(int) * number);
        int num = ptr[0];
        if (ptr == NULL)
        {
            printf("Allocation Failed !!!");
            exit(0);
        }
        for (int i = 0; i < number; i++)
        {
            printf("Number %d :", i + 1);
            scanf("%d", &ptr[i]);
            if (num <= ptr[i])
            {
                num = ptr[i];
            }
        }
        printf("the largest element is : %d ", num);

        free(ptr);
    }

    return 0;
}