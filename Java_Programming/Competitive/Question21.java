////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   productOfDigits
// Input:           Number
// Output:          void
// Description:     Write a program to calculate the product of digits of a number
// Date:            12/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(int iNumber)
    {
        int iDigit = 0;
        int iDigitProduct = 1;

        while(iNumber != 0)
        {
            iDigit = iNumber % 10;

            iDigitProduct = iDigitProduct * iDigit;

            iNumber = iNumber / 10;
        }

        System.out.println(iDigitProduct);
    }
}

class Question21
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.productOfDigits(453);
    }
}