///////////////////////////////////////////////////////////////////////////////
//
// Function name:   findMaximumThree
// Input:           Number
// Output:          int
// Description:     Program to find the Maximum of three numbers.
// Date:            09/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    int findMaximumThree(int iNumber1, int iNumber2, int iNumber3)
    {
        int iMax = iNumber1;

        if(iNumber2 > iMax)
        {
            iMax = iNumber2;
        }
        if(iNumber3 > iMax)
        {
            iMax = iNumber3;
        }
        
        return iMax;
    }
}

class program13
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue1 = 0, iValue2 = 0, iValue3 = 0;
        int iRet = 0;

        System.out.println("Enter first number: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter third number: ");
        iValue3 = sobj.nextInt();

        iRet = lobj.findMaximumThree(iValue1,iValue2,iValue3);

        System.out.println("Maximum Number is: "+iRet);

        sobj.close();
    }
}