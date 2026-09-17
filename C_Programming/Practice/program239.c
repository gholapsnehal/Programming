// problems on string


#include<stdio.h>
#include<string.h>

int main()
{
    // same as char str[] = "Ganesh";

    char *str = "Ganesh"; // last \0 is there 
    int iCount = 0;

    printf("Length of string is : %lu\n",strlen(str));  // 6

    while(*str != '\0')
    {
       iCount++;    // strlen
       str++;
    }

    printf("Length of string is : %d\n",iCount);   // 6
   
      
    return 0;
}