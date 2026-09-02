#include<stdio.h>

struct Demo
{
    int i;   //4
    int *ptr;    //8

};               // 16 

int main()
{
    struct Demo dobj;

    printf("Size of object is : %lu\n",sizeof(dobj));  // either 8 byte or 16 byte

    
    return 0;
}
