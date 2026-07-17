////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Add
// Input         : Array, Size
// Output        : Same as input datatype
// Description   : Returns the addition of all elements from the array
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template<class T>

T Add(T *Arr, int Size)
{
    int i = 0;
    T sum = 0;

    for(i = 0; i < Size; i++)
    {
        sum = sum +  Arr[i];
    }

    return sum;
      
}

int main()
{
    int arr[] = {10,20,30,40,50};

    float brr[] = {10.0f,20.0f,30.0f,40.0f};

    int iSum = Add(arr,5);
    cout<<"Addition of elements : "<<iSum<<"\n";

    float fSum = Add(brr,4);
    cout<<"Addition of elements : "<<fSum<<"\n";
      

    return 0;
}