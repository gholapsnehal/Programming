// STEPS: input --> String --> char Array --> Updation --> convert Array to String --> return String

import java.util.*;

class StringX
{
    public String toUpperX(String str)
        {
            int i = 0;   // loop counter

            char Arr[] = str.toCharArray();

            for(i = 0; i < Arr.length; i++)
            {
            // ISSUE: it will give  -!(!RASHTRA
                Arr[i] = (char)(Arr[i] - 32);  
               
            }
            
            return new String(Arr);
            
        }

}

class program285
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String data = null;   // reference
        StringX strobj = new StringX();

        String sRet = null;   // string ref
       
        System.out.println("Enter String : ");
        data = sobj.nextLine();

        sRet = strobj.toUpperX(data);

        System.out.println("Updated string is : "+sRet);

        sobj.close();
        
    }
    
}

/*
Updated string is : j_y G_NESH

 */



