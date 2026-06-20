//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   UpperCase
// Input:           char
// Output:          void
// Description:     Program which accept string from user and convert it into upper case
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : marvellous
Output : MARVELLOUS 
*/

#include<stdio.h>

void UpperCase(char *str)
{

   while(*str != '\0')
   {
      if(*str >= 97 && *str <= 122)
      {
         *str = *str - 32;        
      }
      str++;
   }
   
}

int main()
{
   char Arr[20];
   
   printf("Enter string : \n");
   scanf("%[^'\n']s",Arr);

   UpperCase(Arr);

   printf("Modified string is %s",Arr);


   return 0;
  
}