/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckBit
// Input:           int
// Output:          BOOL
// Description:     Write a program which checks whether 7th & 15th, 21st, 28th bit is ON or OFF.
// Date :           27/06/2026
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
    UINT iMask = 0x08104040;
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
        printf("7th, 15th, 21st and 28th bits are ON\n");
    }
    else
    {
        printf("One or more bits are OFF\n");
    }


    return 0;
}