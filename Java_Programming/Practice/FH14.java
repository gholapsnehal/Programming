//import java.util.*;
import java.io.*;


class FH14
{
    public static void main(String A[])
    {
        // Exception handling
        try
        {
            File fobj = new File("Demo.txt");

            if(fobj.exists())
            {
                System.out.println("File is already exists");
            }
            else
            {
                fobj.createNewFile();  
                System.out.println("File created successfully");

            }             
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