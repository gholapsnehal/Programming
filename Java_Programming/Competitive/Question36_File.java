/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  DisplayFileInfo
// Input:          Directory name
// Output:         void
// Description:    Accept directory name from user and display information
//                 of all files and size from that directory
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class FileX
{
    public static void DisplayFileInfo(String DirectoryName)
    {
        File fobj = new File(DirectoryName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File Arr[] = fobj.listFiles();

            for(File file : Arr)
            {
                if(file.isFile())
                {
                    System.out.println("-------------------------------------------------");
                    System.out.println("File Name : "+file.getName());
                    System.out.println("File Size : "+file.length() + " bytes");
                    System.out.println("-------------------------------------------------");
                }
            }
        }
        else
        {
            System.out.println("Invalid Directory");
        }
    }       
}

public class Question36_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String Name = sobj.nextLine();

        FileX.DisplayFileInfo(Name);

        sobj.close();

    }     
}