#include<iostream>
using namespace std;

class DigitX
{
    public:

    bool CheckPalindrome(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

};

int main()
{
    DigitX dobj;

    int iValue = 0;
    bool bRet = false;

    cout<<"Enter the number: ";
    cin>>iValue;

    bRet = dobj.CheckPalindrome(iValue);

    if(bRet == true)
    {
        cout<<"Number is a pallindrome\n";
    }
    else
    {
        cout<<"Number is not a pallindrome\n";
    }

    return 0;
}