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
Input: iRow : 4   iCol : 4

Output: A B C D
        a b c d
        A B C D
        a b c d
*/
#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    char ch = '\0';

   for(i = 1; i <= iRow; i++)
   {
    if(i % 2 == 0)
    {
        for(j = 1,ch = 'a'; j <= iCol; j++,ch++)
        {
            printf("%c\t",ch);
        }
    }
    else
    {
        for(j = 1,ch = 'A'; j <= iCol; j++,ch++)
        {
            printf("%c\t",ch);
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