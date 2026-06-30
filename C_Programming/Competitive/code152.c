/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CheckBit
// Input:           int
// Output:          BOOL
// Description:     Write a program which checks whether first and last bit is on or off. First bits
//                  means bit number 1 and last bit means bit number 32.
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
    UINT iMask = 0x80000001;
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
        printf("1st and 32th bit are ON\n");
    }
    else
    {
        printf("bits are OFF\n");
    }


    return 0;
}