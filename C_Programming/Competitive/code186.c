/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           Integer
// Output:          void
// Description:     Display the given number followed by '*' recursively up to 1
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    if(iNo > 0)
    {
        printf("%d\t*\t", iNo);

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