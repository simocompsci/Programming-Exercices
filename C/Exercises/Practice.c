#include <stdio.h>
int ValeurSuivanteDe_i()
{
    static int i = 0; // the static keyword keeps the value of i between function calls wich lets it iterate
                      // But if we remove static it creates an i = 0 each time and increments it to 1
    i++;
    return i;
}
int main()
{
    int i;
    for (i = 10; i > 0; i--)
    {
        printf("%d\n", ValeurSuivanteDe_i());
    }
}

// int a = 2, b = 3; /* Declaration des variables globales */
// int main()
// {
//     int F1(int);
//     a++;                   // Je change la valeur de la variable globale a
//     b--;                   // Je change la valeur de la variable globale b
//     printf("a = %d\n", a); /* Affichage de a */
//     printf("b = %d\n", b); /* Affichage de b */
//     b = F1(a);             // Je change les valeurs de a et b
//     printf("a = %d\n", a); /* Affichage de a */
//     printf("b = %d\n", b); /* Affichage de b */
// }
// int F1(int x)
// {
//     a++;
//     return (3 * a + b - x);
// }

// #include <stdio.h>

// int main(){
//     // int taille;
//     // int T[taille];
//     // do
//     // {
//     //     printf("Enter la taille du tableau des entier !!! \n");
//     //     scanf("%d" , &taille);
//     //     for (int i = 0; i < taille; i++)
//     //     {
//     //         printf("Enter element %d du  tableau :" , i+1);
//     //         scanf("%d" , &T[i]);
//     //     }

//     //     for (int i = 0; i < taille; i++)
//     //     {
//     //         printf("%d " , T[i]);
//     //     }

//     // } while (taille <= 0);

// }