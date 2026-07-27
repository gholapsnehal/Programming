/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Min
// Input:           Integer
// Output:          Integer
// Description:     Return the smallest digit from a given number using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Min(int iNo)
{
    static int iMin = 9;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;

        if(iDigit < iMin)
        {
            iMin = iDigit;
        }

        iNo = iNo / 10;

        Min(iNo);
    }

    return iMin;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d", &iValue);

    iRet = Min(iValue);

    printf("Smallest digit in given number %d is %d\n", iValue, iRet);

    return 0;
}