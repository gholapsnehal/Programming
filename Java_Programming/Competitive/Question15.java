////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   calculatePower
// Input:           Number
// Output:          void
// Description:     Write a program to calculate the power of a number using loops
// Date:            11/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void calculatePower(int base, int exp)
    {
        int iResult = 1;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iResult = iResult * base;
        }

        System.out.println("Result is: "+iResult);
    }
}

class Question15
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.calculatePower(2,6);
    }
}