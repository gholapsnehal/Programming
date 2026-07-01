/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   OffBit
// Input:           Number
// Output:          int
// Description:     Write a program which accepts one number and one position from user and off that
//                  bit. Return modified number.
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo, UINT ipos)
{
    UINT iMask = 0x1;
    
    // input filter
    if(ipos < 1 || ipos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;
    }

    iMask = iMask << (ipos - 1);

    iNo = iNo & (~iMask);

    return iNo;

}

int main()
{
   UINT iValue = 0;
   UINT iLocation = 0;
   UINT iRet = 0;

   printf("Enter Number : \n");
   scanf("%u",&iValue);

   printf("Enter bit position : \n");
   scanf("%u",&iLocation);

   iRet = OffBit(iValue,iLocation);

   printf("Modified Number : %d",iRet);


    return 0;
}