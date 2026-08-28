import java.io.*;
import java.net.*;

public class program924
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

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command reeived from client : "+command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");

                    break;
                }

                // filter
                if(parts.length != 3)
                {
                    dos.writeUTF("Invalid command format");
                    continue;
                }

                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]);

                double result = 0;

                // addition logic

                if(operation.equals("ADD"))
                {
                    result = no1 + no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("SUB"))
                {
                    result = no1 - no2;

                    dos.writeUTF("Result is : "+result);
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }  // End of while

            socket.close();
            System.out.println("Client disconnected");

        }
        catch(Exception e)
        {
            System.out.println("EXCEPTION OCCURRED : "+e);
        }

    }



    
} // End of Class
