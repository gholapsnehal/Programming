#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0x1; // it is 1 in hex
    int iCnt = 0;


    for(iCnt = 1; iCnt <= 100; iCnt++)
    {
        printf("%d\t%X\n",iCnt,iCnt);

    }

   
    return 0;
}