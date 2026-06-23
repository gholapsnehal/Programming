/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   StrRev
// Input:           char
// Output:          void
// Description:     Program which accept string from user and reverse that string in place
// Author:          Snehal Gholap
// Date :           23/06/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : abcd

output: dcba

Input : abba

output: abba
*/

#include<stdio.h>

void StrRev(char *str)
{
   char *start = NULL;
   char *end = NULL;
   char temp = '\0';

   start = str;

   while(*str != '\0')
   {
      str++;
   }

   str--;
   end = str;

   while(start < end)
   {
      temp = *start;
      *start = *end;
      *end = temp;

      start++;
      end--;
   }
  
}

int main()
{
   char arr[50] = {'\0'};
 
   printf("Enter string : ");
   scanf("%[^'\n']s",arr);

   StrRev(arr);

   printf("Updated string :%s",arr);

   return 0;

}

