////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   printReverse
// Input:           Number
// Output:          void
// Description:     Write a program to print numbers from N down to 1 in reverse order
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////


class Logic
{
    void printReverse(int iNumber)
    {
        int iCnt = 0;

        if(iNumber <= 0)
        {
            return;
        }

        for(iCnt = iNumber; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

public class Question17
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.printReverse(10);
    }

}