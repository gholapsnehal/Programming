// ARRAY 

#include<stdio.h>

int main()
{
    int Arr[] = {10,20,30,40,50};

    printf("%d\n",Arr);
    printf("%d\n",&Arr);             // address of whole array
    printf("%d\n",&Arr[0]);          // address of first element 0th index


    return 0;
}