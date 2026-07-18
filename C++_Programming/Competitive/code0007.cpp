////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Frequency
// Input         : Array, Size, Value
// Output        : int
// Description   : Counts and returns the frequency of the specified value from the array
// Date          : 18/07/2026
// Author        : Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

template<class T>

int Frequency(T *Arr, int Size, T No)
{
    int i = 0;
    int iCount = 0;

    for(i = 0; i < Size; i++)
    {
        if(Arr[i] == No)
        {
            iCount++;
        }
    }

    return iCount;
    
}


int main()
{
    int arr[] = {10,20,30,40,20,60,70,80,20};

    int iRet = Frequency(arr,9,20);

    cout<<"Frequency is : "<<iRet<<"\n";


    return 0;
}