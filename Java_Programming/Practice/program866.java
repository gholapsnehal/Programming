import java.util.*;

public class program866
{
    public static void main(String A[]) 
    {
        TreeMap <Integer,String> hobj = new TreeMap<Integer,String>();

        hobj.put(20,"C programming");
        hobj.put(10,"Java programming");
        hobj.put(30,"C programming");

        
        System.out.println(hobj);

        // these are only in TreeMap
        System.out.println("first key : "+hobj.firstKey());
        System.out.println("last key :"+hobj.lastKey());

        // shows key: value
        System.out.println(hobj.firstEntry());
        System.out.println(hobj.lastEntry());

        // shows key which are higher than 20
        System.out.println(hobj.higherKey(20));

        // shows key which are lower than 20        
        System.out.println(hobj.lowerKey(20));
    }  
}  




