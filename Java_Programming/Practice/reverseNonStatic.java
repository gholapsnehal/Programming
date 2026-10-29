import java.util.*;

public class reverseNonStatic
{
    public int reverseNo(int No)
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
        reverseX obj = new reverseX();

        int iNo = 0;
        int result = 0;

        System.out.println("Enter No : ");
        iNo = sobj.nextInt();

        result = obj.reverseNo(iNo);

        System.out.println("reversed : "+result);      
    }
    
}
