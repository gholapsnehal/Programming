/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckBit
// Input:           Number
// Output:          BOOL
// Description:     Write a program which accept one number, two positions from user and check whether
//                  bit at first or bit at second position is ON of OFF.
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;

bool CheckBit(UINT iNo, UINT iPos1, UINT iPos2)
{
    UINT iMask1 = 0x1;
    UINT iMask2 = 0x1;
    UINT iMask = 0;
    UINT iResult = 0;

    if(iPos1 < 1 || iPos1 > 32 || iPos2 < 1 || iPos2 > 32)
    {
        return false;
    }

    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1);

    iMask = iMask1 | iMask2;

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
   UINT iLocation1 = 0, iLocation2 = 0;

   bool bRet = false;
   
   
   printf("Enter Number : \n");
   scanf("%u",&iValue);

   printf("Enter first bit position : \n");
   scanf("%u",&iLocation1);

   printf("Enter second bit position : \n");
   scanf("%u",&iLocation2);

   bRet = CheckBit(iValue,iLocation1,iLocation2);

   if(bRet == true)
   {
     printf("first or second bit is ON\n");
   }
   else
   {
    printf("first or second bit is OFF\n");
   }

   
   return 0;
}