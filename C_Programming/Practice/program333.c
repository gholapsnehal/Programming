// accept number from user and accept position and toggle bit

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0x1;
    UINT iNo = 0;
    UINT iPos = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    printf("Enter bit position : \n");
    scanf("%d",&iPos);

    iMask = iMask << (iPos - 1);
   
    iNo = iNo ^ iMask;

    printf("updated number : %d\n",iNo);


    return 0;
}

/*
Enter number :
97
Enter bit position :
5
updated number : 113

*/