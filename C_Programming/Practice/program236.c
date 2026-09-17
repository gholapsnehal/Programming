// problems on string


#include<stdio.h>

int main()
{
    // same as char str[] = "Ganesh";

    char *str = "Ganesh"; // last \0 is there 

    printf("%c\n",*str);
    str++;

    printf("%c\n",*str);
    str++;

    printf("%c\n",*str);
    str++;

    printf("%c\n",*str);
    str++;

    printf("%c\n",*str);
    str++;

    printf("%c\n",*str);
    str++;
      

    return 0;
}