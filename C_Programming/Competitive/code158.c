/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckBit
// Input:           Number
// Output:          BOOL
// Description:     Write a program which accepts one number and one position from user and check whether
//                  bit at that position is on or off. If bit is one return TRUE else FALSE
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;
typedef unsigned int UINT;

BOOL CheckBit(UINT iNo,UINT ipos)
{
    UINT iMask = 0x1;
    UINT iResult = 0;

    // input filter
    if(ipos < 1 || ipos > 32)
    {
        printf("Invalid bit position\n");
        return FALSE;
    }

    iMask = iMask << (ipos - 1);

    iResult = iNo & iMask;

    if(iResult == iMask)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }   

}

int main()
{
   UINT iValue = 0;
   UINT iLocation = 0;
   BOOL bRet = FALSE;

   printf("Enter Number : \n");
   scanf("%u",&iValue);

   printf("Enter bit position : \n");
   scanf("%u",&iLocation);

   bRet = CheckBit(iValue,iLocation);

   if(bRet == TRUE)
   {
    printf("Bit is ON\n");
   }
   else
   {
    printf("Bit is OFF\n");
   }

    return 0;
}