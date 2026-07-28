//RECURSION

#include<stdio.h>

typedef unsigned long int ULONG;

ULONG Factorial(int iNo)
{
    static ULONG iFact = 1;  

    if(iNo > 0)
    {
        iFact = iFact * iNo;
       
        Factorial(iNo - 1);

    }

    return iFact;   
}

int main()
{
    int iValue = 0;
    ULONG iRet = 0;

    printf("Enter frequency : ");
    scanf("%d",&iValue);

    iRet = Factorial(iValue);
    printf("factorial is : %lu\n",iRet);
    
    return 0;
}