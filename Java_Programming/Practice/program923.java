import java.io.*;
import java.net.*;

public class program923
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("                          Server Started                             ");
            System.out.println("---------------------------------------------------------------------");

            // LOOP FOR MULTIPLE CLIENT REQUESTS
            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientSocket = serversocket.accept();

                System.out.println("Client connected successfully");

                //  Thread gets created for client : arrow function
                Thread t = new Thread(() -> HandleClientRequest(clientSocket));

                t.start();
            }  // End of while
            
        }

        catch(Exception e)
        {
            System.out.println("Exception occurred : "+e);
        }

    } // End of main

//////////////////      function      //////////////////

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // UTF turns any data into binary data
            dos.writeUTF("Connected to Server"); 

        }
        catch(Exception e)
        {
            System.out.println("EXCEPTION OCCURRED : "+e);
        }

    }



    
} // End of Class
