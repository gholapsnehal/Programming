// C++:

#include<iostream>
using namespace std;

class ArrayX
{
    public:
    int *Arr;
    int iSize;
};


int main()

{
    ArrayX aobj;

    cout<<sizeof(aobj)<<endl;       // 16 byte: padding: 4 byte

    return 0;
 
}