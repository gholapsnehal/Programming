/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   countEvenOddRange
// Input:           Number
// Output:          void
// Description:     Write a program to count how many even and odd numbers are present between 1 and N
// Date:            12/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void countEvenOddRange(int iNumber)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

        for(iCnt = 1; iCnt <= iNumber; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("Even Count: "+iEven);
        System.out.println("Odd Count: "+iOdd);

    }
}

class Question22
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.countEvenOddRange(10);
    }
}