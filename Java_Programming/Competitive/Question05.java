///////////////////////////////////////////////////////////////////////////////
//
// Function name:   printTable
// Input:           Number
// Output:          void
// Description:     Program to print multiplication table of a number
// Date:            09/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void printTable(int iNumber)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNumber+" * "+ iCnt+" = "+(iNumber * iCnt));
        }
    }
}


class Question05
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.printTable(5);
    }
}