import java.io.*;
import java.net.*;
import java.util.*;

public class program919
{
    public static void main(String A[])
    {
        try
        {
            
            System.out.println("---------------------------------------------------------------------");
            System.out.println("                          Client Started                             ");
            System.out.println("---------------------------------------------------------------------");

            Socket socket = new Socket(
                                        "127.0.0.1",
                                        9000
                                        );

            System.err.println("Connection with server is successful");

   
        }

        catch(Exception e)
        {
            System.out.println("Exception occurred : "+e);
        }
    }
    
}
