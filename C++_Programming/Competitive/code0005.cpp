////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Min
// Input         : Array, Size
// Output        : Same as input datatype
// Description   : Returns the smallest element from the array
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template<class T>

T Min(T *Arr, int Size)
{
    T Min = Arr[0];
    int i = 0;

    for(i = 0; i < Size; i++)
    {
        if(Arr[i] < Min)
        {
            Min = Arr[i];
        }
    }

    return Min;
      
}

int main()
{
    int arr[] = {10,20,30,40,50};

    float brr[] = {10.0f,20.0f,30.0f,40.0f};

    int iRet = Min(arr,5);
    cout<<"Smallest of elements : "<<iRet<<"\n";

    float fRet = Min(brr,4);
    cout<<"Smallest of elements : "<<fRet<<"\n";
      

    return 0;
}