// accept number from user and display on screen in reverse order
import java.util.*;

class DigitX
{
    public void DisplayDigit(int iNo)       //return type void function will not return anything.
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;        // to separate digit
            System.out.println(iDigit);
            iNo = iNo/10;            // to reduce number
        }

        }
}

class program79
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DigitX dobj = new DigitX();         // object creation

        int iValue = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        dobj.DisplayDigit(iValue);        // function call


    }

}