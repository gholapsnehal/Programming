#include<stdio.h>

int main()
{
    int iCnt = 0;
    int jCnt = 0;
   
    
    for(iCnt = 1; iCnt <= 5; iCnt++)
    {
        for(jCnt = 5; jCnt >= iCnt; jCnt--)
        {
            printf("*\t");
        }

        printf("\n");
    }

}