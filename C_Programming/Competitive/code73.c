// A15 Q3. Accept N numbers from user and accept one another number as NO and return index of last occurrence of that NO.
// Owner : Snehal Gholap

#include<stdio.h>
#include<stdlib.h>

// reverse traversal
int LastOcc(int Arr[], int iLength, int iNo)
{
    int iCnt = 0;
   
    for(iCnt = iLength - 1; iCnt >= 0; iCnt--)
    {
        if(Arr[iCnt] == iNo)
        {
            return iCnt;
        }
    }
    return -1;
   
}

int main()
{
    int iSize = 0;
    int iValue = 0;
    int iCnt = 0;
    int iRet = 0;
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

    iRet = LastOcc(p,iSize,iValue);

    if(iRet == -1)
    {
        printf("There is no such number");
    }
    else
    {
        printf("Last occurrence of number %d is %d",iValue,iRet);
    }
   
    // deallocate memory

    free(p);

    return 0;
}