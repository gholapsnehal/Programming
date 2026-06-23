/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   StrCpy
// Input:           char
// Output:          void
// Description:     Program which accept string from user and copy capital characters of that string
//                  into another string
// Date :           23/06/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : House Of The Dragon
        
output: Copied Capital Character : HOTD
*/

#include<stdio.h>

void StrCpy(char *src, char *dest)
{
   while(*src != '\0')
   {
      if((*src >= 'A') && (*src <= 'Z'))
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

   StrCpy(arr,brr);

   printf("Copied Capital Character : %s",brr);   

   return 0;

}

