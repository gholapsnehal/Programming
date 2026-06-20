/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ChkSmall
// Input:           char
// Output:          BOOL
// Description:     Accept character from user and check whether small case or not (a-z)
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

BOOL ChkSmall(char ch)
{
   if(ch >= 97 && ch <= 122)
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

    bRet = ChkSmall(cValue);

    if(bRet == TRUE)
    {
        printf("It is a small case character");
    }
    else
    {
        printf("It is not a small case character");
    }

    return 0;

}