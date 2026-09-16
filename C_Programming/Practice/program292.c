//String :reverse string
#include<stdio.h>

void ReverseDisplay(char *str)
{
    char *start = NULL;  // start = another pointer

    start = str; // it holds base address 100

    while(*str != '\0')
    {
        str++;                // it will reach till last char \0 
    }

    str--;       // it will help to get back to before \0 char which will be last char of string

    while(start <= str)       // (100 <= 104 these compare with base address)
    {
        printf("%c\n",*str);
        str--;
    }

}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter String :\n");
    scanf("%[^'\n']s",Arr);

    ReverseDisplay(Arr);


    return 0;
}

// Time Complexity : O(2n)