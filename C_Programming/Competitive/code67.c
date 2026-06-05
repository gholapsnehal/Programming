// A14 Q2. Accept N numbers from user and return difference between frequency of even number and odd numbers.
// Owner : Snehal Gholap

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iLength)
{
    int iCnt = 0;
    int iEvenFreq = 0;
    int iOddFreq = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
            iEvenFreq++;
        }
        else
        {
            iOddFreq++;
        }
    }
    return (iEvenFreq - iOddFreq);
}

int main()
{
    int iSize = 0;
    int iRet = 0;
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

    printf("Enter %d elements: \n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    iRet = Frequency(p,iSize);

    printf("Difference between frequency of even and odd number: %d\n",iRet);

    free(p);

    return 0;
}

