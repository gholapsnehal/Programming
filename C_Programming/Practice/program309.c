// BITWISE OPERATOR

// 1. accept number from user and check whether its 3rd bit 1 or not

#include<stdio.h>

int main()
{
    unsigned iNo = 0;
    unsigned iMask = 4;  
    unsigned iAns = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("3rd bit is ON\n");
    }
    else
    {
        printf("3rd bit is OFF\n");
    }    


    return 0;
}