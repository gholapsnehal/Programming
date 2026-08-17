// Question on Numbers
// to check Harshad number or not

import java.util.*;
import java.io.*;


public class HarshadNumber2
{
    public static void main(String A[]) throws Exception
    {
 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        int sum = 0;
        int digit = 0;
        int temp = 0;
        int i = 0;

        int start = 0, end = 0;

        System.out.println("Enter starting point: ");
        start = Integer.parseInt(bobj.readLine());

        System.out.println("Enter ending point: ");
        end = Integer.parseInt(bobj.readLine());

        System.out.println("Harshad Numbers are : ");
        for(i = start; i <= end; i++)
        {
            iNo = i;

            while(iNo > 0)
            {
                digit = iNo % 10;

                sum = sum + digit;

                iNo = iNo / 10;
            }

            if(i % sum == 0)
            {
                System.out.println(+i+" It is a Harshad number");

            }
            else
            {
                System.out.println(+i+" It is not Harshad number");
            }
        }


    }
}