/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountWhiteSpace
// Input:           String
// Output:          Integer
// Description:     Count the total number of white spaces in a given string using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int CountWhiteSpace(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }

        str++;

        CountWhiteSpace(str);
    }

    return iCount;
}

int main()
{
    char Arr[30] = {'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s", Arr);

    iRet = CountWhiteSpace(Arr);

    printf("String : %s\n", Arr);
    printf("Total white spaces in a string : %d\n", iRet);

    return 0;
}