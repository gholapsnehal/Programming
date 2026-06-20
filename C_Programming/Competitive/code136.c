//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   DisplayDigit
// Input:           char
// Output:          void
// Description:     Program which accept string from user and display only digit from that string
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : marvellous
Output : MARVELLOUS 
*/

#include<stdio.h>

void DisplayDigit(char *str)
{

   while(*str != '\0')
   {
   // if(*str >= 48 && *str <= 57)
      if(*str >= '0' && *str <= '9')
      {
         printf("%c",*str);
      }  
      str++;   
   }   
}

int main()
{
   char Arr[20];
   
   printf("Enter string : \n");
   scanf("%[^'\n']s",Arr);

   DisplayDigit(Arr);

   return 0;
  
}