/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountOne
// Input:           Number
// Output:          int
// Description:     Write a program which accepts one number and count number of ON(1) bits in it
//                  without using % and / operator
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

int CountOne(UINT iNo)
{
    int iCount = 0;
    int iDigit = 0;

    while(iNo != 0)
    {
        iDigit = iNo & 1;

        if(iDigit == 1)
        {
            iCount++;
        }

        iNo = iNo >> 1;

    }

    return iCount;
   
}

int main()
{
   UINT iValue = 0;
   
   int iRet = 0;

   printf("Enter Number : \n");
   scanf("%u",&iValue);

   iRet = CountOne(iValue);

   printf("Number : %u ON Bit Count : %d",iValue,iRet);

    return 0;
}