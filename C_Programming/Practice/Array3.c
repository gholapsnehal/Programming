// DYNAMIC MEMORY ALLOCATION

#include<stdio.h>

// ERROR due to headerfile <stdlib.h>

int main()
{
    int *Brr = NULL;
    int iLength = 0;
    int iCnt = 0;

    // STEP 1: Accept the number of elements
    printf("Enter mumner of elements: \n");
    scanf("%d",&iLength);

    // STEP 2: Allocate the memory
    Brr = (int *)malloc(iLength * sizeof(int));

    // STEP 3: Accept the values from user
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    // STEP 4: Use the memory[LOGIC]

    // STEP 5: Deallocate the memory
    free(Brr);

    return 0;
}

