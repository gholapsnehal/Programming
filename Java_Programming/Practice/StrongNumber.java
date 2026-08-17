
// accept number from user and check it is strong number or not
//A Strong Number is a number whose sum of the factorials of its digits is equal to the number itself


import java.util.*;
import java.io.*;


public class StrongNumber
{
    public static void main(String A[]) throws Exception
    {
        int iFact[] = {1,1,2,6,24,120,720,5040,40320,362880};

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;

        // using long  because factorial will huge numberr
        
        System.out.println("Enter number : ");

        // parseint : to convert from string to integer
        iNo = Integer.parseInt(bobj.readLine());

        // 2. to find out factorial


        // 3. to check strong number or not

        int iTemp = 0;
        long iSum = 0;
        int iDigit = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iFact[iDigit];

            iNo = iNo / 10;

            if(iSum > iTemp)
            {
                break;
            }
        }  

        
        if(iSum == iTemp)
        {
            System.out.println("It is a strong number");
        }
        else
        {
            System.out.println("It is not a strong number");
        }

    }
}