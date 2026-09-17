// problems on string


#include<stdio.h>


int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    
    // issue it will accept till first whitespace of string
    scanf("%s",Arr);       // here there is no need to use & 

    printf("Entered string is : %s\n",Arr);
   
    return 0;
}
