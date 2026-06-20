//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountSmall
// Input:           char
// Output:          int
// Description:     Program which accept string from user and count number of small characters
// Date:            21/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Marvellous
Output: 9
                
*/
#include<stdio.h>

int CountSmall(char *str)
{
   int iCount = 0;

   // filter

   while(*str != '\0')
   {
      //if(*str >= 97 && *str <= 122)
        if(*str >= 'a' && *str <= 'z')
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

   iRet = CountSmall(Arr);

   printf("Small character : %d ",iRet);

   return 0;
  
}