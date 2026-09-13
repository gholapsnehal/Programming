// C++: OOP Designing

#include<iostream>
using namespace std;

// its always good to write pragma in cpp code
#pragma pack(1)
class ArrayX
{
    private:
    int *Arr;
    int iSize;
   
    public:
   
    // parameterzied constructor with default argument
    ArrayX(int X = 5)
    {
        iSize = X;     
        Arr = new int[iSize];
    }

    ~ArrayX()
    {
        
        delete []Arr;
    }
};

int main()

{ 
    // parameterized constructor
    ArrayX *aobj1 = new ArrayX();

    // parameterized constructor
    ArrayX *aobj2 = new ArrayX(15);

    // LOGIC (Function call)
 
    delete aobj1;
    delete aobj2;

 
    return 0;
 
}