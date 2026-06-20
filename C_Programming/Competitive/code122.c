///////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           char
// Output:          void
// Description:     Accept character from user, if char is small display its corresponding capital character
//                  and if it is capital display its corresponding small, in other cases display as it is
// Date:            19/06/2026
// Author:          Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : Q
Output: q

Input : m
Output: M

Input : 4
Output: 4

*/

#include<stdio.h> 

void Display(char ch)
{
    if(ch >= 'a' && ch <= 'z')
    {
        printf("%c",ch - 32);
    }
    else if(ch >= 'A' && ch <= 'Z')
    {
        printf("%c",ch + 32);
    }
    else
    {
        printf("%c",ch);
    }   
}

int main()
{
    char cValue = '\0';

    printf("Enter character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}