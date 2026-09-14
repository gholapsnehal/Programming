// range of integer in c and python
// final code
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0x80000000; // it is 1 in hex 
    int iCnt = 0;

    for(iCnt = 1; iCnt <= 32; iCnt++)   
    {

        printf("%d : %X\n",iCnt,iMask);    // X = hex                        
        iMask = iMask >> 1;                // value kami hoel
    }


    return 0;
}