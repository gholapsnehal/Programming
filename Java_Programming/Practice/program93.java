// Palindrome : numbers are identical : Check palindrome [exampme : 212 = 212]

import java.util.*;

class DigitX
{
    public boolean CheckPallindrome(int iNo)   
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = iNo;           // copy of iNo stored in iTemp

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

class program93
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();         // object creation

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        bRet = dobj.CheckPallindrome(iValue);        // function call

        if(bRet == true)
        {
            System.out.println("Number is Pallindrome");

        }
        else
        {
            System.out.println("Number is not Pallindrome");
        }

        sobj.close();
    }

}

// 790 = 97 :: 0 has no magnitude so it will not add so output will 97