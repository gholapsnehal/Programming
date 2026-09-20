// problems on string
// how to pass string to function
// accept string from user and count whitespace

#include<stdio.h>

// strlenX() - user defined function

int CountSpace(const char *str)
{
   int iCount = 0;

   while(*str != '\0')
   {
       if(*str == ' ')
       {
        iCount++;
       }  
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
       
    iRet = CountSpace(Arr);

    printf("whitespace Count is : %d\n",iRet);
  
    return 0;
}
