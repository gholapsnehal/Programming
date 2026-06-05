// A13 Q4. Accept N number from user and display all such elements divisible by 3 and 5.
// Owner : Snehal Gholap

#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[], int iLength)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 3 == 0 && Arr[iCnt] % 5 == 0)
        {
            printf("%d\n",Arr[iCnt]);
        }
    }

}

int main()
{
    int iSize = 0;
    int iCnt = 0;
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

    Display(p,iSize);

    // deallocate memory

    free(p);

    return 0;
}