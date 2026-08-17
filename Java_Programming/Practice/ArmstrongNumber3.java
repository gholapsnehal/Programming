// Question on Numbers
// to check armstrong number or not

import java.util.*;
import java.io.*;


public class ArmstrongNumber3
{
    public static void main(String A[]) throws Exception
    {
 
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int iNo = 0;
        int iCount = 0;
        int iTemp = 0;
        
        System.out.println("Enter number: ");
        iNo = Integer.parseInt(bobj.readLine());

        String str = String.valueOf(iNo);

    
        System.out.println("Number of digits are : "+str.length());



    }
}