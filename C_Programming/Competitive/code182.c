/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           Integer
// Output:          void
// Description:     Display numbers from 1 to the given number using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    static int i = 1;

    if(i <= iNo)
    {
        printf("%d\t", i);
        i++;

        Display(iNo);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}