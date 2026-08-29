// ARRAY STATIC using function

#include<stdio.h>

void Display(int Arr[])          // Arr[] internally treated as pointer
{
    printf("%d\n",*Arr);

    Arr++;

    printf("%d\n",*Arr);

    Arr++;

    printf("%d\n",*Arr);
}


int main()
{
    int Brr[5] = {10,20,30,40,50};

    Display(Brr);                 

    return 0;
}

