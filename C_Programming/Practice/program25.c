// for loop iteration

#include<stdio.h>

int main()
{
    int iCnt = 0;
    int iValue = 0;

    printf("Enter user input: ");
    scanf("%d",&iValue);
    
    // Iteration
    
    for(iCnt = 1; iCnt<=iValue; iCnt++)
    {
        printf("Jay Shree Ram...\n");
    }

    return 0;
}