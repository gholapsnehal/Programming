// accept number from user and accept position and toggle bit

// 1 0 1 1 1 0 0 0 0
// 0 1 0 0 0 
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0xFFFFFFBF;   // bit 1 asel tr ~ 0 krel

    printf("Before : %X\n",iMask);

    iMask = ~iMask;

    printf("After : %X\n",iMask);

    return 0;
}

/*
Before : FFFFFFBF
After : 40
*/