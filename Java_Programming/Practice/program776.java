// Q. 
// hashmap in java
// check which char occurs for max times

import java.util.*;

public class program776
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        // hashmap object created
        HashMap <Character, Integer> hobj = new HashMap<Character, Integer>();

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        int iCount = 0;


        for(char ch : Arr)
        {
            if(hobj.containsKey(ch))
            {
                iCount = hobj.get(ch);

                hobj.put(ch,iCount + 1);
            }
            else
            {
                hobj.put(ch,1);
            }
           
        }

        char Brr[] = new char[hobj.size()];  // created array with size of hobj(elements of hobj)

        int i = 0;

        // display charcater onc eonly one same char should display for one tieme only
        for(char cValue : hobj.keySet())
        {
            Brr[i] = cValue;
            i++;

        }

        System.out.println(new String(Brr));


                       
       sobj.close();  

    }
    
}
