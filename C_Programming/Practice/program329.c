// range of integer in c and python

// overflow  
// left shift << value vadhne
// right shift >> value kami hote

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    //largest value of int 
    UINT iMask = 0xFFFFFFFF; // it is 1 in hex 
   
    printf("%u\t%X\n",iMask,iMask); 


    return 0;
}