// Question on Numbers
// to check Harshad number or not

import java.util.*;
import java.io.*;


public class HarshadNumber
{
    public static void main(String A[]) throws Exception
    {
 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        int sum = 0;
        int digit = 0;
        int temp = 0;

        System.out.println("Enter number: ");
        iNo = Integer.parseInt(bobj.readLine());

        while(iNo > 0)
        {
            digit = iNo % 10;

            sum = sum + digit;

            iNo = iNo / 10;
        }

        System.out.println("summation is : "+sum);





    }
}