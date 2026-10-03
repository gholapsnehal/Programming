import java.util.*;

class StringX
{
    public int CountCapital(String str)  
    {
        int i = 0;
        int iCount = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCount++;
            }
        }

        return iCount;
    }

    public int CountSmall(String str)  
    {
        int i = 0;
        int iCount = 0;

        // here we converted str into char Array
        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                iCount++;
            }
        }

        return iCount;
    }

    public int CountDigits(String str)  
    {
        int i = 0;
        int iCount = 0;

        // here we converted str into char Array
        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')
            {
                iCount++;
            }
        }
    
        return iCount;
    }

}

class program273
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String data = null; // reference
        StringX strobj = new StringX();
        int iRet = 0;

        System.out.println("Enter String : ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);
        System.out.println("Capital character count : "+iRet);

        iRet = strobj.CountSmall(data);
        System.out.println("Small character count : "+iRet);

        iRet = strobj.CountDigits(data);
        System.out.println("Digit count : "+iRet);


        sobj.close();
        
    }
    
}

/*
JAY11 ganesh21
Capital character count : 3
Small character count : 6
Digit count : 4
 */



