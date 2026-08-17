// Question on Numbers
// to check armstrong number or not

import java.util.*;
import java.io.*;


public class ArmstrongNumber4
{
    public static void main(String A[]) throws Exception
    {
 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        int iCount = 0;
        int iTemp = 0;
        
        System.out.println("Enter number as a base: ");
        iNo = Integer.parseInt(bobj.readLine());

        iTemp = iNo;

        while(iNo > 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;
        int digit = 0;
        int sum = 0;

        while(iNo > 0)
        {
            digit = iNo % 10;

            sum = sum + (int)Math.pow(digit, iCount);

            iNo = iNo / 10;
            
        }

        if(sum == iTemp)
        {
            System.out.println("It is is an Armstrong number");
        }
        else
        {
            System.out.println("It is not an Armstrong number");
        }

    }
}