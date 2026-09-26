// accept number from user and accept position and toggle bit
// function
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo, UINT iPos)
{
    // logic

    UINT iMask = 0x1;
    UINT iResult = 0;

    // input filter
    if(iPos < 1 || iPos > 32)
    {
        printf("Invalid bit position\n");
        return iNo;                        //unsigned mule negative yenar nahi so ahe to number return hoel
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

    iRet = ToggleBit(iValue,iLocation);

    printf("Updated Number : %d\n",iRet);
   
    return 0;
}

