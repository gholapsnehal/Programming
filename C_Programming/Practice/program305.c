// BITWISE OPERATOR
/*
Enter first number :
97
Enter second number :
34
AND: 32
OR : 99
XOR : 67
*/
#include<stdio.h>

int main()
{
    int No1 = 0;
    int No2 = 0;
    int Ans = 0;

    printf("Enter first number : \n");
    scanf("%d",&No1);

    printf("Enter second number : \n");
    scanf("%d",&No2);

    Ans = No1 & No2;                         // bitwise &(AND)
    printf("AND: %d\n",Ans);

    Ans = No1 | No2;                       // bitwise OR
    printf("OR : %d\n",Ans);

    Ans = No1 ^ No2;                      // bitwise XOR
    printf("XOR : %d\n",Ans);

  

    return 0;
}