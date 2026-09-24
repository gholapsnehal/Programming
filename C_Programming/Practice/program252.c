// problems on string
// how to pass string to function

// accept string from user and count vowels(should be sensitive)

#include<stdio.h>

// strlenX() - user defined function

// case sensitive
int CountVowels(const char *str)
{
   int iCount = 0;

   while(*str != '\0')
   {
        if(*str == 'a' || *str == 'e' || *str == 'i' || *str == 'o' || *str == 'u')
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
       
    iRet = CountVowels(Arr);

    printf("Count of vowel is : %d\n",iRet);
  
    return 0;
}
