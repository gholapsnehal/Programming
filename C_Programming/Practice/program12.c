/*   accept number from user and check whether it's even or odd.
*/

#include<stdio.h>

void CheckEvenOdd(int iNo)
{
    int iRemainder = 0;

    iRemainder = iNo % 2;

    if(iRemainder == 0)
    {
        printf("Number is Even\n");
    }
    else
    {
        printf("Number is Odd");
    }

}

int main()
{
    int iValue = 0;
    

    printf("Enter number : \n");
    scanf("%d",&iValue);

    CheckEvenOdd(iValue);

    return 0;
}