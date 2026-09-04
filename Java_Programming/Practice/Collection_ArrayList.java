// Program is used to demonstrate ArrayList

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_ArrayList
{
    public static void main(String args[]) throws Exception
    {
        // Create ArrayList of Strings
        ArrayList<String> ll = new ArrayList<String>();

        // Insert the contents in ArrayList
        ll.add("First");
        ll.add("Second");
        ll.add("Third");
        ll.add("Fourth");
        ll.add("Fifth");

        System.out.println("\nContents of ArrayList \n" + ll);

        // Insert data at specified position
        ll.add(3, "new");

        System.out.println("\nContents of ArrayList \n" + ll);

        // Insert data at last
        ll.add("Two");

        System.out.println("\nContents of ArrayList \n" + ll);

        // Remove element from specified position
        ll.remove(3);

        System.out.println("\nContents of ArrayList \n" + ll);

        // Replace element from specified position
        ll.set(3, "New_Data");

        System.out.println("\nContents of ArrayList \n" + ll);

        System.out.println("\nNumber of elements in ArrayList are : "
                           + ll.size());

        System.out.println("\nFirst occurrence of Third is : "
                           + ll.indexOf("Third"));

        System.out.println("\nLast occurrence of Third is : "
                           + ll.lastIndexOf("Third"));

        // Iterate using Iterator
        System.out.println("\nIterating the ArrayList\n");

        Iterator<String> it = ll.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next() + " ");
        }

        // Remove all elements
        ll.clear();
    }
}