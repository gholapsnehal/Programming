// Static Array : Perform multiplication of elements of first and second array and store it into the third array

#include<stdio.h>

void MultArrays(int Brr1[], int Brr2[], int Brr3[],int iSize1, int iSize2)
{
    int i = 0;

    // Input Filter
    if(iSize1 != iSize2)
    {
        printf("can't perform operation of two arrays because arrays are not of same size\n");
        return;
    }

    for(i = 0; i < iSize1; i++)
    {
        Brr3[i] = Brr1[i] *  Brr2[i];

    }
 
}

int main()
{
    int Arr1[30];
    int Arr2[30];

    int Arr3[30];

    int i = 0;
    int iSize = 0;

    printf("Enter number of elements : ");
    scanf("%d",&iSize);

    // IF
    if((iSize <= 0) || (iSize > 30))
    {
        printf("Invalid size : array is of size 30");
        return -1;
    }

    printf("Enter elements of first array Arr1 : \n");
    
    for(i = 0; i < iSize; i++)
    {
        scanf("%d",&Arr1[i]);
    }

    printf("\n");

    printf("Enter elements of second array Arr2 : \n");
    
    for(i = 0; i < iSize; i++)
    {
        scanf("%d",&Arr2[i]);
    }

    printf("\n");

    MultArrays(Arr1,Arr2,Arr3,iSize,iSize);

    printf("desired multiplication array elements Arr3: \n");

    for(i = 0; i < iSize; i++)
    {
        printf("%d\t",Arr3[i]);
    }
    printf("\n");

    return 0;
}