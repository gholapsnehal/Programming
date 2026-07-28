/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           Integer
// Output:          void
// Description:     Display '*' pattern recursively for the given number of times
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    if(iNo > 0)
    {
        printf("*\t");

        Display(iNo - 1);
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