/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ChkAlpha
// Input:           char
// Output:          BOOL
// Description:     Accept character from user and check whether it is aplhabet or not (A-Z a-z)
// Date:            19/06/2026
// Author:          Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

/*
Input : F
Output : TRUE
Input : &
Output : FALSE
*/

#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkAplha(char ch)
{
    if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    printf("Enter the character: \n");
    scanf("%c",&cValue);

    bRet = ChkAplha(cValue);

    if(bRet == TRUE)
    {
        printf("It is character");
    }
    else
    {
        printf("It is not a character");
    }

    return 0;

}