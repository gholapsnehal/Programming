import java.util.*;

public class reverse
{
    public static void main(String A[])
    {
        int rev = 0;
        int no = 0;
        int digit = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter No : ");
        no = sobj.nextInt();

        while(no != 0)
        {
            digit = no % 10;
            rev = rev * 10 + digit;
            no = no / 10;
        }

        System.out.println("reversed number is : "+rev);
        sobj.close();       
    }
    
}
