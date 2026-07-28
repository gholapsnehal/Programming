#include<stdio.h>

int main()
{
    int a = 10;
    int b = 20;

    int *ptr = &a;

    ptr = &b;

    printf("%d\n",a);
    printf("%d\n",b);
    printf("%d\n",&a);
    printf("%d\n",ptr);

    printf("%d\n",*ptr);




    return 0;
}