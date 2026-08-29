// ARRAY STATIC using function

#include<stdio.h>

void Display(int *iPtr)
{
    printf("Value of iPtr: %d\n",iPtr);
}


int main()
{
    int Arr[5] = {10,20,30,40,50};

    printf("Base address of Arr: %d\n",Arr);

    Display(Arr);                  // Lvalue : 100

    return 0;
}

