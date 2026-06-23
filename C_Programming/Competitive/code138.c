//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckChar
// Input:           char
// Output:          bool
// Description:     Program which accept string from user and accept one character. check whether that character is
//                  present or not
// Date:            23/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Green Park
char  : e
output: true
*/

#include<stdio.h>
#include<stdbool.h>

bool CheckChar(char *str, char ch)
{
   // string traversal

   while(*str != '\0')
   {
      if(*str == ch)
      {
         return true;
      }
      str++;
   }   

      return false;
}

int main()
{
   char arr[20];
   char cValue;
   bool bRet = false;

   printf("Enter string : ");
   scanf("%[^'\n']s",arr);

   printf("Enter character to check : ");
   scanf(" %c",&cValue);

   bRet = CheckChar(arr,cValue);

   if(bRet == true)
   {
      printf("character found\n");
   }
   else
   {
      printf("character not found\n");
   }


   return 0;
}