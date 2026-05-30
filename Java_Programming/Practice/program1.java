// Q1. accept number from user and print digits whose frequency less than 6.

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

public class program1
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

    }
}
