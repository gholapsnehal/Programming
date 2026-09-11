// Program: program to return maximum element from an array
// 
// Owner: Snehal Gholap


#include<stdio.h>
#include<stdlib.h>

// Time Complexity : O(N)

int Maximum(int Arr[], int iSize)
{
    int iCnt = 0;
    int iMax = 0;

    iMax = Arr[0];
        
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];          // imax update
        }
         
    }

    return iMax;

}

int main()
{
    int iLength = 0;  
    int iCnt = 0;
    int *Brr = NULL;
    int iRet = 0;

    
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

    iRet = Maximum(Brr,iLength);

    printf("Maximum element is : %d\n",iRet);
  
    // deallocate memory

    free(Brr);

    return 0;
}