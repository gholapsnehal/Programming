///////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountLessThanSix
// Input:           Number
// Output:          int
// Description:     Program to return frequency of digits which are less than six
// Date:            09/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class DigitX
{
    public int countLessThanSix(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        // Input Updator

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit < 6)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
            return iCount;

    }
}

public class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        DigitX dobj = new DigitX();

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        iRet = dobj.countLessThanSix(iValue);

        System.out.println("Digit count which are less than 6: "+iRet);

        sobj.close();;

    }
}
