import java.util.*;

public class palindrome
{
    public static boolean palindromeNo(int no)
    {
        int rev = 0;
        int digit = 0;
        int original = 0;

        original = no;

        while(no != 0)
        {
            digit = no % 10;
            rev = rev * 10 + digit;
            no = no / 10;
        }

        System.out.println("reversed number is : "+rev);

        if(rev == original)
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter a number : ");
        iNo = sobj.nextInt();

        boolean result = palindromeNo(iNo);

        if(result)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }       
    }
    
}
