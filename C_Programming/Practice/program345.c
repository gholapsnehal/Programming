 // user from number and togle bit from pos 12 and 23
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0x00400800; 
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