/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckBit
// Input:           int
// Output:          BOOL
// Description:     Write a program which checks whether 15th bit is ON or OFF.
// Date :           26/06/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL CheckBit(UINT iNo)
{
    UINT iMask = 0x00004000;     // 15th bit position
    UINT iAns = 0;

    iAns = iNo & iMask;

    if(iAns == iMask)
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
    BOOL bRet = FALSE;

    printf("Enter number : \n");
    scanf("%u",&iValue);

    bRet =CheckBit(iValue);

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