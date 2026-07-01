/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CommonBits
// Input:           Number
// Output:          void
// Description:     Write a program which accepts two number and return position of common ON bits
//                  from that two numbers
// Date :           01/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

typedef unsigned int UINT;

void CommonBits(UINT iNo1, UINT iNo2)
{
    UINT iResult = 0;
    int iPosition = 0x1;

    iResult = iNo1 & iNo2;

    while(iResult != 0)
    {
        if(iResult & 1)
        {
            printf("%d ",iPosition);
        }

        iPosition++;

        iResult = iResult >> 1;
    }
       
}

int main()
{
   UINT iValue1 = 0;
   UINT iValue2 = 0;
   
   printf("Enter first number : \n");
   scanf("%u",&iValue1);

   printf("Enter second number : \n");
   scanf("%u",&iValue2);

   printf("Common bit positions are: ");
   CommonBits(iValue1,iValue2);


   return 0;
}