// accept input from user and print count of digits less than 6 in a number.

#include<iostream>
using namespace std;

class CountX
{
    public:

    int CountLessThanSix(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        //input updator
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < 6)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        
          return iCount;
    }

};

int main()
{
    CountX cobj;

    int iValue = 0;
    int iRet = 0;

    cout<<"Enter the number:"<<"\n";
    cin>>iValue;

    iRet = cobj.CountLessThanSix(iValue);

    cout<<"digit count less than six: "<<iRet;

    return 0;
}