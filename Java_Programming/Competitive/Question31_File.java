/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  DisplayFiles
// Input:          Directory name
// Output:         void
// Description:    Accept directory name from user and display names of all files
//                 from that directory
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
import java.io.*;

class FileX
{
    public static void DisplayFiles(String DirectoryName)
    {
        File fobj = new File(DirectoryName);

        System.out.println("Path : "+DirectoryName);
        System.out.println("Exists : "+fobj.exists());
        System.out.println("IsDirectory : "+fobj.isDirectory());

        if(fobj.exists() && fobj.isDirectory())
        {
            File Arr[] = fobj.listFiles();

            for(File file : Arr)
            {
                if(file.isFile())
                {
                    System.out.println(file.getName());
                }
            }
        }
        else
        {
            System.out.println("Invalid Directory");
        }
    }
}


public class Question31_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String Name = sobj.nextLine();

        FileX.DisplayFiles(Name);

        sobj.close();

    }  
    
}