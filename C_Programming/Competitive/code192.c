/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Max
// Input:           Integer
// Output:          Integer
// Description:     Return the largest digit from a given number using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Max(int iNo)
{
    static int iMax = 0;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit > iMax)
        {
            iMax = iDigit;
        }

        iNo = iNo / 10;

        Max(iNo);
    }

    return iMax;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d", &iValue);

    iRet = Max(iValue);

    printf("Largest digit in given number %d is %d\n", iValue, iRet);

    return 0;
}