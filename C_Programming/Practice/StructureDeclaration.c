#include<stdio.h>

// Declaration
struct Demo
{
    int i;   // 4
    float f;    //4
};                //8

int main()
{
    struct Demo dobj;

    printf("%d\n",sizeof(dobj));  //8 %lu to ingore error or -w flag


    return 0;
}
