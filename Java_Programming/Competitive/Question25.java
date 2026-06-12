/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   printDivisibleBy2and3
// Input:           Number
// Output:          void
// Description:     Write a program to print all numbers from 1 to N that are divisible by both 2 and 3
// Date:            12/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
    void printDivisibleBy2and3(int iNumber)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNumber; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 ==0))
            {
                System.out.println(iCnt);
            }
        
        }
    
    }
      
}

class Question25
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.printDivisibleBy2and3(30);
    }
}