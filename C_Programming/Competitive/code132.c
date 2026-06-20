//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Reverse
// Input:           char
// Output:          void
// Description:     Program which accept string from user and display in reverse order
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : MarvellouS
Output: SuollevraM   
*/

#include<stdio.h>

void Reverse(char *str)
{
   char *cStart = str;   // to store string's first character

   while(*str != '\0')
   {
      str++;
   }   
   str--;

   while(str >= cStart)
   {
      printf("%c",*str);
      str--;
   }

}

int main()
{
   char Arr[20];
   
   printf("Enter string : \n");
   scanf("%[^'\n']s",Arr);

   Reverse(Arr);


   return 0;
  
}