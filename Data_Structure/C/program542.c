//RECURSION   :if recursion call is on top : head recursion

#include<stdio.h>

int Sum(int Arr[], int iSize)
{
    int i = 0;
    int iSum = 0;

    while(i < iSize)
    {
        iSum = iSum + Arr[i];        
        i++;
    }

    return iSum;
}

int main()
{
    int iRet = 0;
    int Brr[] = {10,20,30,40,50};

    iRet = Sum(Brr,5);

    printf("Sumation of elements : %d\n",iRet);
   
    
    return 0;
}