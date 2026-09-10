// Specific to Generic code

#include<iostream>
using namespace std;
// template headerfile
template<class S>

S Maximum(S No1, S No2, S No3)
{

    S Ans;

    if(No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No1 && No2 > No3)
    {
        return No2;
    }
    else
    {
        return No3;
    }  

}


int main()
{
    cout<<Maximum(21.2f,11.3f,18.9f)<<endl;

    cout<<Maximum(21.24,11.35,56.3)<<endl;

    cout<<Maximum(21,51,7)<<endl;

    
    return 0;
}