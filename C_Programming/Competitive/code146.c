/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   StrCpy
// Input:           char
// Output:          void
// Description:     Program which accept string from user and copy small characters of that string
//                  into another string
// Date :           23/06/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : House Of The Dragon
        
output: Copied small Character : ousefheragon
*/

#include<stdio.h>

void StrCpySmall(char *src, char *dest)
{
   while(*src != '\0')
   {
      if((*src >= 'a') && (*src <= 'z'))
      {
         *dest = *src;
         dest++;
      }
      
      src++;
   }

   *dest = '\0';
     
}

int main()
{
   char arr[30];
   char brr[30];
  
   printf("Enter string : ");
   scanf("%[^'\n']s",arr);

   StrCpySmall(arr,brr);

   printf("Copied small Character : %s",brr);   

   return 0;

}

