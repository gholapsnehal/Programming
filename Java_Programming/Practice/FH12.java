//import java.util.*;
import java.io.*;


class FH12
{
    public static void main(String A[])
    {
        // Exception handling
        try
        {
            File fobj = new File("Demo.txt");

             fobj.createNewFile();    
        }

        catch(IOException iobj)
        {
            System.out.println(iobj);

        }
        // optional and generic : 
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
            
    }
}