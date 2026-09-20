#include<stdio.h>
int Addition(int No1, int No2)
{
    int result = 0;
    result = No1+No2;
    return result;
}
int main()
{
    int i=0, j=0, ans=0;
    printf("Enter first number:\n");
    scanf("%d",&i);

    printf("Enter second number:\n");
    scanf("%d",&j);

    ans= Addition(i,j);
    printf("Addition is %d",ans);
    return 0;
}