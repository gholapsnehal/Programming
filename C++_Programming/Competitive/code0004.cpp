////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Max
// Input         : Array, Size
// Output        : Same as input datatype
// Description   : Returns the largest element from the array
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template<class T>

T Max(T *Arr, int Size)
{
    T Max = Arr[0];
    int i = 0;

    for(i = 0; i < Size; i++)
    {
        if(Arr[i] > Max)
        {
            Max = Arr[i];
        }
    }

    return Max;

      
}

int main()
{
    int arr[] = {10,20,30,40,50};

    float brr[] = {10.0f,20.0f,30.0f,40.0f};

    int iRet = Max(arr,5);
    cout<<"Largest of elements : "<<iRet<<"\n";

    float fRet = Max(brr,4);
    cout<<"Largest of elements : "<<fRet<<"\n";
      

    return 0;
}