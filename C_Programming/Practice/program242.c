// problems on string
// how to pass string to function

#include<stdio.h>

void Display(char *str)
{
   printf("Input string is: %s\n",str);
}


int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);
    
    // will only pass one parameter here as base address no need to give second parameter lenght of string bcz it will autoly check till \n
    Display(Arr);


      
    return 0;
}
