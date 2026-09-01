// count even digits
import java.util.*;

class DigitX
{
    public void CountEvenOddDigits(int iNo)   
    {
        int iDigit = 0;
        int iCountEven = 0;
        int iCountOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if(iDigit % 2 == 0)
            {
               iCountEven++;
            }
            else
            {
                iCountOdd++;
            }

            iNo = iNo/10;
            
        }
        System.out.println("Even digits:"+iCountEven);
        System.out.println("Odd digits:"+iCountOdd);
    }
}

class program88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();         // object creation

        int iValue = 0;
        //int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        dobj.CountEvenOddDigits(iValue);        // function call

        //System.out.println("Number of odd digits are: "+iRet);
    }

}