// problems on string


#include<stdio.h>

int main()
{
    // same as char str[] = "Ganesh";

    char *str = "Ganesh"; // last \0 is there 
    int iCount = 0;

    while(*str != '\0')
    {
       iCount++;    // strlen
       str++;
    }

    printf("Length of string is : %d\n",iCount);
      

    return 0;
}