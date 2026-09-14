// range of integer in c and python

// overflow  
// left shift << value vadhne
// right shift >> value kami hote

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    //Smallest value of int 
    UINT iMask = 0x00000000; // it is 1 in hex 
   
    printf("%d\t%X\n",iMask,iMask); 


    return 0;
}