#include<iostream>
using namespace std;

int main()
{
    int *Brr = NULL;
    int iLength = 0;
    int iCnt = 0;

    // accept number of elemets
    cout<<"Enter number of elements: \n";
    cin>>iLength;

    // allocate memory
    Brr = new int[iLength];

    // accept values

    cout<<"Enter elements: \n";

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        cin>>Brr[iCnt];
    }

    // print values
    cout<<"Elements of the array are : \n";

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        cout<<Brr[iCnt]<<endl;
    }

    // deallocate memory
    delete []Brr;

    return 0;
}