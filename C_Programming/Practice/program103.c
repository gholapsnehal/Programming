// ARRAY STATIC : CALL BY ADDRESS

#include<stdio.h>

void CallByAddress(int *iptr)
{
    (*iptr)++;  // 12  

}

int main()
{
    int iValue = 11;

    CallByAddress(&iValue);          // call by address : LValue  

    printf("Value after function call : %d\n",iValue);    // 12

    return 0;
}

