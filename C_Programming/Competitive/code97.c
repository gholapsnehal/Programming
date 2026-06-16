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
Input: iRow : 4  iCol : 4

Output: 2 4 6 8 10
        1 3 5 7 9
        2 4 6 8 10
        1 3 5 7 9
*/
#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;

    int iNo = 1;
    

    for(i = 1; i <= iRow; i++)
    {
        if(i % 2 == 0)
            {
                iNo = 1;   //Even number
            }
            else
            {
                iNo = 2;    // odd
            }

            // now column operation
            for(j = 1; j <= iCol; j++)
            {
                printf("%d\t",iNo);
                iNo = iNo + 2;
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