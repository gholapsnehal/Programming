/*
Write a program which returns difference between Even factorial and odd factorial of given number.

Input : 5
Output : -7 (8 - 15) [EF: 4*2 = 8 and OF: 5*3*1 = 15 so diff: 8 - 15 = -7]

Input : -5
Output : -7 (8 - 15)

Input : 10
Output : 2895 (3840 - 945)
*/

#include<stdio.h>

int FactorialDiff(int iNo)
{
    int iCnt = 0;
    int iEvenFact = 1;
    int iOddFact = 1;

    // Input Updator

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = iNo; iCnt >=1; iCnt--)
    {
        if(iCnt % 2 == 0)
        {
            iEvenFact = iEvenFact * iCnt;
        }
        else
        {
            iOddFact = iOddFact * iCnt;
        }
    }

    return (iEvenFact - iOddFact);
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number: ");
    scanf("%d",&iValue);

    iRet = FactorialDiff(iValue);

    printf("Factorial difference is %d\n",iRet);

    return 0;
}

// Loop runs from n to 1.
// Time Complexity: O(n)