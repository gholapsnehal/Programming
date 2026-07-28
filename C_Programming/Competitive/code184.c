/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           Integer
// Output:          void
// Description:     Display uppercase alphabets from 'A' up to the given count using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    static char ch = 'A';

    if(iNo > 0)
    {
        printf("%c\t", ch);
        ch++;

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