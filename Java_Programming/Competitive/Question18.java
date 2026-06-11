////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   checkPerfect
// Input:           Number
// Output:          void
// Description:     Write a program to check whether a number is a perfect number or not
// Date:            12/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect(int iNumber)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt < iNumber; iCnt++)
        {
            if(iNumber % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNumber)
        {
            System.out.println("Perfect Number");
        }
        else 
        {
            System.out.println("It's not a perfect number");
        }

    }
}

class Question18
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.checkPerfect(10);
    }
}