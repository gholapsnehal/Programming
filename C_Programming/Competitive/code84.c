
///////////////////////////////////////////////////////////////////////////////
//
// Function name:   Pattern
// Input:           Number
// Output:          void
// Description:     Accept number from user and display in pattern
// Date:            12/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

/* Pattern:
Enter number: 
4
#       1       *       #       2       *       #       3       *       #       4       *
*/

#include<stdio.h>

void Pattern(int iNumber)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iNumber; iCnt++)
    {
        printf("#\t%d\t*\t",iCnt);
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

