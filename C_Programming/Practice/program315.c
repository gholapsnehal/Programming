// BITWISE OPERATOR

// 1. accept number from user and check whether 13th bit off or on

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x1000;  // 13th bit :hexadecimal
    UINT iAns = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("13th bit is ON\n");
    }
    else
    {
        printf("13th bit is OFF\n");
    }    


    return 0;
}