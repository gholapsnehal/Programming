// Question on Numbers
// to check Harshad number or not

import java.util.*;
import java.io.*;


public class HarshadNumber3
{
    public static void main(String A[]) throws Exception
    {
 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        
        int digit = 0;
        int temp = 0;
        int iRev = 0;

        System.out.println("Enter number: ");
        iNo = Integer.parseInt(bobj.readLine());

        while(iNo != 0)
        {
            digit = iNo % 1;
            iRev = (iRev * 10) + digit;

            iNo = iNo / 10;
        }

        System.out.print(iRev);

        
 
    }
}