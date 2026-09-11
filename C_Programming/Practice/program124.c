// Program: Program to return even count of elements.
// Owner: Snehal Gholap


#include<stdio.h>
#include<stdlib.h>

int CountEven(int Arr[], int iSize)
{
    int iCnt = 0;
    int iCount = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
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
    int iLength = 0;
    int *Brr = NULL;
    int iCnt = 0;
    int iRet = 0;

    // enter number of elements

    printf("Enter number of elements: ");
    scanf("%d",&iLength);

    // allocate memory

    Brr = (int *)malloc(iLength * sizeof(int));

    // accept values from user

    printf("Enter the elements: \n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    // use memory

    iRet = CountEven(Brr,iLength);

    printf("Even elements are : %d",iRet);

    // deallocate memory

    free(Brr);

    return 0;
}