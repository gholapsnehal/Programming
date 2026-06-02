#include<iostream>
#include<stdlib.h>

using namespace std;

class SumX
{
    public:

    int Summation(int Arr[], int iSize)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }
};

int main()
{
    SumX sobj;

    int *Brr = NULL;
    int iLength = 0;
    int iCnt = 0;
    int iRet = 0;

    // STEP: ACCEPT NUMBER OF ELEMENTS
    cout<<"Enter number of elements: \n";
    cin>>iLength;

    // STEP 2: ALLOCATE THE MEMORY
    Brr = new int[iLength];   // sizeof(int) * iLength

    // STEP 3: ACCEPT VALUES FROM USER

    cout<<"Enter the elements: \n";

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        cin>>Brr[iCnt];
    }

    // STEP 4: LOGIC [USE MEMORY]

     iRet = sobj.Summation(Brr,iLength);

     cout<<"Summation of array element is: "<<iRet<<"\n";

    // STEP 5: DEALLOCATE MEMORY

    delete []Brr;


    return 0;
}