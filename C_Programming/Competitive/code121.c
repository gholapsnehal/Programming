///////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           char
// Output:          void
// Description:     Program to display ASCII table. Table contains symbol,Decimal,Hexadecimal and Octal 
//                  representation of every member from 0 to 255.
// Date:            19/06/2026
// Author:          Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display()
{
    int iCnt = 0;

    printf("Symbol\tDecimal\tHexadecimal\tOctal\n");

    for(iCnt = 0; iCnt <= 255; iCnt++)
    {
        printf("%c\t%d\t%x\t%o\n",iCnt,iCnt,iCnt,iCnt);
    }

}

int main()
{
    // function call
    Display();

    return 0;
}