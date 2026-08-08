/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  CreateDirectory
// Input:          Directory name
// Output:         void
// Description:    Accept directory name from user and create that directory
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
import java.io.*;

class FileX
{
    public static void CreateDirectory(String DirectoryName)
    {
        File fobj = new File(DirectoryName);

        System.out.println("Exists : " +fobj.exists());
        System.out.println("IsDirectory : " +fobj.isDirectory());

        if(fobj.mkdir())
        {
            System.out.println("Directory created successfully");
        }
        else
        {
            System.out.println("Unable to create directory or already exist");
        }
    }       
}

public class Question34_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String Name = sobj.nextLine();

        FileX.CreateDirectory(Name);

        sobj.close();

    }     
}