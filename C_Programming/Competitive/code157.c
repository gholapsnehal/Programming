/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   OnBit
// Input:           Number
// Output:          int
// Description:     Write a program which accepts one number from user and on its first 4 bits.
//                  Return modified number
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iMask = 0x0000000F;

    iNo = iNo | iMask;

    return iNo;

}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter Number : \n");
    scanf("%u",&iValue);

    iRet = OnBit(iValue);

    printf("Modified Number : %u",iRet);


    return 0;
}