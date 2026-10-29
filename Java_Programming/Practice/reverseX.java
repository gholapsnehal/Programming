import java.util.*;

public class reverseX
{
    public static int reverseNo(int No)
    {
        int rev = 0;
        int digit = 0;

        while(No != 0)
        {
            digit = No % 10;
            rev = rev * 10 + digit;
            No = No / 10;
        }

        return rev;

    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int result = 0;

        System.out.println("Enter No : ");
        iNo = sobj.nextInt();

        result = reverseNo(iNo);

        System.out.println("reversed : "+result);      
    }
    
}
