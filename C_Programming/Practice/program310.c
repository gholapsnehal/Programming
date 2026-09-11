// BITWISE OPERATOR

// 1. accept number from user and check whether its 3rd bit 1 or not

#include<stdio.h>

// we can use below typedef instead of writing unsigned 3 times
// we can use unsgined in bitwise so that all 32 bits get used

// typedef to create our data type: typedef is not a storage class

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 4;  
    UINT iAns = 0;

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