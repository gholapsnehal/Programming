import java.util.*;

class StringX
{
    // update string first convert to array and then again convert into string and return updated string to main() with 
    // other string name
    public String Update(String str)
        {
            int i = 0;   // loop counter

            char Arr[] = str.toCharArray();

            for(i = 0; i < Arr.length; i++)
            {
                if(Arr[i] == 'A' || Arr[i] == 'a')
                {
                    Arr[i] = '_';
                }
            }
            // as our return type is String, here converted array into String with updated name ret.
            String ret = new String(Arr);

            return ret;
        }

}

class program278
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String data = null;   // reference
        StringX strobj = new StringX();

        String sRet = null;   // string ref
       

        System.out.println("Enter String : ");
        data = sobj.nextLine();

        sRet = strobj.Update(data);

        System.out.println("Updated string is : "+sRet);

        sobj.close();
        
    }
    
}

/*
Updated string is : J_Y G_NESH

 */



