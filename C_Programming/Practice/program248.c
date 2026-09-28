// problems on string
// how to pass string to function

#include<stdio.h>

// strlenX() - user defined function

int strlenX(char * const str)
{
    int iCount = 0;

   while(*str != '\0')
   {
        iCount++;
        // error
        str++;   
   }

   return iCount;

}


int main()
{
    char Arr[50] = {'\0'};
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);
       
    iRet = strlenX(Arr);

    printf("Length of string is : %d\n",iRet);
  
    return 0;
}
