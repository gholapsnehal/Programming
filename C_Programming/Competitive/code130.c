//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckVowel
// Input:           char
// Output:          bool
// Description:     Program which accept string from user and check whether it contains vowels or not using switch
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : MarvellouS
Output: true  

Input : xyz
Output: false 
*/

#include<stdio.h>
#include<stdbool.h>

bool CheckVowel(char *str)
{
   while(*str != '\0')
   {
      switch (*str)
      {
         case 'A':
         case 'E':
         case 'I':
         case 'O':
         case 'U':
         case 'a':
         case 'e':
         case 'i':
         case 'o':
         case 'u':
                 
                 return true;

      }
      str++;
   }
   return false;
     
}

int main()
{
   char Arr[20];
   bool bRet = false;

   printf("Enter string : \n");
   scanf("%[^'\n']s",Arr);

   bRet = CheckVowel(Arr);

   if(bRet == true)
   {
      printf("Contains vowel");     
   }
   else 
   {
      printf("There is no vowel");
   }
   
   return 0;
  
}