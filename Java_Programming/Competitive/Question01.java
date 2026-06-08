///////////////////////////////////////////////////////////////////////////////
//
// Function name:   sumOfDigtis
// Input:           Number
// Output:          int
// Description:     Returns Summation of digits.
// Date:            08/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Logic
{
    int sumOfDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        // Input updator

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;  
        }

        return iSum;

    }

}

class Question1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number: ");
        iValue = sobj.nextInt();

        iRet = lobj.sumOfDigits(iValue);

        System.out.println("Sum of digits: "+iRet);

        sobj.close();

    }
}