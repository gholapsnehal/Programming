//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckVowel
// Input:           char
// Output:          bool
// Description:     Program which accept string from user and check whether it contains vowels or not
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
      if(*str == 'a' || *str == 'e' || *str == 'i' || *str == 'o' || *str == 'u' ||
         *str == 'A' || *str == 'E' || *str == 'I' || *str == 'O' || *str == 'U')
         {
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