// count odd digits
import java.util.*;

class DigitX
{
    public int SumDigits(int iNo)   
    {
        int iSum = 0;
        //int iDigit = 0;

       while(iNo != 0)
       {
        iSum = iSum + (iNo % 10);
        iNo = iNo / 10;
       }
       return iSum;

    }
}

class program91
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();         // object creation

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = dobj.SumDigits(iValue);        // function call

        System.out.println("Summation of Even digits are: "+iRet);
    }

}