// for loop iteration
// output should be in reverse:

#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    //Input Filter:  // it will reject invalid user input 
    if(iNo < 0)
    {
        printf("Invalid input");
        return;
    }

    for(iCnt = iNo; iCnt >= 0; iCnt--)
    {
        printf("%d\n",iCnt);
    }

}

int main()
{

    int iValue = 0;

    printf("Enter the frequency : ");
    scanf("%d",&iValue);

    Display(iValue);  // function call
    
    return 0;
}