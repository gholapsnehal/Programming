/*
1
2
4
8
16
32
64
128
256
512
1024
2048
4096
8192
16384
32768
65536
131072
262144
524288
1048576
2097152
4194304
8388608
16777216
33554432
67108864
134217728
268435456
536870912
1073741824
*/
#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 1; // it is 1 in hex: 0x1
    int iCnt = 0;

    for(iCnt = 1; iCnt < 32; iCnt++)   // bcz we have 32 bits only 
    {

        printf("%d : %d\n",iCnt,iMask);                           
        iMask = iMask << 1;
    }


    return 0;
}