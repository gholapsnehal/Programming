/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           Integer
// Output:          void
// Description:     Display numbers from the given number to 1 using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    if(iNo > 0)
    {
        printf("%d\t", iNo);

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