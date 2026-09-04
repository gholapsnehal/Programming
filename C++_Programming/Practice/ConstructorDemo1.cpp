using namespace std;
#include<iostream>

// Encapsulation
class Marvellous
{
    // Access Specifier
    public:
    int No1, No2;   // Characteristics

    
    // Default Constructor
    Marvellous()
    {
        cout<<"Inside Default Constructor\n";
        No1 = 0;
        No2 = 0;
    }
    
    // Parameterized constructor
    Marvellous(int A, int B)
    {
        cout<<"Inside Parameterized Constructor\n";
        No1 = A;
        No2 = B;
    }
    // Copy Constructor
    Marvellous(Marvellous &ref)
    {
        cout<<"Inside Copy constructor\n";
        No1 = ref.No1;
        No2 = ref.No2;
    }

    // Destructor
    ~Marvellous()
    {
        cout<<"Inside Destructor\n";
    }
};

int main()
{
    cout<<"Inside main\n";
    Marvellous mobj1;    // Default constructor  if warning, you can remove ().
    Marvellous mobj2(11,21);    // Parameterised Constructor
    Marvellous mobj3(mobj2);    // Copy Constructor

    cout<<"End of main\n";

    return 0;
}     // All destructors gets called