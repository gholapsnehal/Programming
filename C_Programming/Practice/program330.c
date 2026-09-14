// accept number from user and toggle 4th bit of that number

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0;
    UINT iNo = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    iMask = 0x00000008; //hex

    iNo = iNo ^ iMask;

    printf("updated number : %d\n",iNo);


    return 0;
}

/*
Enter number :
44
updated number : 36     

Enter number :
36
updated number : 44
*/