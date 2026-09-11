// Program: searching : linear search: check whether 11 is present or not.
// using flag
// Owner: Snehal Gholap


#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool LineaerSearch(int Arr[], int iSize)
{
    int iCnt = 0;
    bool bFlag = false;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)
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
    int *Brr = NULL;
    int iCnt = 0;
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

    // use memory

    bRet = LineaerSearch(Brr,iLength);

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