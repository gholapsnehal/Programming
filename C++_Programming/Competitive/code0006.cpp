////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Display
// Input         : Value, Count
// Output        : void
// Description   : Displays the given value specified number of times
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////


#include<iostream>
using namespace std;

template<class T>

void Display(T Value, int Size)
{
    int i = 0;

    for(i = 0; i < Size; i++)
    {
        cout<<Value<<"\t";
    }

    cout<<endl;

}


int main()
{
    Display('M',7);

    Display(11,3);

    Display(3.7f,6);


    return 0;
}