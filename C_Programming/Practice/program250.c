// problems on string
// how to pass string to function

// accept string from user and count frequency of a 

#include<stdio.h>

// strlenX() - user defined function

int Count(const char *str)
{
   int iCount = 0;

   while(*str != '\0')
   {
        if(*str == 'a')
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
       
    iRet = Count(Arr);

    printf("Frequency is: %d\n",iRet);
  
    return 0;
}
