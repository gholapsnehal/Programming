///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 63 : Question 5 (Server)
//  Description   : Server side program that listens for client connections and responds with 
//                  detailed file information when receiving the command "INFO <filename>"
//
//  Input         : Command from Client (INFO <filename>)
//  Output        : Detailed file attributes (Name, Size, Readable, Writable, Path) or error message
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

            if(strCommand != null && strCommand.startsWith("INFO "))
            {
                String strFileName = strCommand.substring(5).trim();
                File fobj = new File(strFileName);

                if(fobj.exists() && fobj.isFile())
                {
                    ps.println("File Name     : " + fobj.getName());
                    ps.println("Size          : " + fobj.length() + " bytes");
                    ps.println("Readable      : " + fobj.canRead());
                    ps.println("Writable      : " + fobj.canWrite());
                    ps.println("Absolute Path : " + fobj.getAbsolutePath());
                }
                else
                {
                    ps.println(strFileName + " does not exist on server");
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

class Question111Server
{
    public static void main(String A[])
    {
        FileServer fsobj = new FileServer();
        fsobj.StartServer();
    }
}