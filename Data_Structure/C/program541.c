//RECURSION   :if recursion call is on top : head recursion

#include<stdio.h>

void Display(int Arr[], int iSize)
{
    static int i = 0;

    if(i < iSize)
    {
        
        i++;
        Display(Arr,iSize);         //  head recursion
        printf("%d\n",Arr[i]);      // INVALID DATA
    }
}

int main()
{
    int Brr[] = {10,20,30,40,50};

    Display(Brr,5);
   
    
    return 0;
}