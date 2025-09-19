/* rocket.c
   Simple program that prints a colored ASCII-art rocket to the terminal.
   Compile: gcc -o rocket rocket.c
   Run:     ./rocket
   Note: ANSI colors work in most modern terminals (Linux, macOS, Windows 10+ with VT enabled).
*/

#include <stdio.h>

int main(void)
{
    /* ANSI escape codes for colors */
    const char *RESET = "\x1b[0m";
    const char *RED = "\x1b[31m";
    const char *YELLOW = "\x1b[33m";
    const char *BLUE = "\x1b[34m";
    const char *WHITE = "\x1b[37m";
    const char *CYAN = "\x1b[36m";

    printf("\n");
    printf("    %s/\\%s\n", WHITE, RESET);
    printf("   %s/  \\%s\n", WHITE, RESET);
    printf("  %s/____\\%s\n", WHITE, RESET);
    printf("  %s|%s%s  %s%s|%s\n", BLUE, RESET, YELLOW, RESET, BLUE, RESET);
    printf("  %s|%s %sROCKET%s %s|%s\n", BLUE, RESET, RED, RESET, BLUE, RESET);
    printf("  %s|%s%s____%s%s|%s\n", BLUE, RESET, YELLOW, RESET, BLUE, RESET);
    printf("  %s/ %s/  \\%s \\%s\n", WHITE, RESET, WHITE, RESET);
    printf(" / %s/____\\%s  \\%s\n", WHITE, RESET, RESET);
    printf("/_%s/______\\%s__\\%s\n", WHITE, RESET, RESET);
    printf("   %s|%s  %s|%s\n", CYAN, RESET, CYAN, RESET);
    printf("   %s|%s  %s|%s\n", CYAN, RESET, CYAN, RESET);
    printf("   %sV%s  %sV%s\n", RED, RESET, YELLOW, RESET);

    printf("\n");

    /* small decorative flame */
    printf("      %s.%s\n", YELLOW, RESET);
    printf("     %s/|\\%s\n", RED, RESET);
    printf("    %s/ | \\%s\n", RED, RESET);
    printf("   %s'  |  '%s\n", YELLOW, RESET);
    printf("      %s|%s\n", RED, RESET);
    printf("     %s/ \\%s\n", YELLOW, RESET);

    printf("\n");

    /* friendly footer */
    printf("%s   -- Happy Launch! --%s\n\n", WHITE, RESET);

    printf(" /\\_/\\  \n"); 
    printf("( o.o ) \n");   
    printf(" > ^ <  \n");

    return 0;
}
