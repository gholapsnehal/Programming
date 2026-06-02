/*
Write a program to find even factorial of given number.

Input : 5
Output : 8 (4 * 2)

Input : -5
Output : 8 (4 * 2)

Input : 10
Output : 3840 (10 * 8 * 6 * 4 * 2)
*/

#include<stdio.h>

int EvenFactorial(int iNo)
{
    int iCnt = 0;
    int iFact = 1;          // if assigns with 0 will get 0 in every result.

    // input updator

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = iNo; iCnt >= 1; iCnt--)
    {
        if(iCnt % 2 == 0)
        {
            iFact = iFact * iCnt;
        }
    }

    return iFact;

}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number: ");
    scanf("%d",&iValue);

    iRet = EvenFactorial(iValue);

    printf("Even factorial of number is %d\n",iRet);

    return 0;
}

/*
Loop runs from n to 1.

Time Complexity: O(n)
*/