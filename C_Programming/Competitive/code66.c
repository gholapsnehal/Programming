// A14 Q1. Accept N numbers from use and return frequency of even numbers. 
// Owner : Snehal Gholap


#include<stdio.h>
#include<stdlib.h>

int CountEven(int Arr[], int iLength)
{
    int iCnt = 0;
    int iCount = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
            iCount++;  
        }
    }
    return iCount;

}

int main()
{
    int iSize = 0;
    int iCnt = 0;
    int iRet = 0;
    int *p = NULL;

    // accept number of elements

    printf("Enter number of elements: ");
    scanf("%d",&iSize);

    // allocate memory
    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Uable to allocate memory");
        return -1;
    }

    // accept values from user

    printf("Enter %d elements:\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element: %d\n",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    // use memory

     iRet =CountEven(p,iSize);

    printf("Result is: %d",);

    // deallocate memory

    free(p);

    return 0;
}