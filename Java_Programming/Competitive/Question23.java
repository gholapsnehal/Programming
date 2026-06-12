/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   displayFactors
// Input:           Number
// Output:          void
// Description:     Write a program to display all factors of a given number
// Date:            12/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void displayFactors(int iNumber)
    {
        int iCnt = 1;

        for(iCnt = 1; iCnt <= iNumber; iCnt++)
        {
            if(iNumber % iCnt == 0)
            {
            System.out.println(iCnt);
            }
        }
    }
      
}

class Question23
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.displayFactors(12);
    }
}