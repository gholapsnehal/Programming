//RECURSION   :if recursion call is on top : head recursion

#include<stdio.h>

int Sum(int Arr[], int iSize)
{
    static int i = 0;
    static int iSum = 0;

    if(i < iSize)
    {
        iSum = iSum + Arr[i];        
        i++;

        Sum(Arr,iSize);        
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