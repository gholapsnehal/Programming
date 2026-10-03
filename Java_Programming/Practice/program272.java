import java.util.*;

class StringX
{
    //to reduce this 2n times iteration we can convert into char array : just normal drawback is char Arr[] will 
    // get some memory but i.e better than 2n complexity 
    public int CountCapital(String str)  
    {
        int i = 0;
        int iCount = 0;

        // converted str String into character Array by using toCharArray() metod of String
        // to reduce 2n times complexity

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

}

class program272
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



