///////////////////////////////////////////////////////////////////////////////
//
// Function name:   checkPrime
// Input:           Number
// Output:          int
// Description:     To check whether number is prime or not
// Date:            09/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Logic 
{
    boolean checkPrime(int iNumber)
    {
        int iCnt = 0;
        boolean bFlag = false;

        if(iNumber <= 1)
        {
            return true;
        }

        for(iCnt = 2; iCnt < iNumber; iCnt++)
        {
            if(iNumber % iCnt == 0)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

class program15
{   
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        int iValue = 0;
        boolean bRet = false;
        
        System.out.println("Enter number: ");
        iValue = sobj.nextInt();

        bRet = lobj.checkPrime(iValue);

        if(bRet == true)
        {
            System.out.println("Number is not a prime");
        }
        else
        {
            System.out.println("Number is a prime");
        }

        sobj.close();
    }
}