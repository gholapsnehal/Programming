///////////////////////////////////////////////////////////////////////////////
//
// Function name:   printOddNumbers
// Input:           Number
// Output:          void
// Description:     Write a program to print all odd numbers up to N
// Date:            10/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////    

class Logic
{
    void printOddNumbers(int iNumber)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNumber; iCnt++)
        {
            if(iCnt %2 != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class Question08
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.printOddNumbers(20);
    }
}