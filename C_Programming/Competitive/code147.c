/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   StrCatX
// Input:           char
// Output:          void
// Description:     Program which 2 strings from user and concat second string after first string
//                  (Implement strcat() function)
// Date :           23/06/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : "Marvellous Infosystems"
         "Logic Building"
        
output: "Marvellous Infosystems Logic Building"
*/

#include<stdio.h>

void StrCatX(char *src, char *dest)
{

   while(*src != '\0')     // traverse first string till end
   {
      src++;
   }

   *src = ' ';
   src++;

   while(*dest != '\0')
   {
      *src = *dest;

      src++;
      dest++;
   }

   *src = '\0';     
}

int main()
{
   char arr[30] = "Marvellous Infosystems";
   char brr[30] = "Logic Building";
  
   StrCatX(arr,brr);

   printf("concatenated String: %s",arr);    // dest string copied to source

   return 0;

}

