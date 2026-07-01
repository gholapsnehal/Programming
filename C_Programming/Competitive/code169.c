/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ToggleBitRange
// Input:           Number
// Output:          int
// Description:     Write a program which accept one number and range of positions from user. Toggle
//                  all bits from that range
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBitRange(UINT iNo, int iStart, int iEnd)
{
    UINT iMask = 0;
    int iCnt = 0;

    // input filter

    if((iStart < 1) || (iStart > 32) || (iEnd < 1) || (iEnd > 32) || (iEnd < iStart))
    {
        printf("Invalid Range\n");
        return iNo;
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iMask = iMask | (1 << (iCnt - 1));
    }

    iNo = iNo ^ iMask;

    return iNo;   
         
}

int main()
{
   UINT iValue = 0;
   UINT iNum1 = 0, iNum2= 0;

   UINT iRet = 0;
   
   
   printf("Enter Number : \n");
   scanf("%u",&iValue);

   printf("Enter start range bit : \n");
   scanf("%u",&iNum1);

   printf("Enter end range bit: \n");
   scanf("%u",&iNum2);

   iRet = ToggleBitRange(iValue,iNum1,iNum2);

   printf("Updated Number is : %u",iRet);

   return 0;
}