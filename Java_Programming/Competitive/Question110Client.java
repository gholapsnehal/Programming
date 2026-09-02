///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 63 : Question 4 (Client)
//  Description   : Client side program that connects to server and sends a request 
//                  to check whether a file exists on the server machine
//
//  Input         : File name to check
//  Output        : Server response displaying file status
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
    public void CheckFile()
    {
        try
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter command (e.g. EXISTS Demo.txt): ");
            String strInput = sc.nextLine();

            Socket sobj = new Socket("localhost", 2100);

            PrintStream ps = new PrintStream(sobj.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

            ps.println(strInput);

            String strResponse = br.readLine();
            System.out.println("\nServer:\n" + strResponse);

            sobj.close();
            sc.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Unable to connect to server : " + eobj);
        }
    }
}

class Question110Client
{
    public static void main(String A[])
    {
        FileClient fcobj = new FileClient();
        fcobj.CheckFile();
    }
}