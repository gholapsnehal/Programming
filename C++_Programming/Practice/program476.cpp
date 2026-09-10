// Specific to Generic code

#include<iostream>
using namespace std;
// template headerfile
//template<class T>

float Maximum(float No1, float No2)
{

    float Ans;

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

    
    return 0;
}