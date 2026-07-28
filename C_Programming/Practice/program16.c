// SHORT HAND CODE:: accept number from user and check whether it's even or odd.

#include<stdio.h>
#include<stdbool.h>

bool CheckEvenOdd(int iNo)
{
    if((iNo % 2) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }

}

int main()
{
    int iValue = 0;
    bool bRet = false;  //false =0
 
    printf("Enter number to check whether it is Even or Odd: ");
    scanf("%d",&iValue);

    bRet =  CheckEvenOdd(iValue);

    if(bRet == true)
    {
        printf("%d is Even\n",iValue);
    }
    else
    {
        printf("%d is Odd",iValue);
    }

    return 0;
}