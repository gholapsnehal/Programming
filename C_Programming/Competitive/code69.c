// A14 Q4. Accept N numbers from user and return frequency of 11 form it.
// Owner : Snehal Gholap

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iLength)
{
    int iCnt = 0;
    int iCount = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            iCount++;
        }
    }
    return iCount;
}

int main()
{
    int iSize = 0;
    int iRet = 0;
    int iCnt = 0;
    int *p = NULL;

    // accept number of elements

    printf("Enter number of elements: ");
    scanf("%d",&iSize);

    // allocate memory

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory");
        return -1;
    }

    // accept values from user

    printf("Enter %d elements:\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element: %d : ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    // use memory
    iRet = Frequency(p,iSize);

    printf("Frequency of 11 is %d\n",iRet);

    // deallocate memory
    free(p);

    return 0;
}