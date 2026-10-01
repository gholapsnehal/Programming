 // user from number and togle bit from pos 9 and 17
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0x00010100; 
    UINT iNo = 0;
    UINT iResult = 0;
    
    printf("Enter number : \n");
    scanf("%d",&iNo);

    iResult = iNo ^ iMask;

    printf("Updated number : %d\n",iResult);

  
    return 0;
}

/*
Before : FFFFFFBF
After : 40
*/