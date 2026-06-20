//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Difference
// Input:           char
// Output:          int
// Description:     Program which accept string from user and return difference between frequency of small characters 
//                  and capital characters
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : MarvellouS
Output: 6 (8 - 2)                
*/

#include<stdio.h>

int Difference(char *str)
{
   int iCapitalCount = 0;
   int iSmallCount = 0;
   

   while(*str != '\0')
   {
      if(*str >= 'A' && *str <= 'Z')
      {
         iCapitalCount++;
      }
      else if(*str >= 'a' && *str <= 'z')
      {
         iSmallCount++;
      }
      str++;
   }

   return (iSmallCount - iCapitalCount);
   
}

int main()
{
   char Arr[20];
   int iRet = 0;

   printf("Enter string : \n");
   scanf("%[^'\n']s",Arr);

   iRet = Difference(Arr);

   printf("Difference between small and capital character : %d ",iRet);

   return 0;
  
}