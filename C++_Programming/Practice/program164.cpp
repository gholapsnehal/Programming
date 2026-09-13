// C++: OOP Designing

#include<iostream>
using namespace std;

// its always good to write pragma in cpp code
#pragma pack(1)
class ArrayX
{
    // character 
    private:
    int *Arr;
    int iSize;
   
    public:
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
    ArrayX *aobj1 = new ArrayX(5);

    // LOGIC (Function call)

    // ERROR
    cout<<aobj1->iSize<<"\n";

    

    delete aobj1;

 
    return 0;
 
}