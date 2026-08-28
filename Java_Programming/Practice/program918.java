import java.io.*;
import java.net.*;

public class program918
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("                          Server Started                             ");
            System.out.println("---------------------------------------------------------------------");

            System.out.println("Server is waiting for client request");

            Socket clientSocket = serversocket.accept();

            System.out.println("Client connected suucessfully");

            

        }

        catch(Exception e)
        {
            System.out.println("Exception occurred : "+e);
        }
    }
    
}
