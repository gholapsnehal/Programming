// Program is used to demonstrate Linked List

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_LinkedList
{
    public static void main(String args[]) throws Exception
    {
        // Create LinkedList of String
        LinkedList<String> ll = new LinkedList<String>();

        // Insert the contents in LinkedList
        ll.add("First");
        ll.add("Second");
        ll.add("Third");
        ll.add("Fourth");
        ll.add("Fifth");

        System.out.println("\nContents of linked list \n" + ll);

        // Insert data at specified position
        ll.add(3, "new");

        System.out.println("\nContents of linked list \n" + ll);

        // Insert data at first position
        ll.addFirst("One");

        System.out.println("\nContents of linked list \n" + ll);

        // Insert data at last
        ll.add("Two");

        System.out.println("\nContents of linked list \n" + ll);

        // Remove first element
        ll.removeFirst();

        System.out.println("\nContents of linked list \n" + ll);

        // Remove last element
        ll.removeLast();

        System.out.println("\nContents of linked list \n" + ll);

        // Remove element from specified position
        ll.remove(3);

        System.out.println("\nContents of linked list \n" + ll);

        // Replace element from specified position
        ll.set(3, "New_Data");

        System.out.println("\nContents of linked list \n" + ll);

        System.out.println("\nNumber of elements in linked list are : "
                           + ll.size());

        System.out.println("\nFirst occurrence of Third is : "
                           + ll.indexOf("Third"));

        System.out.println("\nLast occurrence of Third is : "
                           + ll.lastIndexOf("Third"));

        // Iterate using Iterator
        System.out.println("\nIterating the linked list\n");

        Iterator<String> it = ll.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next() + " ");
        }
    }
}