///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 63 : Question 4 (Server)
//  Description   : Server side program that listens for client connections and checks 
//                  if the requested file exists on the server machine
//
//  Input         : Command from Client (EXISTS <filename>)
//  Output        : Response indicating whether file exists or not
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class FileServer
{
    public void StartServer()
    {
        try
        {
            ServerSocket ssobj = new ServerSocket(2100);
            System.out.println("Server is running on port 2100 and waiting for client connection...");

            Socket sobj = ssobj.accept();
            System.out.println("Client connected successfully");

            BufferedReader br = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
            PrintStream ps = new PrintStream(sobj.getOutputStream());

            String strCommand = br.readLine();

            if(strCommand != null && strCommand.startsWith("EXISTS "))
            {
                String strFileName = strCommand.substring(7).trim();
                File fobj = new File(strFileName);

                if(fobj.exists() && fobj.isFile())
                {
                    ps.println(strFileName + " exists on server");
                }
                else
                {
                    ps.println(strFileName + " does not exist");
                }
            }
            else
            {
                ps.println("Invalid Command");
            }

            sobj.close();
            ssobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occurred : " + eobj);
        }
    }
}

class Question110Server
{
    public static void main(String A[])
    {
        FileServer fsobj = new FileServer();
        fsobj.StartServer();
    }
}