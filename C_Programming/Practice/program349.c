 // user from number and togle bit from pos 3 and 8
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask1 = 0x1; // pos = 3
    UINT iMask2 = 0x1; // pos = 8
    UINT iMask = 0; 

    UINT iNo = 0;
    UINT iResult = 0;
    
    printf("Enter number : \n");
    scanf("%d",&iNo);

    iMask1 = iMask1 << 2;
    iMask2 = iMask2 << 7;
    
    iMask = iMask1 | iMask2;

    iResult = iNo ^ iMask;

    printf("Updated number : %d\n",iResult);

  
    return 0;
}

