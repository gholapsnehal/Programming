///////////////////////////////////////////////////////////////////////////////
//
// Function name:   checkPalindrome
// Input:           Number
// Output:          boolean
// Description:     To check whether a number is palindrome or not.
// Date:            08/06/2026
// Author:          Snehal Gholap
/////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic
{
    boolean checkPalindrome(int iNo)
    {
        int iRev = 0;
        int iDigit = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit; 
            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

class Question02 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number to check: ");
        iValue = sobj.nextInt();

        bRet = lobj.checkPalindrome(iValue);

        if(bRet == true)
        {
            System.out.println("Number is a palindrome");
        }
        else
        {
            System.out.println("Number is not a palindrome");
        }

        sobj.close();

    }
    
}
