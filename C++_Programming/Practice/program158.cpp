// C++: OOP Designing

#include<iostream>
using namespace std;

// its always good to write pragma in cpp code
#pragma pack(1)
class ArrayX
{
    public:
    int *Arr;
    int iSize;

    
    // parameterized constructor
    ArrayX(int X)
    {
        cout<<"Inside constructor\n";

        // character initialization
        iSize = X; 

        // Resource allocation      
        Arr = new int[iSize];

    }

    // Destructor
    ~ArrayX()
    {
        cout<<"Inside destructor\n";

        // Resource deallocation
        delete []Arr;
    }
};

int main()

{
    ArrayX aobj1(5);             
   
      

    return 0;
 
}