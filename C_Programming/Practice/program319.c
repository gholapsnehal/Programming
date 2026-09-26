#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iMask = 0x1; // it is 1 in hex
    int iCnt = 0;

    printf("%X\n",iMask);                           
    iMask = iMask << 1;

    printf("%X\n",iMask);                            
    iMask = iMask << 1;

    iMask = iMask << 1;

    printf("%X\n",iMask);       
    iMask = iMask << 1;

    printf("%X\n",iMask);         
    iMask = iMask << 1;

    printf("%X\n",iMask);          
    iMask = iMask << 1;

    printf("%X\n",iMask);     
    iMask = iMask << 1;

    printf("%X\n",iMask);     
    iMask = iMask << 1;

    printf("%X\n",iMask);         
    iMask = iMask << 1;

    printf("%X\n",iMask);   
    iMask = iMask << 1;

    printf("%X\n",iMask);    
    iMask = iMask << 1;

    printf("%X\n",iMask);    
    iMask = iMask << 1;

    printf("%X\n",iMask);    
    iMask = iMask << 1;




    return 0;
}