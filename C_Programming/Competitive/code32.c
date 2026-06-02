/*
Accept amount in US dollar and return its corresponding value in Indian currency.

Consider 1$ as 70 rupees.

Input : 10
Output : 700

Input : 3
Output : 210

Input : 1200
Output : 84000
*/

#include<stdio.h>

int DollarToINR(int iNo)
{
    int iValue = 0;

    iValue = iNo * 70;

    return iValue;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number of USD: ");
    scanf("%d",&iValue);

    iRet = DollarToINR(iValue);

    printf("Value in INR is %d\n",iRet);

    return 0;
}

/*
Only one multiplication operation is performed.

Time Complexity: O(1)
*/