// Program: Program to return sum of even elements.
// Owner: Snehal Gholap


#include<stdio.h>
#include<stdlib.h>

int SumEven(int Arr[], int iSize)
{
    int iCnt = 0;
    int iSum = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
       if(Arr[iCnt] % 2 == 0)
       {
         iSum = iSum + Arr[iCnt];
       }
    }

    return iSum;;

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

    iRet = SumEven(Brr,iLength);

    printf("Sum of Even elements is : %d",iRet);

    // deallocate memory

    free(Brr);

    return 0;
}