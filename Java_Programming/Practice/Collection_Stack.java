// Program is used to demonstrate Stack

import java.lang.*;
import java.io.*;
import java.util.*;

class Collection_Stack
{
    public static void main(String args[]) throws Exception
    {
        // Create Stack of Integers
        Stack<Integer> st = new Stack<Integer>();

        // Insert contents in Stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // Remove top element from Stack
        Integer element = st.pop();

        System.out.println("Popped element is : " + element);

        // Search element in Stack
        int position = 0;

        position = st.search(30);

        if(position == -1)
        {
            System.out.println("There is no such element in stack");
        }

        System.out.println("Element is found at position " + position);

        // Display contents of Stack
        System.out.println("\nStack contains : " + st);
    }
}