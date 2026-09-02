#include<stdio.h>

int main()
{

    int No = 0;

    printf("Enter number: \n");
    scanf("%d",&No);

    if(No%2==0)
    {
        printf("it's Even Number\n");
    }
    else
    {
        printf("it's Odd Number\n");
    }


    return 0;
}