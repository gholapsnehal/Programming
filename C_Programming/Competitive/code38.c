/*
Write a program which accept distance in kilometer and convert it into meter.
(1 kilometer = 1000 Meter)

formula: Meter=Kilometer×1000

Input : 5
Output : 5000

Input : 12
Output : 12000
*/

#include<stdio.h>

int KMtoMeter(int iNo)
{
    int iMeter = 0;

    iMeter = iNo * 1000;

    return iMeter;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter distance in Kilometer : ");
    scanf("%d",&iValue);

    iRet = KMtoMeter(iValue);

    printf("Distance in meter is : %d\n",iRet);

    return 0;
}

//Only one multiplication operation is performed.
//Time Complexity: O(1)