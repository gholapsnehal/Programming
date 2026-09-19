// BITWISE OPERATOR

#include<stdio.h>

int main()
{
    int iNo1 = 0;
    int iNo2 = 0;
    int Ans = 0;

    printf("Enter first number : \n");
    scanf("%d",&iNo1);

    printf("Enter second number : \n");
    scanf("%d",&iNo2);

    Ans = iNo1 & iNo2;       // bitwise &(AND)

    printf("Result is : %d\n",Ans);

  

    return 0;
}