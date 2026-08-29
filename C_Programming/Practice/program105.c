// ARRAY STATIC using function

#include<stdio.h>

void Display(int *iPtr)
{
    printf("%d\n",*iPtr);
}


int main()
{
    int Arr[5] = {10,20,30,40,50};

    Display(Arr);                 

    return 0;
}

// *iPtr = Arr[0] = 10; where *iPtr is pointing to the data stored at base address 100 i.e 10.
// output = 10