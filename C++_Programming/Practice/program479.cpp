// Specific to Generic code

#include<iostream>
using namespace std;
// template headerfile
template<class S>

S Maximum(S No1, S No2)
{

    S Ans;

    if(No1 > No2)
    {
        Ans = No1;
    }

    else
    {
        Ans = No2;
    }

    return Ans;

}


int main()
{
    cout<<Maximum(21.2f,11.3f)<<endl;

    cout<<Maximum(21.24,11.35)<<endl;

    cout<<Maximum(21,11)<<endl;

    
    return 0;
}