////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : SearchFirst
// Input         : Array, Size, Value
// Output        : int
// Description   : Returns the position of first occurrence of the specified value
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template<class T>

int SearchFirst(T *Arr, int Size, T No)
{
    int i = 0;
   
    for(i = 0; i < Size; i++)
    {
        if(Arr[i] == No)
        {
            return i + 1;
        }
    }

    return -1;
    
}


int main()
{
    int arr[] = {10,20,30,10,30,40,10,40,20};

    int iRet = SearchFirst(arr,9,40);

    cout<<"First Occurrence is is : "<<iRet<<"\n";


    return 0;
}