//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ChkSpecial
// Input:           char
// Output:          void
// Description:     Accept character from user and check whether it is special symbol or not (!, @, #, $, %, ^, &, *)                 
// Date:            19/06/2026
// Author:          Snehal Gholap
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Input : %
Output: true

Input : d
Output: false

*/

#include<stdio.h>
#include<stdbool.h>

bool ChkSpecial(char ch)
{
    if(ch == '!' || ch == '@' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*')
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    char cValue = '\0';
    bool bRet = false;

    printf("Enter the character : ");
    scanf("%c",&cValue);

    bRet = ChkSpecial(cValue);

    if(bRet == true)
    {
        printf("It is special character");
    }
    else
    {
        printf("It is not a special character");
    }

    return 0;
  
}