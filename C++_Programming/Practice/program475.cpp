// Specific to Generic code

#include<iostream>
using namespace std;
// template headerfile
//template<class T>

int Maximum(int No1, int No2)
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
    cout<<Maximum(21,11)<<endl;

    
    return 0;
}