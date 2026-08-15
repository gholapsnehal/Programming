// Q. accept string from user and display frequency of each letter
// hashmap in java

import java.util.*;

public class program766
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        HashMap <Character, Integer> hobj = new HashMap<Character, Integer>();

        hobj.put('a', 1);
        hobj.put('b', 1);
        hobj.put('a', 2);
        hobj.put('b', 2);

        System.out.println(hobj);   // value overwrite




       sobj.close();  

    }
    
}
