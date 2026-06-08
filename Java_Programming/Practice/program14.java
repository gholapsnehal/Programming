///////////////////////////////////////////////////////////////////////////////
//
// Function name:   printTable
// Input:           Number
// Output:          void
// Description:     Program to print multiplication table of a number
// Date:            09/06/2026
// Author:          Snehal Gholap
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    void printTable(int iNumber)
    {
        int iCnt = 0;
     
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iNumber+" * "+iCnt+" = "+(iNumber * iCnt));
        }
    }
}

class program14
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        int iValue = 0;
        
        System.out.println("Enter number to print table: ");
        iValue = sobj.nextInt();

        lobj.printTable(iValue);

        sobj.close();

    }
}