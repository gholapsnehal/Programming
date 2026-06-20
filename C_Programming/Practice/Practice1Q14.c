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

/* Input :  iRow: 5   iCol: 5
Output:
1
2       3
4       5       6
7       8       9       10
11      12      13      14      15

*/

#include<stdio.h>

void Display(int iRow, int iCol)
{
    int i = 0, j = 0;
    int iNo = 0;
    iNo = 1;

    for(i = 1; i <= iRow; i++)
    {

       for(j = 1; j <= i ; j++)
        {
           printf("%d\t",iNo);
           iNo++;
            
        }
        printf("\n");
    }

}

int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter number of rows :\n");
    scanf("%d",&iValue1);

    printf("Enter number of columns :\n");
    scanf("%d",&iValue2);

    Display(iValue1,iValue2);

    return 0;
}

// Time complexity: ≈O(n²)