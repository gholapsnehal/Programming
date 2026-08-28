import java.io.*;
import java.net.*;
import java.util.*;

public class program925
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("                          Client Started                             ");
            System.out.println("---------------------------------------------------------------------");

            Socket socket = new Socket(
                                        "127.0.0.1",
                                        9000
                                        );

            System.err.println("Connection with server is successfull");

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());  // server dis line print hoel

            while(true)
            {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("                        Mathematical Commands                        ");
                System.out.println("---------------------------------------------------------------------");

                System.out.println("Enter Command : ");
                String command = sobj.nextLine();

                dos.writeUTF(command);

                String response = dis.readUTF();

                System.out.println(response);
            } // End of while

   
        }

        catch(Exception e)
        {
            System.out.println("Exception occurred : "+e);
        }


        sobj.close();
    }
    
}
