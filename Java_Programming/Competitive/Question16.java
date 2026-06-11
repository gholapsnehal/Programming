////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   sumEvenNumbers
// Input:           Number
// Output:          void
// Description:     Write a program to find sum of even numbers up to N.
// Date:            12/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenNumbers(int iNumber)
    {
        int iCnt = 0;
        int iEvenSum = 0;

        for(iCnt = 1; iCnt <= iNumber; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenSum = iEvenSum + iCnt;
            }    
        }

        System.out.println("Even sum is : "+iEvenSum);

    }
}

class Question16
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.sumEvenNumbers(10);
    }
}