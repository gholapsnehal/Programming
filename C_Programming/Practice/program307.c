// BITWISE OPERATOR

// take number from user and check how many 1 are there in bit

#include<stdio.h>

int main()
{
    int iNo = 0, iCount = 0, iDigit = 0;

    printf("Enter number : \n");
    scanf("%d",&iNo);

    while(iNo != 0)
    {
        iDigit = iNo % 2;

        iCount = iCount + iDigit;
        
        iNo = iNo / 2;               
    }

    printf("Count : %d\n",iCount);


    return 0;
}