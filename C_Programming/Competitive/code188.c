/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountChar
// Input:           String
// Output:          Integer
// Description:     Count the total number of characters in a given string using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int CountChar(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        iCount++;

        str++;

        CountChar(str);
    }

    return iCount;
}

int main()
{
    char arr[20] = {'\0'};
    int iRet = 0;

    printf("Enter a string : ");
    scanf("%[^'\n']s", arr);

    iRet = CountChar(arr);

    printf("Characters in string : %d\n", iRet);

    return 0;
}