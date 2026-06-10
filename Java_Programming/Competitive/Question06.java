///////////////////////////////////////////////////////////////////////////////
//
// Function name:   checkPrime
// Input:           Number
// Output:          void
// Description:     To check whether number is prime or not
// Date:            09/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int iNumber)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 2; iCnt < iNumber; iCnt++)
        {
            if(iNumber % iCnt == 0)
            {
                bFlag = true;
                break;
            }
        }

        if(bFlag == true)
        {
            System.out.println("Number is not a prime");
        }
        else
        {
            System.out.println("Number is a prime");
        }
    }
}

class Question06
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.checkPrime(11);
    }
}