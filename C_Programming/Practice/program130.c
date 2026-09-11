// Program: searching : accept number from user linear search: check whether 11 is present or not.
// using flag : 
// Owner: Snehal Gholap


#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool LineaerSearch(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;
    bool bFlag = false;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            bFlag = true;
            break;                          // break ne loop chya baher jael              
        }   
    }

    return bFlag;   

}

int main()
{
    int iLength = 0;
    int iValue = 0;
    int iCnt = 0;
    int *Brr = NULL;
    bool bRet = false;

    
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

    // the element that you want to search

    printf("Enter the element that you want to search: \n");
    scanf("%d",&iValue);

    // use memory

    bRet = LineaerSearch(Brr,iLength,iValue);

    if(bRet == true)
    {
        printf("Element is present\n");
    }
    else
    {
        printf("Element is not present");
    }  

    // deallocate memory

    free(Brr);

    return 0;
}