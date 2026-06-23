//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   FirstChar
// Input:           char
// Output:          int
// Description:     Program which accept string from user and accept one character and return index of first occurence of char
// Date:            23/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : House of the Dragon
char  : o
output: 1

Input : Marvellous Multi OS
char  : W
output: -1
*/

#include<stdio.h>

int FirstChar(char *str, char ch)
{
   int iIndex = 0;

   while(*str != '\0')
   {
      if(*str == ch)
      {
         return iIndex;
      }

      iIndex++;
      str++;
   }

   return -1;               // character not found
  
}

int main()
{
   char arr[20];
   char cValue;
   int iRet = 0;

   printf("Enter string : ");
   scanf("%[^'\n']s",arr);

   printf("Enter character to check first index occurrence: ");
   scanf(" %c",&cValue);

   iRet = FirstChar(arr,cValue);

   printf("First index occurrence of char %c is : %d",cValue,iRet);


   return 0;
}