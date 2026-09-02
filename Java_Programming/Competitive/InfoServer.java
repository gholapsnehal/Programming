///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 61 : Question 2
//  Program Name : InfoServer
//  Description  : Start a server which provides information about itself
//                 and handles multiple clients using separate threads
//
//  Features:
//
//      1. Server runs continuously.
//      2. Multiple clients are handled using threads.
//      3. Server provides date and time.
//      4. Server provides its name.
//      5. HELP displays all supported commands.
//      6. QUIT disconnects only the current client.
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;

class InfoClientHandler extends Thread
{
    private Socket sobj;

    public InfoClientHandler(Socket sobj)
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

            ServerOperations sobjOperations = new ServerOperations();

            String strCommand;

            while((strCommand = br.readLine()) != null)
            {
                String strResult =
                    sobjOperations.PerformOperation(strCommand);

                if(strResult.equals("QUIT"))
                {
                    pw.println("Client disconnected");
                    break;
                }

                pw.println(strResult);
            }

            br.close();
            pw.close();
            sobj.close();

            System.out.println("Client disconnected");
        }
        catch(IOException e)
        {
            System.out.println("Client disconnected");
        }
    }
}

class InfoServer
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket ssobj = new ServerSocket(5100);

            System.out.println("Server Information System started");
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket sobj = ssobj.accept();

                System.out.println("Client connected : "
                                   + sobj.getInetAddress());

                InfoClientHandler cobj =
                    new InfoClientHandler(sobj);

                cobj.start();
            }
        }
        catch(IOException e)
        {
            System.out.println("Server error : " + e.getMessage());
        }
    }
}