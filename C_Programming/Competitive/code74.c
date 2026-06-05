// A15 Q4. Accept N number from user and accept Range, display all elements from that range.
// Owner : Snehal Gholap

#include<stdio.h>
#include<stdlib.h>

void Range(int Arr[], int iLength, int iStart, int iEnd)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] >= iStart && Arr[iCnt] <= iEnd)
        {
            printf("%d\t",Arr[iCnt]);
        }

    }

}

int main()
{
    int iSize = 0;
    int iValue1 = 0;
    int iValue2 = 0;
    int iCnt = 0;
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

    // accept range from user

    printf("Enter starting point:");
    scanf("%d",&iValue1);

    printf("Enter ending point:");
    scanf("%d",&iValue2);


    // accept values from user

    printf("Enter %d elements\n",iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element : %d : ",iCnt+1);
        scanf("%d",&p[iCnt]);
    }

    // use memory

    printf("Elements are in the given range:\n");

    Range(p,iSize,iValue1,iValue2);

    // deallocate memory

    free(p);

    return 0;
}