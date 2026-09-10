// Specific to Generic code

#include<iostream>
using namespace std;
// template headerfile
//template<class T>

float Maximum(float No1, float No2)
{
    // Ternary operator
    float Ans;

    (No1 > No2) ? Ans = No1 : Ans = No2;

    return Ans;

}


int main()
{
    cout<<Maximum(21.2f,11.3f)<<endl;

    
    return 0;
}