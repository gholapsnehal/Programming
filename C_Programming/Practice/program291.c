//String :reverse string
#include<stdio.h>

void ReverseDisplay(char *str)
{
    char *start = NULL;

    start = str; // it holds base address 100

    while(*str != '\0')
    {
        str++;                // it will reach before \0 
    }

//ISSUE: it will display \0 also

    while(start <= str)
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