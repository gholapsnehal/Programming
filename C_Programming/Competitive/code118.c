/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ChkDigit
// Input:           char
// Output:          BOOL
// Description:     Accept character from user and check whether it is digit or not
// Date:            19/06/2026
// Author:          Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

/*
Input : 7
Output : TRUE
Input : d
Output : FALSE
*/

#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkDigit(char ch)
{
    if(ch >= 48 && ch <= 57)
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

    bRet = ChkDigit(cValue);

    if(bRet == TRUE)
    {
        printf("It is a digit");
    }
    else
    {
        printf("It is not a digit");
    }

    return 0;

}