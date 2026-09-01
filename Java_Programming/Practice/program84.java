// accept number from user and display on screen in reverse order
import java.util.*;

class DigitX
{
    public int CountDigits(int iNo)   
    {
        int iCount = 0;
        //int iDigit = 0;

        while(iNo != 0)
        {
            //iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10; 
            
        }

        return iCount;

        }
}

class program84
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();         // object creation

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = dobj.CountDigits(iValue);        // function call

        System.out.println("Digit count: "+iRet);
    }

}