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
    ArrayX aobj(5);

    cout<<sizeof(aobj)<<endl;       // 12 byte: padding: 4 byte

    return 0;
 
}