
///////////////////////////////////////////////////////////////////////////////
//
// Function name:   Pattern
// Input:           Number
// Output:          void
// Description:     Accept number from user and display in alphabetical pattern
// Date:            12/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

/* Pattern:
Enter number: 
5
A       B       C       D       E
*/

#include<stdio.h>

void Pattern(int iNumber)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iNumber; iCnt++)
    {
        printf("%c\t", 'A' + iCnt);
    }

}

int main()
{
    int iValue = 0;

    printf("Enter number: \n");
    scanf("%d",&iValue);

    Pattern(iValue);

    return 0;
}

