import java.util.*;

class HashMapDemo
{
    public static void main(String A[])
    {
        HashMap <String, Integer> hobj = new HashMap <String, Integer> ();

        hobj.put("PPA", 27000);
        hobj.put("LB", 28000);
        hobj.put("PYTHON", 29000);
        hobj.put("LB", 28500);              // value will get override of LB with 28500

        System.out.println(hobj.get("PYTHON"));
        System.out.println(hobj.get("PPA"));

        System.out.println(hobj.get("LB"));

        System.out.println(hobj);

        System.out.println(hobj.keySet());


    }
}