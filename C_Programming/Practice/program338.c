// accept number from user and accept position and toggle bit

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0xFFFFEFFF; //mask for 13th bit off
    UINT iNo = 0;
    

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iNo = iNo & iMask;

    printf("updated number : %d\n",iNo);


    return 0;
}

