#include<stdio.h>

// Declaration
#pragma pack(1)
struct Demo
{
    int i;  //4
    char ch;  // 1 
    float f;    //4
};                // 9 Byte

int main()
{
    struct Demo dobj;

    printf("%d\n",sizeof(dobj));  // 9  %lu to ingore error or -w flag


    return 0;
}
