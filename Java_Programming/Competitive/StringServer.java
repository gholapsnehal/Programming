///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 61 : Question 1
//  Program Name : StringServer
//  Description  : Start a string operation server which accepts multiple
//                 clients and processes each client using a separate thread
//
//  Features:
//
//      1. Server runs continuously.
//      2. Multiple clients are handled using threads.
//      3. Server identifies the requested operation.
//      4. Invalid commands are handled properly.
//      5. QUIT disconnects only the current client.
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;

class StringClientHandler extends Thread
{
    private Socket sobj;

    public StringClientHandler(Socket sobj)
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

            StringOperations strobj = new StringOperations();

            String strCommand;

            while((strCommand = br.readLine()) != null)
            {
                String strResult = strobj.PerformOperation(strCommand);

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

class StringServer
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket ssobj = new ServerSocket(5100);

            System.out.println("String Operation Server started");
            System.out.println("Waiting for clients...");

            while(true)
            {
                Socket sobj = ssobj.accept();

                System.out.println("Client connected : "
                                   + sobj.getInetAddress());

                StringClientHandler cobj =
                    new StringClientHandler(sobj);

                cobj.start();
            }
        }
        catch(IOException e)
        {
            System.out.println("Server error : " + e.getMessage());
        }
    }
}