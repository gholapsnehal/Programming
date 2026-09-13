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

    // default constructor
    ArrayX()
    {

    }

    // parameterized constructor
    ArrayX(int X)
    {

    }
};

int main()

{
    ArrayX aobj1;             // default 
    ArrayX aobj2(5);          // parameterized

    cout<<sizeof(aobj1)<<endl;       // 12 byte: padding: 4 byte

    return 0;
 
}