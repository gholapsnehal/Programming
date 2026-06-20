//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountCapital
// Input:           char
// Output:          int
// Description:     Program which accept string from user and count number of capital characters
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Marvellous Multi OS
Output: 4
                
*/
#include<stdio.h>

int CountCapital(char *str)
{
   int iCount = 0;

   // filter

   while(*str != '\0')
   {
      //if(*str >= 65 && *str <= 90)
        if(*str >= 'A' && *str <= 'Z')
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

   iRet = CountCapital(Arr);

   printf("Capital character : %d ",iRet);

   return 0;
  
}