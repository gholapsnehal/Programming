///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 61 : Question 1
//  Program Name : StringClient
//  Description  : Connect to the string operation server, accept commands
//                 from the user and display the result received from server
//
//  Supported Commands:
//
//      LENGTH <string>
//      UPPER <string>
//      LOWER <string>
//      REVERSE <string>
//      PALINDROME <string>
//      VOWELS <string>
//      QUIT
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;
import java.util.*;

class StringClient
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

            System.out.println("Connected to string operation server");
            System.out.println("Enter command :");

            while(true)
            {
                System.out.print("Client : ");

                String strCommand = sobjInput.nextLine();

                pw.println(strCommand);

                String strResult = br.readLine();

                System.out.println("Server : " + strResult);

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