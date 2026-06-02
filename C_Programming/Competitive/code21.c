// Write a program which accept number from user and print that number of $ and *

/*
Input : 5
Output :

$   *   $   *   $   *   $   *   $

Input : -3
Output :

$   *   $   *   $
*/

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;

    // Input updator
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("$\t*\t");
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    Pattern(iValue);                          // function call

    return 0;
}

// Time Complexity: O(n)