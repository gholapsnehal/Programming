import java.util.*;
import java.lang.Math;

public class Armstrong
{
    public static boolean isArmstrong(int no)
    {
        int original = 0;
        int digit = 0;
        int sum = 0;
        int count = 0;

        original = no;
        count = String.valueOf(no).length();

        while(no != 0)
        {
            digit = no % 10;
            sum = sum + (int)Math.pow(digit, count);
            no = no / 10;
        }

        return sum == original;
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean result = false;

        System.out.println("Enter Number of your choice : ");
        iNo = sobj.nextInt();

        result = isArmstrong(iNo);

        if(result == true)
        {
            System.out.println("Its an Armstrong Number");
        }
        else
        {
            System.out.println("Its not an Armstrong Number");
        }

        sobj.close();
    }
    
}
