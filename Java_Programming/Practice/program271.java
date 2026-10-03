import java.util.*;

class StringX
{
    // do not convert into char array : to reduce this 2n times iteration we can convert into char array
    public int CountCapital(String str)  
    {
        int i = 0;
        int iCount = 0;

        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
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

        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                iCount++;
            }
        }

        return iCount;
    }

}

class program271
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


        sobj.close();
        
    }
    
}



