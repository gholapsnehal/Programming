
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 1; // it is 1 in hex: 0x1
    int iCnt = 0;

    for(iCnt = 1; iCnt <= 32; iCnt++)   
    {

        printf("%d : %u\n",iCnt,iMask);    // u = unsigned                        
        iMask = iMask << 1;
    }


    return 0;
}