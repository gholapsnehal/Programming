///////////////////////////////////////////////////////////////////////////////
//
// Function name:   sumEvenOddDigits
// Input:           Number
// Output:          void
// Description:     Write a program to find the sum of even and odd digits separately in a number
// Date:            10/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////  

class Logic
{
    void sumEvenOddDigits(int iNumber)
    {
        int iEvenSum = 0;
        int iOddSum = 0;
        int iDigit = 0;

        while(iNumber != 0)
        {
            iDigit = iNumber % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }
            
            iNumber = iNumber / 10;
        }

        System.out.println("Even digit sum: "+iEvenSum);
        System.out.println("Odd digit sum: "+iOddSum);
    }
}

class Question09
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.sumEvenOddDigits(123456);
    }
}