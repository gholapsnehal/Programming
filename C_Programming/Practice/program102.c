// ARRAY STATIC : CALL BY VALUE

#include<stdio.h>

void CallByValue(int iNo)
{
    iNo++;   // 12

}

int main()
{
    int iValue = 11;

    CallByValue(iValue);      //CallByValue(11); RValue

    printf("Value after function call : %d\n",iValue);    // 11

    return 0;
}

