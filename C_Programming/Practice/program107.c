// ARRAY STATIC using function

#include<stdio.h>

void Display(int iPtr[])          // iptr[] == pointer 
{
    printf("%d\n",*iPtr);

    iPtr++;

    printf("%d\n",*iPtr);

    iPtr++;

    printf("%d\n",*iPtr);
}


int main()
{
    int Arr[5] = {10,20,30,40,50};

    Display(Arr);                 

    return 0;
}

