#include<stdio.h>

void CheckPalindrome(int iNo)
{
    int iDigit = 0;
    int iRev = 0;
    int iTemp = 0;

    iTemp = iNo;

    while(iNo != 0)
    {
        iDigit = iNo % 10;

        iRev = (iRev * 10) + iDigit;

        iNo = iNo / 10;
    }

    if(iRev == iTemp)
    {
        printf("Number is a pallindrome");
    }
    else
    {
        printf("Number is not a pallindrome");
    }
}

int main()
{ 
    int iValue = 0;
   
    printf("Enter the number: \n");
    scanf("%d",&iValue);

    CheckPallindrome(iValue);

    return 0;
}