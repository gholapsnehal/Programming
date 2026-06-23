/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   LastChar
// Input:           char
// Output:          int
// Description:     Program which accept string from user and accept one character and return index of last occurence of char
// Date:            23/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : House of the Dragon
char  : o
output: 17

Input : Marvellous Multi OS
char  : W
output: -1
*/

#include<stdio.h>

int LastChar(char *str, char ch)
{
   int iIndex = 0;     // 
   int iPos = -1;      // to save index till get last one

   while(*str != '\0')
   {
      if(*str == ch)
      {
         iPos = iIndex;
      }

      iIndex++;
      str++;
   }

   return iPos;               
  
}

int main()
{
   char arr[20];
   char cValue;
   int iRet = 0;

   printf("Enter string : ");
   scanf("%[^'\n']s",arr);

   printf("Enter character to check last index occurrence: ");
   scanf(" %c",&cValue);

   iRet = LastChar(arr,cValue);

   printf("Last index occurrence of char %c is : %d",cValue,iRet);


   return 0;
}