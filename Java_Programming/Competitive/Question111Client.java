///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 63 : Question 5 (Client)
//  Description   : Client side program that connects to server and requests file 
//                  information using the format "INFO <filename>"
//
//  Input         : File name request command
//  Output        : Server response displaying detailed file information
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

class FileClient
{
    public void GetFileInfo()
    {
        try
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter command (e.g. INFO Demo.txt): ");
            String strInput = sc.nextLine();

            Socket sobj = new Socket("localhost", 2100);

            PrintStream ps = new PrintStream(sobj.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

            ps.println(strInput);

            System.out.println("\nServer:\n");
            String strResponse;
            while((strResponse = br.readLine()) != null)
            {
                System.out.println(strResponse);
            }

            sobj.close();
            sc.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Unable to connect to server : " + eobj);
        }
    }
}

class Question111Client
{
    public static void main(String A[])
    {
        FileClient fcobj = new FileClient();
        fcobj.GetFileInfo();
    }
}