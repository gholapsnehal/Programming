///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 60 : Question 1
//  Program Name : MathServer
//  Description  : Start a mathematical server which accepts multiple clients
//                 and processes each client using a separate thread
//
//  Features:
//
//      1. Server runs continuously.
//      2. Multiple clients are handled using threads.
//      3. Mathematical commands are processed.
//      4. Invalid commands are handled.
//      5. Division by zero is handled.
//      6. QUIT disconnects only the current client.
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;

class ClientHandler extends Thread
{
    private Socket sobj;

    public ClientHandler(Socket sobj)
    {
        this.sobj = sobj;
    }

    public void run()
    {
        try
        {
            BufferedReader br = new BufferedReader(
                                new InputStreamReader(sobj.getInputStream()));

            PrintWriter pw = new PrintWriter(
                             sobj.getOutputStream(), true);

            MathOperations mobj = new MathOperations();

            String strCommand;

            while((strCommand = br.readLine()) != null)
            {
                String strResult = mobj.PerformOperation(strCommand);

                if(strResult.equals("QUIT"))
                {
                    break;
                }

                pw.println(strResult);
            }

            br.close();
            pw.close();
            sobj.close();
        }
        catch(IOException e)
        {
            System.out.println("Client disconnected");
        }
    }
}

class MathServer
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket ssobj = new ServerSocket(5100);

            System.out.println("Mathematical Server started");
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket sobj = ssobj.accept();

                System.out.println("Client connected : "
                                   + sobj.getInetAddress());

                ClientHandler cobj = new ClientHandler(sobj);

                cobj.start();
            }
        }
        catch(IOException e)
        {
            System.out.println("Server error : " + e.getMessage());
        }
    }
}