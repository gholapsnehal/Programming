// generic code

#include<iostream>
using namespace std;

template<class T>                                   // template header and T: template variable

T Addition(T A, T B)
{
    T Ans;
    Ans = A + B;
    return Ans;

}

int main()                                           // main cannot be generic 
{
    cout<<Addition(10,11)<<"\n";                     // integer

    cout<<Addition(10.3f,11.2f)<<"\n";               // float

    cout<<Addition(10.34567,11.23456)<<"\n";         // double

    return 0;
}

// NOTE: after compliation 3 copies will create thats called template instantiation.