// C++:

#include<iostream>
using namespace std;

// its always good to write pragma in cpp code
#pragma pack(1)
class ArrayX
{
    public:
    int *Arr;
    int iSize;

    ArrayX(int X)
    {

    }
};

int main()

{
    // error: no matching function for call to 'ArrayX::ArrayX()'
    // ArrayX aobj;

    ArrayX aobj;

    cout<<sizeof(aobj)<<endl;       // 12 byte: padding: 4 byte

    return 0;
 
}