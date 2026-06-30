/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   OffBit
// Input:           Number
// Output:          int
// Description:     Write a program which accepts one number from user and off 7th, 10th bit of                 
//                  that number.Return modified number
// Date :           29/06/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo)
{
    UINT iMask = 0xFFFFFDBF;

    iNo = iNo & iMask;

    return iNo;

}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter Number : \n");
    scanf("%u",&iValue);

    iRet = OffBit(iValue);

    printf("Modified Number : %u",iRet);


    return 0;
}