///////////////////////////////////////////////////////////////////////////////
//
// Function name:   findMinimum
// Input:           Number
// Output:          int
// Description:     Program to find the Minimum of three numbers.
// Date:            09/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

class Logic
{
    // Another approach to find minimum
    int findMinimum(int iNo1, int iNo2, int iNo3)
    {
        int iMin = iNo1;

        if(iNo2 < iMin)
        {
            iMin = iNo2;
        }
        if(iNo3 < iMin)
        {
            iMin = iNo3;
        }

        return iMin;                               
    }       
}
class program12
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
    
