// Question on Numbers
// to check armstrong number or not

import java.util.*;
import java.io.*;

public class ArmstrongNumber1
{
    public static void main(String A[]) throws Exception
    {
        int iFact[] = {1,1,2,6,24,120,720,5040,40320,362880};

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        int x = 0, y = 0;
        int iPower = 0;
        int i = 0;

        // using long  because factorial will huge numberr
        
        System.out.println("Enter number as a base: ");

        // parseint : to convert from string to integer
        x = Integer.parseInt(bobj.readLine());

        System.out.println("Enter number as a power: ");
        y = Integer.parseInt(bobj.readLine());

        // 1. calculate power using x and y

        iPower = (int)Math.pow(x,y);


        System.out.println("result it : "+iPower);




    }
}