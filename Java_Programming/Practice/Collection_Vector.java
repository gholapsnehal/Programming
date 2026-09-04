// Program is uded to demonstrate vector

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Vector
{
    public static void main(String args[]) throws Exception
    {
        // Create Vector of Integers
        Vector<Integer> ll = new Vector<Integer>();

        // Vector with initial capacity 50
        Vector<Integer> v1 = new Vector<Integer>(50);

        // Vector with capacity 50 and increment 10
        Vector<Integer> v2 = new Vector<Integer>(50,10);

        // Insert contents
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.println("\nContents of Vector \n" + ll);

        // Insert at specified position
        ll.add(3,11);

        System.out.println("\nContents of Vector \n" + ll);

        // Remove element
        ll.remove(3);

        System.out.println("\nContents of Vector \n" + ll);

        // Replace element
        ll.set(3,21);

        System.out.println("\nContents of Vector \n" + ll);

        System.out.println("\nNumber of elements in Vector are : "
                           + ll.size());

        System.out.println("First occurrence of 21 is : "
                           + ll.indexOf(21));

        System.out.println("Last occurrence of 21 is : "
                           + ll.lastIndexOf(21));

        // Iterate Vector
        System.out.println("Iterating the Vector\n");

        Iterator<Integer> it = ll.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next() + " ");
        }

        // Remove all elements
        ll.clear();
    }
}