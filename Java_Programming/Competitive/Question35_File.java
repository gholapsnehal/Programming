/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  CalculateChecksum
// Input:          File name
// Output:         void
// Description:    Accept file name from user and calculate checksum of file
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.security.*;
import java.util.*;
import java.io.*;

class FileX
{
    public static void CalculateChecksum(String filename)
    {
        try
        {
            FileInputStream fobj = new FileInputStream(filename);

            MessageDigest mdobj = MessageDigest.getInstance("MD5");

            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = fobj.read(Buffer)) != -1)
            {
                mdobj.update(Buffer,0,iRet);
            }

            byte Arr[] = mdobj.digest();

            for(byte b : Arr)
            {
                System.out.printf("%02x",b);
            }
            
            System.out.println();

            fobj.close();
        }

        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }       
}

public class Question35_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String Name = sobj.nextLine();

        FileX.CalculateChecksum(Name);

        sobj.close();

    }     
}