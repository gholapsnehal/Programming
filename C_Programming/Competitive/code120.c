/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           char
// Output:          void
// Description:     Accept division of student from user and depends on division display exam timing
//                  There are 4 divisions in school as A, B, C, D. Exam of division A at 7 AM, B at 
//                  8.30 AM, C at 9.20 AM and D at 10.30 AM.(Application should be case insensitive)
// Date:            19/06/2026
// Author:          Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

/*
Input : A or a
Output : 7:00 AM
Input : d
Output : 10:30 AM
*/

#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

void Display(char chDiv)
{
    switch (chDiv)
    {
        case 'A':
        case 'a':
            printf("Exam timing is 7:00 AM\n");
            break;

        case 'B':
        case 'b':
            printf("Exam timing is 8:30 AM\n");
            break;

        case 'C':
        case 'c':
            printf("Exam timing is 9:20 AM\n");
            break;

        case 'D':
        case 'd':
            printf("Exam timing is 10:30 AM\n");
            break;

        default:
            printf("Invalid division\n");

    }
    
}

int main()
{
    char cValue = '\0';
   
    printf("Enter your division: \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;

}