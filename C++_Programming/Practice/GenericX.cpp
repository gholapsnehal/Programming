// generic code

#include<iostream>
using namespace std;

// function template

template<class S>                                   

S Addition(S A, S B)
{
    S Ans;
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