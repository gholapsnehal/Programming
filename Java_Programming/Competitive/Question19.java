////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   findLargestDigit
// Input:           Number
// Output:          void
// Description:     Write a program to find the largest digit in a given number
// Date:            12/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void findLargestDigit(int iNumber)
    {
        int iDigit = 0;
        int iLargestDigit = 0;

        iLargestDigit = iNumber % 10;

        while(iNumber != 0)
        {
            iDigit = iNumber % 10;

            if(iDigit > iLargestDigit)
            {
                iLargestDigit = iDigit;
            }

            iNumber = iNumber / 10;
        }

        System.out.println(iLargestDigit);
    }
}

class Question19
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.findLargestDigit(83429);
    }
}