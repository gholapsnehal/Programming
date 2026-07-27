/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ReverseNumber
// Input:           Integer
// Output:          Integer
// Description:     Return the reverse of a given number using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int ReverseNumber(int iNo)
{
    static int iRev = 0;

    if(iNo != 0)
    {
        iRev = (iNo % 10) + (iRev * 10);

        ReverseNumber(iNo / 10);
    }

    return iRev;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number : ");
    scanf("%d", &iValue);

    iRet = ReverseNumber(iValue);

    printf("Given Number : %d\n", iValue);
    printf("Reversed Number : %d\n", iRet);

    return 0;
}