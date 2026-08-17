// Question on Numbers
// to check armstrong number or not

// x = 3 and y = 5 
//  3*3*3*3*3 : 3 raise to 5
import java.util.*;
import java.io.*;


public class ArmstrongNumberX
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

        iPower = 1;
        while(y != 0)
        {
            iPower = iPower * x;
            y--;
        }

        System.out.println("result it : "+iPower);




    }
}