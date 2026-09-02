#include<stdio.h>

// Declaration
struct Demo
{
    int i;  //4
    char ch;  // 1 -- Generates padding
    float f;    //4
};                // 12 

int main()
{
    struct Demo dobj;

    printf("%d\n",sizeof(dobj));  // 12 with padding %lu to ingore error or -w flag


    return 0;
}
