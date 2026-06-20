//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           char
// Output:          void
// Description:     Accept character from user and display its ASCII value in decimal, octal and hexadecimal format
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : A
Output: Decimal         65
        Octal           0101
        Hexadecimal     0X41 
*/
#include<stdio.h>

void Display(char ch)
{
    printf("Decimal is : %d\n",ch);
    printf("Octal is : %o\n",ch);
    printf("Hexadecimal is : 0X%X\n",ch);
}

int main()
{
    char cValue = '\0';
    
    printf("Enter the character : ");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
  
}