// problems on string


#include<stdio.h>

int main()
{
    // same as char str[] = "Ganesh";

    char *str = "Ganesh"; // last \0 is there 

    // Loop
    
    while(*str != '\0')
    {
        printf("%c\n",*str);
        str++;
    }
      

    return 0;
}