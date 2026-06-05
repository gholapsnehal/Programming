// A14 Q5. Accept N numbers from user and accept one another number as NO return frequency of NO form it.
// Owner : Snehal Gholap

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iLength, int iNo)
{
    int iCnt = 0;
    int iFreq = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iFreq++;
        }
    }
    return iFreq;
}

int main()
{
    int iSize = 0;
    int iRet = 0;
    int iCnt = 0;
    int iValue = 0;
    int *p = NULL;

    printf("Enter number of elements: ");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    printf("Enter %d element: \n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element : %d: ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    printf("Enter the number to check frequency: ");
    scanf("%d",&iValue);

    iRet = Frequency(p,iSize,iValue);

    printf("%d",iRet);

    free(p);

    return 0;
}