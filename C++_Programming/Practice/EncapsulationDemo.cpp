using namespace std;
#include<iostream>

// Encapsulation
class Marvellous
{
    // Access Specifier
    public:
    int No1, No2;   // Characteristics

    void Fun()      // Behaviour
    {
        cout<<"Inside fun\n";
    }

    void Gun()       // Behaviour
    {
        cout<<"Inside gun\n";  
    }



};

int main()
{
    // Object Creation (Instance)
    Marvellous mobj1;
    Marvellous mobj2;

    cout<<sizeof(mobj1)<<"\n";  //8 byte

    cout<<mobj1.No1<<"\n";

    mobj1.Fun();
    mobj2.Fun();

    mobj1.Gun();
    



    return 0;
}