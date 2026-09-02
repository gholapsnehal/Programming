///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 61 : Question 2
//  Program Name : InfoClient
//  Description  : Connect to the server, accept commands from the user
//                 and display the information received from the server
//
//  Supported Commands:
//
//      DATE
//      TIME
//      SERVERNAME
//      HELP
//      QUIT
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;
import java.util.*;

class InfoClient
{
    public static void main(String A[])
    {
        try
        {
            Socket sobj = new Socket("localhost", 5100);

            BufferedReader br = new BufferedReader(
                                new InputStreamReader(sobj.getInputStream()));

            PrintWriter pw = new PrintWriter(
                             sobj.getOutputStream(), true);

            Scanner sobjInput = new Scanner(System.in);

            System.out.println("Connected to server");
            System.out.println("Enter command :");

            while(true)
            {
                System.out.print("Client : ");

                String strCommand = sobjInput.nextLine();

                pw.println(strCommand);

                String strResult = br.readLine();

                while(strResult != null && br.ready())
                {
                    System.out.println("Server : " + strResult);
                    strResult = br.readLine();
                }

                if(strResult != null)
                {
                    System.out.println("Server : " + strResult);
                }

                if(strCommand.trim().equalsIgnoreCase("QUIT"))
                {
                    break;
                }
            }

            br.close();
            pw.close();
            sobj.close();
            sobjInput.close();
        }
        catch(IOException e)
        {
            System.out.println("Connection error : " + e.getMessage());
        }
    }
}