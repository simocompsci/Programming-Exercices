#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    char word[20];
    printf("enter a string : ");
    fgets(word, 20, stdin);
    printf("%s", word);
    char *ptr = word;
    char vowels[] = "aoieyu";
    int vowelCount = 0;
    int consonantCount = 0;

    while (*ptr != '\0' && isalpha(*ptr))
    {
        char ch = tolower(*ptr);
        if (strchr(vowels, ch))
        {
            vowelCount++;
            ptr++;
        }
        else
        {
            consonantCount++;
            ptr++;
        }
    }

    printf("the number of vowels is : %d\n", vowelCount);
    printf("the number of consonants is : %d\n", consonantCount);

    return 0;
}