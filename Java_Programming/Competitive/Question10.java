///////////////////////////////////////////////////////////////////////////////
//
// Function name:   checkSign
// Input:           Number
// Output:          void
// Description:     Write a program to check whether a number is positive, negative, or zero.
// Date:            10/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////// 

class Logic
{
    void checkSign(int iNumber)
    {
        if(iNumber > 0)
        {
            System.err.println("Positive Number");
        }
        else if(iNumber < 0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero");
        }

    }
}

class Question10
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.checkSign(-8);
    }
}