/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   StrCpyX
// Input:           char
// Output:          void
// Description:     Program which accept string from user and copy the contents of that string into 
//                  another string (Implement strcpy() function)
// Author:          Snehal Gholap
// Date :           23/06/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Marvellous Multi OS
output: Marvellous Multi OS       in another string
*/

#include<stdio.h>

void StrCpyX(char *src, char *dest)
{
   while(*src != '\0')
   {
      *dest = *src;

      src++;
      dest++;
   }

   *dest = '\0';
     
}

int main()
{
   char arr[20];
   char brr[20];

   printf("Enter string : ");
   scanf("%[^'\n']s",arr);

   StrCpyX(arr,brr);

   printf("copied string : %s",brr);   

   return 0;

}

