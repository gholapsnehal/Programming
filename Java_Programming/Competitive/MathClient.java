///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 60 : Question 1
//  Program Name : MathClient
//  Description  : Connect to the mathematical server, accept commands
//                 from the user and display the result received from server
//
//  Supported Commands:
//
//      ADD <No1> <No2>
//      SUB <No1> <No2>
//      MULT <No1> <No2>
//      DIV <No1> <No2>
//      MOD <No1> <No2>
//      MAX <No1> <No2>
//      MIN <No1> <No2>
//      QUIT
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.net.*;
import java.util.*;

class MathClient
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

            System.out.println("Connected to mathematical server");
            System.out.println("Enter command :");

            while(true)
            {
                System.out.print("Client : ");

                String strCommand = sobjInput.nextLine();

                pw.println(strCommand);

                if(strCommand.trim().equalsIgnoreCase("QUIT"))
                {
                    break;
                }

                String strResult = br.readLine();

                System.out.println("Server : " + strResult);
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