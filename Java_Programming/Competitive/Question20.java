////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   findSmallestDigit
// Input:           Number
// Output:          void
// Description:     Write a program to find the smallest digit in a given number
// Date:            12/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findSmallestDigit(int iNumber)
    {
        int iDigit = 0;
        int iSmallestDigit = 0;

        iSmallestDigit = iNumber % 10;

        while(iNumber != 0)
        {
            iDigit = iNumber % 10;

            if(iDigit < iSmallestDigit)
            {
                iSmallestDigit = iDigit;
            }
            
            iNumber = iNumber / 10;
        }

        System.out.println(iSmallestDigit);
    }
}

class Question20
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.findSmallestDigit(45872);
    }
}