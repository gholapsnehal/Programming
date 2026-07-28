//RECURSION   :if recursion call is on top : head recursion

#include<stdio.h>

int Summation(int iNo)
{
    int iDigit = 0;
    static int iSum  = 0;

    if(iNo > 0)
    {
        iDigit = iNo % 10;
        iSum = iSum + iDigit;        
        iNo = iNo / 10;

        Summation(iNo);      // tail recursion         
        
    }

    return iSum;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Summation(iValue);

    printf("Summation of digits : %d\n",iRet);

    
    return 0;
}