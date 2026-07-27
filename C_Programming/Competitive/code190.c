/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ProductOfDigit
// Input:           Integer
// Output:          Integer
// Description:     Calculate the product of digits of a given number using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int ProductOfDigit(int iNo)
{
    static int iMult = 1;

    if(iNo > 0)
    {
        iMult = iMult * (iNo % 10);

        ProductOfDigit(iNo / 10);
    }

    return iMult;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    iRet = ProductOfDigit(iValue);

    printf("Product of digits of a number %d is %d\n", iValue, iRet);

    return 0;
}