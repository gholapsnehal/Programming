/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ChkCapital
// Input:           char
// Output:          BOOL
// Description:     Accept character from user and check whether it is capital or not
// Date:            19/06/2026
// Author:          Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

/*
Input : F
Output : TRUE
Input : d
Output : FALSE
*/

#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkCapital(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
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

    bRet = ChkCapital(cValue);

    if(bRet == TRUE)
    {
        printf("It is Capital");
    }
    else
    {
        printf("It is not a Capital");
    }

    return 0;

}