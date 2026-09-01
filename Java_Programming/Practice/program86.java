// count even digits
import java.util.*;

class DigitX
{
    public int CountEvenDigits(int iNo)   
    {
        int iCount = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if(iDigit % 2 == 0)
            {
                iCount++;
            }

            iNo = iNo/10;
            
        }

        return iCount;

        }
}

class program86
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();         // object creation

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = dobj.CountEvenDigits(iValue);        // function call

        System.out.println("Number of even digits are: "+iRet);
    }

}