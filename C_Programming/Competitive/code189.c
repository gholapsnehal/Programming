/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Factorial
// Input:           Integer
// Output:          Integer
// Description:     Calculate the factorial of a given number using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Factorial(int iNo)
{
    static int iFact = 1;

    if(iNo > 0)
    {
        iFact = iFact * iNo;

        Factorial(iNo - 1);
    }

    return iFact;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    iRet = Factorial(iValue);

    printf("Factorial of given number %d is %d\n", iValue, iRet);

    return 0;
}