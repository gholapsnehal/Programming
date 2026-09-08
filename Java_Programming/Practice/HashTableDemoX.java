import java.util.*;

class HashTableDemoX
{
    public static void main(String A[])
    {
        Hashtable <String, Integer> hobj = new Hashtable <String, Integer> ();

        hobj.put("PPA", 27000);
        hobj.put("LB", 28000);
        hobj.put("PYTHON", 29000);
        hobj.put("LB", 28500);  
        
        Enumeration eobj = hobj.keys();

        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }

        
        


    }
}