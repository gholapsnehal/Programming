//RECURSION

// 4+3+2+1 = 10
#include<stdio.h>

int Summation(int iNo)
{
    static int iSum = 0;
       
    if(iNo > 0)      
    {
        iSum = iSum + iNo;
        
        Summation(iNo - 1);
    }

    return iSum;   
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter frequency : ");
    scanf("%d",&iValue);

    iRet = Summation(iValue);
    printf("Summation is : %d\n",iRet);

    printf("End of main");
    
    return 0;
}