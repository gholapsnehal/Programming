// count odd digits
import java.util.*;

class DigitX
{
    public int RevNumber(int iNo)   
    {
        int iDigit = 0;
        int iRev = 0;

       while(iNo != 0)
       {
        iDigit = iNo % 10;

        iRev = (iRev * 10) + iDigit;

        iNo = iNo / 10;
       
       }
       return iRev;

    }
}

class program92
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();         // object creation

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = dobj.RevNumber(iValue);        // function call

        System.out.println("Reverse number is: "+iRet);
    }

}

// 790 = 97 :: 0 has no magnitude so it will not add so output will 97