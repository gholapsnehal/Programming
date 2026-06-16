///////////////////////////////////////////////////////////////////////////////
//
// Function name:   Pattern
// Input:           Number and Number
// Output:          void
// Description:     Accept number of rows and number of columns from user and display pattern
// Date:            16/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

/* Pattern:
Input: iRow : 6  iCol : 5

Output: 
*       *       *       *       *
*       @       @       @       *
*       @       @       @       *
*       @       @       @       *
*       @       @       @       *
*       *       *       *       *

*/
#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    
    /*if(iRow != iCol)
    {
        printf("Invalid parameters\n");
        printf("number of rows and columns should be same\n");
        return;
    } */

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1; j <= iCol; j++)
        {
            if(i == 1 || i == iRow || j == 1 || j == iCol)
            {
                printf("*\t");
            }
            else
            {
                printf("@\t");
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