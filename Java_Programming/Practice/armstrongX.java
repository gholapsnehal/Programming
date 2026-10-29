// without using inbuilt methods

import java.util.*;

public class armstrongX
{
    public static boolean isArmstrong(int no)
    {
        int count = 0;
        int temp = 0;
        temp = no;
        int original = 0;
        original = no;

        int sum = 0;

        while(temp != 0)
        {
            temp = temp / 10;
            count++;
        }

        System.out.println("Digit count : "+count);

        while(no != 0)    // outer loop
        {
            int j = 0;
            int power = 1;
            int digit = no % 10;

            while(j < count)     // inner loop
            {
                power = power * digit;
                j++;
            }

            sum = sum + power;
            no = no / 10;
        }

        System.out.println("Sum is : "+sum);

        return sum == original;

    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean result = false;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        result = isArmstrong(iNo);

        if(result)
        {
            System.out.println("Sum equals to the original number");
            System.out.println(+iNo+" is an armstrong number");
        }
        else
        {
            System.out.println("sum is not equal to an original number");
            System.out.println(+iNo+" is not an armstrong number");
        }

        sobj.close();

    }
}