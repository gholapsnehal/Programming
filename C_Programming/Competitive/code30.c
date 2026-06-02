/*
Write a program which accept number from user and display its table in reverse order.

Input : 2
Output :

20    18    16    14    12    10    8    6    4    2
*/

#include<stdio.h>

void TableRev(int iNo)
{
    int iCnt = 0;

    // input updator
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 10; iCnt >= 1;iCnt--)
    {
        printf("%d\t", iNo * iCnt);
    }

}

int main()
{
    int iValue = 0;

    printf("Enter the number: ");
    scanf("%d",&iValue);

    TableRev(iValue);

    return 0;
}

// Time Complexity: O(1)