///////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>


///////////////////////////////////////////////////////////////////////////////
//
// Function name:   DigitSum
// Input:           Integer Array, Integer
// Output:          void
// Description:     Display summation of digits of each number from array
// Date:            04/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

void DigitSum(int Arr[], int iLength)
{
    int iCnt = 0;
    int iDigit = 0;
    int iTemp = 0;
   
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        int iDigitSum = 0;
        iTemp = Arr[iCnt];

        while(iTemp != 0)
        {

            iDigit = iTemp % 10;
            iDigitSum = iDigitSum + iDigit;
            iTemp = iTemp / 10;
        }

        printf("%d\n",iDigitSum);

    }

}

///////////////////////////////////////////////////////////////////////////////
//
// Application to perform summation of digits of each number from array.
//
///////////////////////////////////////////////////////////////////////////////

int main()
{
    int iSize = 0;
    int iCnt = 0;
    int *p = NULL;
    
    printf("Enter number of elements: ");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d elements :\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element : %d : ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    DigitSum(p,iSize);

    free(p);

    return 0;
}