#include<stdio.h>

int main()
{ 
    int iValue = 0;
    int iTemp = 0;
    int iDigit = 0;
    int iRev = 0;

    printf("Enter the number: \n");
    scanf("%d",&iValue);

    iTemp = iValue;

    while(iValue != 0)
    {
        iDigit = iValue % 10;

        iRev = iRev * 10 + iDigit;

        iValue = iValue / 10;
    }

    if(iRev == iTemp)
    {
        printf("Number is pallindrome");
    }
    else
    {
        printf("Number is not pallindrome");
    }

    return 0;
}