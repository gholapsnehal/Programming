// BITWISE OPERATOR
// static mask designing

// 1. accept number from user and check whether 7th bit off or on

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x40;  // 7th bit ....7th = 4
    UINT iAns = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("7th bit is ON\n");
    }
    else
    {
        printf("7th bit is OFF\n");
    }    


    return 0;
}