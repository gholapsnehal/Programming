/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Sum
// Input:           Integer
// Output:          Integer
// Description:     Calculate the summation of digits of a given number using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Sum(int iNo)
{
    static int iSum = 0;
    int Digit = 0;

    if(iNo != 0)
    {
        Digit = iNo % 10;

        iSum = iSum + Digit;

        iNo = iNo / 10;

        Sum(iNo);
    }

    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    iRet = Sum(iValue);

    printf("Summation of digits in number %d is %d\n", iValue, iRet);

    return 0;
}