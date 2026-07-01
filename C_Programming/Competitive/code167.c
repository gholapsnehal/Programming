/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckBit
// Input:           Number
// Output:          BOOL
// Description:     Write a program which accept one number from user and check whether 9th or 12th
//                  bit is on or off
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;

bool CheckBit(UINT iNo)
{
    UINT iMask = 0x00000900;
    UINT iResult = 0;

    iResult = iNo & iMask;

    if(iResult != 0)
    {
        return true;
    }
    else
    {
        return false;
    }  
       
}

int main()
{
   UINT iValue = 0;
   bool bRet = false;
   
   
   printf("Enter Number : \n");
   scanf("%u",&iValue);

   bRet = CheckBit(iValue);

   if(bRet == true)
   {
     printf("bit is ON");
   }
   else
   {
    printf("bit is OFF");
   }

   
   return 0;
}