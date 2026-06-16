///////////////////////////////////////////////////////////////////////////////
//
// Function name:   Pattern
// Input:           Number and Number
// Output:          void
// Description:     Accept number of rows and number of columns from user and display pattern
// Date:            14/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

/* Pattern:
Input: iRow : 5  iCol : 5

Output: a b c d e
        1 2 3 4 5
        a b c d e
        1 2 3 4 5
        a b c d e
*/
#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;

    int iNo = 0;
    char ch = '\0';
    

    for(i = 1; i <= iRow; i++)
    {
        if(i % 2 == 1)
        {
            for(j = 1, ch = 'a'; j <= iCol; j++,ch++)
            {
                printf("%c\t",ch);
            }
        }
        else
        {
            for(j = 1,iNo = 1; j <= iCol; j++, iNo++)
            {
                printf("%d\t",iNo);               
            }
        }
        printf("\n");
    }
        
}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter number of rows and columns :");
    scanf("%d%d",&iValue1,&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}