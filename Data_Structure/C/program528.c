//RECURSION
// 

#include<stdio.h>

unsigned long int Factorial(int iNo)
{
    unsigned long int iFact = 1;  // major change

    while(iNo > 0)
    {
        iFact = iFact * iNo;
        iNo--;
    }

    return iFact;
   
}

int main()
{
    int iValue = 0;
    unsigned long int iRet = 0;

    printf("Enter frequency : ");
    scanf("%d",&iValue);

    iRet = Factorial(iValue);
    printf("factorial is : %lu\n",iRet);
    
    return 0;
}