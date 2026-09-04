// Program is used to demonstrate Hashtable

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Hashtable
{
    public static void main(String args[]) throws Exception
    {
        // Where String is key and Integer is value
        Hashtable<String,Integer> ht =
            new Hashtable<String,Integer>();

        // Insert contents in Hashtable
        ht.put("Marvellous",10);
        ht.put("Demo",20);

        if(ht.containsKey("Marvellous"))
        {
            System.out.println("Dont insert as key is there");
        }
        else
        {
            System.out.println("Insert new key");
        }

        if(ht.containsValue(10))
        {
            System.out.println("Dont insert as value is there");
        }
        else
        {
            System.out.println("Insert new value");
        }

        // Enumerate Hashtable
        System.out.println("Enumerating the Hashtable\n");

        Enumeration<String> it = ht.keys();

        while(it.hasMoreElements())
        {
            System.out.println(it.nextElement() + " ");
        }

        // Retrieve value using key
        System.out.println("Value of Marvellous is "
                           + ht.get("Marvellous"));

        // Remove element by key
        // ht.remove("Infosys");

        // Size of Hashtable
        System.out.println("Size of hash table is "
                           + ht.size());

        // Remove all elements
        ht.clear();
    }
}