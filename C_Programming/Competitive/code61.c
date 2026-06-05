// A13 Q1. Accept N numbers from the user and return the difference between the summation of even 
//    elements and summation of odd elements.
// Owner : Snehal Gholap


#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[], int iLength)
{
    int iCnt = 0;
    int iEvenSum = 0;
    int iOddSum = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
            iEvenSum = iEvenSum + Arr[iCnt];
        }
        else
        {
            iOddSum = iOddSum + Arr[iCnt];
        }
    }

    return (iEvenSum - iOddSum);
}


int main()
{
    int iSize = 0;
    int iRet = 0;
    int iCnt = 0;

    int *p = NULL;

    // step 1: accept number of elements:
    printf("Enter number of elements: \n");
    scanf("%d",&iSize);

    // step 2: allocate memory

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    // step 3: accept values from user

    printf("Enter %d elements\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
       printf("Enter element %d\n",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    // step 4: use memory

    iRet = Difference(p,iSize);

    printf("Result is %d\n",iRet);

    // step 5: deallocate memory

    free(p);

    return 0;
}