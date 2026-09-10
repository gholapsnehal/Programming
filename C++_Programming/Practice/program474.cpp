// Specific to Generic code

#include<iostream>
using namespace std;
// template headerfile
//template<class T>

float Maximum(float No1, float No2)
{

    if(No1 > No2)
    {
        return No1;
    }
    else
    {
        return No2;
    }

}


int main()
{
    cout<<Maximum(21.2f,11.2f)<<endl;

    
    return 0;
}