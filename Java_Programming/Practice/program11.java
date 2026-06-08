///////////////////////////////////////////////////////////////////////////////
//
// Function name:   findMinimum
// Input:           Number
// Output:          int
// Description:     Program to find the Minimum of three numbers.
// Date:            08/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    int findMinimum(int iNo1, int iNo2, int iNo3)
    {

        if(iNo1 <= iNo2 && iNo1 <= iNo3)
        {
            return iNo1;
        }
        else if(iNo2 <= iNo1 && iNo2 <= iNo3)
        {
            return iNo2;
        }
        else 
        {
            return iNo3;
        }                       
    }       
}
class program11
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue1 = 0;
        int iValue2 = 0;
        int iValue3 = 0;
        int iRet = 0;

        System.out.println("Enter first number: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter third number: ");
        iValue3 = sobj.nextInt();

        iRet = lobj.findMinimum(iValue1,iValue2,iValue3);

        System.out.println("Minimum Number is: "+iRet);

        sobj.close();

    }
}