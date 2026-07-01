/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ToggleBit
// Input:           Number
// Output:          int
// Description:     Write a program which accepts one number and one position from user and toggle that
//                  bit. Return modified number.
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, UINT ipos)
{
    UINT iMask = 0x1;
    
    // input filter
    if(ipos < 1 || ipos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;
    }

    iMask = iMask << (ipos - 1);

    iNo = iNo ^ iMask;

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

   iRet = ToggleBit(iValue,iLocation);

   printf("Modified Number : %u",iRet);


    return 0;
}