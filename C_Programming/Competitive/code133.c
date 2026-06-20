//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   LowerCase
// Input:           char
// Output:          void
// Description:     Program which accept string from user and convert it into lower
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Marvellous OS
Output : marvellous os  
*/

#include<stdio.h>

void LowerCase(char *str)
{

   while(*str != '\0')
   {
      if(*str >= 65 && *str <= 90)
      {
         *str = *str + 32;        
      }
      str++;
   }
   
}

int main()
{
   char Arr[20];
   
   printf("Enter string : \n");
   scanf("%[^'\n']s",Arr);

   LowerCase(Arr);

   printf("Modified string is %s",Arr);


   return 0;
  
}