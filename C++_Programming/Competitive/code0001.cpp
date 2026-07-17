////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Multiplication
// Input         : Two numbers
// Output        : Same as input datatype
// Description   : Multiplies two numbers and returns the result.
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template<class T>

T Multiply(T No1, T No2)
{
    T Ans = 0;

    Ans = No1 * No2;
    return Ans;
}
int main()
{
   int iRet;
   
   iRet = Multiply(10,20);

   cout<<"Multiplication is : "<<iRet<<endl;

   float fRet = Multiply(10.2f,20.2f);

   cout<<"Multiplication is : "<<fRet<<endl;
    


    return 0;
}