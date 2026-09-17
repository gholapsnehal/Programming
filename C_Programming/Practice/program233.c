#include<stdio.h>

int main()
{
    // %s will print till it gets first \0
    char str[] = {'J','a','y','\0','G','a','n','e','s','h','\0'};

    printf("%s\n",str);

    return 0;
}