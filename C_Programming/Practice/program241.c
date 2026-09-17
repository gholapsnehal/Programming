// problems on string


#include<stdio.h>


int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    
    // regular expression [regx]

    // it will stop when it will get \n means enter
    // special scanf()
    scanf("%[^'\n']s",Arr);  

    printf("Entered string is : %s\n",Arr);
   
    return 0;
}
