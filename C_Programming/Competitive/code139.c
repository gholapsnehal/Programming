//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountkChar
// Input:           char
// Output:          int
// Description:     Program which accept string from user and accept one character and return frequency of that char
// Date:            23/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : House of the Dragon
char  : o
output: 3
*/

#include<stdio.h>

int CountChar(char *str, char ch)
{
   // string traversal
   int iCount = 0;

   while(*str != '\0')
   {
      if(*str == ch)
      {
         iCount++;
      }
      str++;
   }   

   return iCount;
}

int main()
{
   char arr[20];
   char cValue;
   int iRet = 0;

   printf("Enter string : ");
   scanf("%[^'\n']s",arr);

   printf("Enter character to check frequency: ");
   scanf(" %c",&cValue);

   iRet = CountChar(arr,cValue);

   printf("Frequency of character %c is : %d",cValue,iRet);


   return 0;
}