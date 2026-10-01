// accept number from user and accept position and toggle bit

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0xFFBFFFFF; //mask for 23 bit off
    UINT iNo = 0;
    

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iNo = iNo & iMask;

    printf("updated number : %d\n",iNo);


    return 0;
}

/*
when bit is off op will same as given
456789
updated number : 456789

C:\Users\HP\OneDrive\Desktop\LB>
*/