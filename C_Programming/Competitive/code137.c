//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountWhitespace
// Input:           char
// Output:          void
// Description:     Program which accept string from user and count number of white spaces
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Green Park
Output :  1
*/

#include<stdio.h>

int CountWhitespace(char *str)
{
   int iCount = 0;

   while(*str != '\0')
   {
      if(*str == ' ')
      {
         iCount++;
      }
     str++;
   }   
   return iCount;
}

int main()
{
   char Arr[20];
   int iRet = 0;
   
   printf("Enter string : \n");
   scanf("%[^'\n']s",Arr);

   iRet = CountWhitespace(Arr);

   printf("Whitespace count is : %d ",iRet);

   return 0;
  
}