////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Max
// Input         : Three numbers
// Output        : Same as input datatype
// Description   : Returns the largest number among three numbers
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template<class T>

T Max(T No1, T No2, T No3)
{
    T Max = No1;

    if(No2 > Max)
    {
        Max = No2;
    }

    if(No3 > Max)
    {
        Max = No3;
    }

    return Max;
      
}

int main()
{
    int iRet = Max(10,20,30);
    cout<<"Largest number is : "<<iRet<<"\n";

    float fRet = Max(10.2f,20.33f,55.2f);
    cout<<"Largest number is : "<<fRet<<"\n";

    double dRet = Max(10.2222,20.33676,55.298);
    cout<<"Largest number is : "<<dRet<<"\n";
      

    return 0;
}