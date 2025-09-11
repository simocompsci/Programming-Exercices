#include <stdio.h>

int fibo(int n)
    {
        if (n <= 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
int main()
{
    printf("%d", fibo(7)); 
    return 0;
}