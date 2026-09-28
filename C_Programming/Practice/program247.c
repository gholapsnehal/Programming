// problems on string
// how to pass string to function

#include<stdio.h>

// strlenX() - user defined function

void strlenX(char *str)
{
    // it will replace every given string first charater with A
    //issue
    *str = 'A';

}


int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);
       
    strlenX(Arr);

    printf("String is : %s\n",Arr);
  
    return 0;
}
