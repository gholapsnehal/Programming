// A15 Q5. Accept N numbers from user and return product of all odd elements.
// Owner : Snehal Gholap

#include<stdio.h>
#include<stdlib.h>

int Product(int Arr[], int iLength)
{
    int iCnt = 0;
    int iOddProduct = 1;
    int iCount = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 != 0)
        {
            iOddProduct = iOddProduct * Arr[iCnt];
            iCount++;
        }

    }
     if(iCount == 0)
        {
            return 0;
        }

    return iOddProduct;
}



int main()
{
    int iSize = 0;
    int iCnt = 0;
    int *p = NULL;
    int iRet = 0;

    // accept number of elements:

    printf("Enter number of elements: ");
    scanf("%d",&iSize);

    // allocate memory

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unabe to allocate memory");
        return -1;
    }

    // accept values from user

    printf("Enter %d elements :\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element : %d : ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    // use memory

    iRet = Product(p,iSize);

    printf("Product of odd element is %d: ",iRet);

    // deallocate memory

    free(p);

    return 0;
}