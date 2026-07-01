/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ToggleBit
// Input:           Number
// Output:          int
// Description:     Write a program which accepts one number from user and toggle 7th, 10th bit of 
//                  that number.Return modified number
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0x00000240;

    iNo = iNo ^ iMask;

    return iNo;

}

int main()
{
    UINT iValue = 0, iRet = 0;

    printf("Enter Number : \n");
    scanf("%u",&iValue);

    iRet = ToggleBit(iValue);

    printf("Modified Number : %u",iRet);


    return 0;
}