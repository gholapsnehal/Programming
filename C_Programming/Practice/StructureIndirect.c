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
    struct Demo *ptr = NULL;

    ptr = &dobj;

    ptr->i = 11;
    ptr->ch = 'A';
    ptr->f = 10.0f;

    printf("%d\n",ptr->i);  //11
    printf("%c\n",ptr->ch);  // A
    printf("%f\n",ptr->f);   // 10.0

    
    return 0;
}
