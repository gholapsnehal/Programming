/*
Write a program which accept area in square feet and convert it into square meter.
(1 square feet = 0.0929 square meter)

Square Meter = Square Feet * 0.0929

Input : 5
Output : 0.464515

Input : 7
Output : 0.650321
*/

#include<stdio.h>

double SquareMeter(int iValue)
{
    double dArea = 0.0;

    dArea = iValue * 0.0929;

    return dArea;
}

int main()
{
    int iValue = 0;
    double dRet = 0.0;

    printf("Enter area in square feet : ");
    scanf("%d",&iValue);

    dRet = SquareMeter(iValue);

    printf("Area in square meter is : %lf\n",dRet);

    return 0;
}

//Only one multiplication operation is performed.
//Time Complexity: O(1)