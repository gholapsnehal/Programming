///////////////////////////////////////////////////////////////////////////////
//
// Function name:   printEvenNumbers
// Input:           Number
// Output:          void
// Description:     Write a program to print all even numbers up to N
// Date:            10/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Logic 
{
    void printEvenNumbers(int iNumber)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNumber; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }     
    }
}

class Question07
{   
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.printEvenNumbers(20);
    }

}