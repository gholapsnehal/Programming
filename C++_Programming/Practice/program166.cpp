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
    ArrayX()
    {
        iSize = 5;             // by default it will take 5
        Arr = new int[iSize];
    }

    ArrayX(int X)
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
    // default constructor call
    ArrayX *aobj1 = new ArrayX();

    // parameterized constructor
    ArrayX *aobj2 = new ArrayX(5);

    // LOGIC (Function call)
 
    delete aobj1;
    delete aobj2;

 
    return 0;
 
}