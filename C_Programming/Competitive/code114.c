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
Input: iRow : 6  iCol : 6

Output: 
*       *       *       *       *       *
*       #       #       #       *       *
*       #       #       *       $       *
*       #       *       $       $       *
*       *       $       $       $       *
*       *       *       *       *       *

*/
#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    
    if(iRow != iCol)
    {
        printf("Invalid parameters\n");
        printf("number of rows and columns should be same\n");
        return;
    } 

    for(i = iRow; i >= 1; i--)
    {
        for(j = 1; j <= iCol; j++)
        {
           
            if(i == 1 || j == 1 || i == iRow || j == iCol || i == j)
            {
                printf("*\t");
            }
            else if(i > j)
            {
                printf("#\t");
            }
            else
            {
                printf("$\t");
            }
            
        }
        printf("\n");
    }
       
    }

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter number of rows :");
    scanf("%d",&iValue1);

    printf("Enter number of columns :");
    scanf("%d",&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}

// Time complexity : O(n²)