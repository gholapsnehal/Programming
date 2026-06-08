///////////////////////////////////////////////////////////////////////////////
//
// Function name:   findMaxTwo
// Input:           Number
// Output:          int
// Description:     Program to find the maximum of two numbers.
// Date:            08/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    int findMaxTwo(int iNo1, int iNo2)
    {
        // we can use ternary operator 
        // return (iNo1 > iNo2) ? iNo1:iNo2;

        if(iNo1 > iNo2)
        {
            return iNo1;
        }
        else
        {
            return iNo2;
        }
                         
    }       
}
class program10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue1 = 0;
        int iValue2 = 0;
        int iRet = 0;

        System.out.println("Enter first number: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iValue2 = sobj.nextInt();

        iRet = lobj.findMaxTwo(iValue1,iValue2);

        System.out.println("Maximum Number is: "+iRet);

        sobj.close();

    }
}