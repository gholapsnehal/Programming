////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   printDigits
// Input:           Number
// Output:          void
// Description:     Write a program to print each digit of a number separately
// Date:            11/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printDigits(int iNumber)
    {
        int iDigit = 0;

        while(iNumber != 0)
        {
            iDigit = iNumber % 10;

            System.out.println(iDigit);

            iNumber = iNumber / 10;
        }

    }

}

class Question14
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.printDigits(9876);
    }
   
}