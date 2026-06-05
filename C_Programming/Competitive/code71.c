// A15 Q1. Accept N number from user and accept one another number as NO, check whether NO is present or not.
// Owner : Snehal Gholap

#include<stdio.h>
#include<stdlib.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL Check(int Arr[], int iLength, int iNo)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            return TRUE;
        }
    }
    return FALSE;
}

int main()
{
    int iSize = 0;
    int iValue = 0;
    int iCnt = 0;
    BOOL bRet = FALSE;
    int *p = NULL;

    // accept elements from user

    printf("Enter number of values: ");
    scanf("%d",&iSize);

    // allocate memory

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    // accept values from user

    printf("Enter %d elements\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element : %d : ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    // accept no from elements to check

    printf("Enter Number to check: ");
    scanf("%d",&iValue);

    // use memory

    bRet = Check(p,iSize,iValue);

    if(bRet == TRUE)
    {
        printf("Number is present");
    }
    else
    {
        printf("Number is not present");
    }

    // deallocate memory

    free(p);

    return 0;
}