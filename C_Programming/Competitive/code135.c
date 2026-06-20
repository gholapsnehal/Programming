//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Strtoggle
// Input:           char
// Output:          void
// Description:     Program which accept string from user and toggle the case
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Rest
Output : rEST 
*/

#include<stdio.h>

void Strtoggle(char *str)
{

   while(*str != '\0')
   {
      if(*str >= 97 && *str <= 122)
      {
         *str = *str - 32;        
      }
      else if(*str >= 65 && *str <= 90)
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

   Strtoggle(Arr);

   printf("Modified string is %s",Arr);


   return 0;
  
}