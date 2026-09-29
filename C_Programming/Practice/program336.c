// accept number from user and accept position and toggle bit
// function
#include<stdio.h>

typedef unsigned int UINT;
// position : 4 (if 4th bit is on turn it off)

UINT OffBit(UINT iNo, UINT iPos)
{
    // logic

    UINT iMask = 0xFFFFFFF7;
    UINT iResult = 0;

    // input filter
    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;                        
    }

    iMask = iMask << (iPos - 1);

    iResult = iNo ^ iMask;

    return iResult;

}
 

int main()
{
    
    UINT iValue = 0;
    UINT iRet = 0;
    UINT iLocation = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    printf("Enter bit position : \n");
    scanf("%d",&iLocation);

    iRet = OffBit(iValue,iLocation);

    printf("Updated Number : %d\n",iRet);
   
    return 0;
}

