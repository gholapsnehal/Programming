/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountSmallChar
// Input:           String
// Output:          Integer
// Description:     Count the total number of lowercase characters in a given string using recursion
// Date:            27/07/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int CountSmallChar(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCount++;
        }

        str++;

        CountSmallChar(str);
    }

    return iCount;
}

int main()
{
    char Arr[20] = {'\0'};
    int iRet = 0;

    printf("Enter String : ");
    scanf("%[^'\n']s", Arr);

    iRet = CountSmallChar(Arr);

    printf("Given String : %s\n", Arr);
    printf("Count of small characters in a string : %d\n", iRet);

    return 0;
}