//import java.util.*;
import java.io.*;


class FH13
{
    public static void main(String A[])
    {
        // Exception handling
        try
        {
            File fobj = new File("Demo.txt");

            System.out.println(fobj.exists());
        }

        // optional and generic : 
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
            
    }
}