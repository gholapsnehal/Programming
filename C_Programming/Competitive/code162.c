/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   ToggleBit
// Input:           Number
// Output:          int
// Description:     Write a program which accepts one number and toggle contents of first and last
//                  nibble of that number.Return modified number.(Nibble is a group of four bits)
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0xF000000F;

    iNo = iNo ^ iMask;

    return iNo;

}

int main()
{
   UINT iValue = 0;
   
   UINT iRet = 0;

   printf("Enter Number : \n");
   scanf("%u",&iValue);

   iRet = ToggleBit(iValue);

   printf("Modified Number : %u",iRet);

    return 0;
}