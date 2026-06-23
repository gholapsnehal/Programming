/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   StrNCpyX
// Input:           char
// Output:          void
// Description:     Program which accept string from user and copy the contents of that string into 
//                  another string (Implement strncpy() )
// Date :           23/06/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Marvellous Multi OS
        10
output: Marvellous   

Note : If third parameter is greater than size of source string then copy whole string into destination
*/

#include<stdio.h>

void StrNCpyX(char *src, char *dest, int iCnt)
{
   while((*src != '\0') && (iCnt != 0))
   {
      *dest = *src;

      src++;
      dest++;
      iCnt--;
   }

   *dest = '\0';
     
}

int main()
{
   char arr[30];
   char brr[30];
   int count = 0;

   printf("Enter string : ");
   scanf("%[^'\n']s",arr);

   printf("Enter count : ");
   scanf("%d",&count);

   StrNCpyX(arr,brr,count);

   printf("%s",brr);   

   return 0;

}

