import java.util.*;
import Marvellous.StringX;

class program277
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String data = null;   // reference

        
        program280 strobj = new program280();
        int iRet = 0;

        System.out.println("Enter String : ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);
        System.out.println("Capital character count : "+iRet);

        iRet = strobj.CountSmall(data);
        System.out.println("Small character count : "+iRet);

        iRet = strobj.CountDigits(data);
        System.out.println("Digit count : "+iRet);

        iRet = strobj.CountSpace(data);
        System.out.println("White Space count : "+iRet);

        iRet = strobj.CountSpecial(data);
        System.out.println("Special symbol count : "+iRet);
        
    }
    
}

/*
JAY@11   ganesh#21
Capital character count : 3
Small character count : 6
Digit count : 4
White Space count : 3
Special symbol count : 2
*/



