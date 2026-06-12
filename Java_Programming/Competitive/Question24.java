/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   countFactors
// Input:           Number
// Output:          void
// Description:     Write a program to count total number of factors of a given number
// Date:            12/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void countFactors(int iNumber)
    {
        int iCnt = 1;
        int iCount = 0;

        for(iCnt = 1; iCnt <= iNumber; iCnt++)
        {
            if(iNumber % iCnt == 0)
            {
                iCount++;
            }
        }
         System.out.println(iCount);
    }
      
}

class Question24
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.countFactors(20);
    }
}