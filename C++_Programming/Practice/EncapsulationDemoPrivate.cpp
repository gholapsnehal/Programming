using namespace std;
#include<iostream>

// Encapsulation
class Marvellous
{
    // Access Specifier(By default private)
    
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

    cout<<mobj1.No1<<"\n";     //ERROR

    mobj1.Fun();        // ERROR
    mobj2.Fun();        // ERROR

    mobj1.Gun();       // ERROR
    



    return 0;
}