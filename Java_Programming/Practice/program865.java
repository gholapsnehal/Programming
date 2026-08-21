import java.util.*;

public class program865
{
    public static void main(String A[]) 
    {
        TreeMap <Integer,String> hobj = new TreeMap<Integer,String>();

        hobj.put(20,"C programming");
        hobj.put(10,"Java programming");
        hobj.put(30,"C programming");

        
        System.out.println(hobj);

        // these are only in TreeMap
        System.out.println(hobj.firstKey());
        System.out.println(hobj.lastKey());

        // shows key: value
        System.out.println(hobj.firstEntry());
        System.out.println(hobj.lastEntry());
    }  
}  




