#include <stdio.h>

int main(){
    int taille;
    int T[taille];
    do
    {
        printf("Enter la taille du tableau des entier !!! \n");
        scanf("%d" , &taille);
        for (int i = 0; i < taille; i++)
        {
            printf("Enter element %d du  tableau :" , i+1);
            scanf("%d" , &T[i]);
        }

        for (int i = 0; i < taille; i++)
        {
            printf("%d " , T[i]);
        }
        
        
    } while (taille <= 0);
    
}