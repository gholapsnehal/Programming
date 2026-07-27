/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Multiplication
// Input:           Number
// Output:          same as input datatype
// Description:     Generic program to return multiplication of two numbers
// Date :           18/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

template<class T>
T Multiply(T No1, T No2)
{
    T Ans = 0;

    Ans = No1 * No2;

    return Ans;
}

int main()
{
    int iRet = Multiply(10,20);
    printf("%d",iRet);

    float fRet = Multiply(10.2f,20.4f);
    printf("%f",fRet);


    return 0;
}