////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Reverse
// Input         : Array, Size
// Output        : void
// Description   : Reverses the contents of the array
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////


#include<iostream>
using namespace std;

template<class T>

void Reverse(T *Arr, int Size)
{
    int i = 0;
    int j = Size - 1;

    T temp;

    while(i < j)
    {
        temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;

        i++;
        j--;
    }
       
}


int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,10};

    int i = 0;

    cout<<"Before Reverse : "<<endl;

    for(i = 0; i < 9; i++)
    {
        cout<<arr[i]<<"\t";
    }

    //function call
    
    Reverse(arr,9);

    cout<<"\n\nAfter Reverse : "<<endl;

    for(i = 0; i < 9; i++)
    {
        cout<<arr[i]<<"\t";
    }

    return 0;
}