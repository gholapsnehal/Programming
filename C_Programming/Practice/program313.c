// BITWISE OPERATOR

// 1. accept number from user and check whether 17th bit is on or off

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x00010000;  // 13th bit = always use hexadecimal value
    UINT iAns = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iAns = iNo & iMask;

    if(iAns == iMask)
    {
        printf("17th bit is ON\n");
    }
    else
    {
        printf("17th bit is OFF\n");
    }    


    return 0;
}

/*
Enter number :
141961
17th bit is OFF
*/