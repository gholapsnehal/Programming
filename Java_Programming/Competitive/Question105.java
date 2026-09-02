///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 62 : Question 4
//  Description   : Accepts a filename from the user and displays detailed 
//                  information about that file using the File class
//
//  Input         : File name
//  Output        : Detailed file properties
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Date;
import java.util.Scanner;

class FileOperations
{
    public void DisplayFileInfo(String strFileName)
    {
        File fobj = new File(strFileName);

        if(fobj.exists())
        {
            System.out.println("File Name     : " + fobj.getName());
            System.out.println("Absolute Path : " + fobj.getAbsolutePath());
            System.out.println("File Size     : " + fobj.length() + " bytes");
            System.out.println("Readable      : " + fobj.canRead());
            System.out.println("Writable      : " + fobj.canWrite());
            System.out.println("Hidden        : " + fobj.isHidden());
            System.out.println("Last Modified : " + new Date(fobj.lastModified()));
        }
        else
        {
            System.out.println("File does not exist");
        }
    }
}

class Question105
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strFileName;

        System.out.println("Enter file name:");
        strFileName = sobj.nextLine();

        if(strFileName.length() == 0)
        {
            System.out.println("Invalid file name");
            return;
        }

        FileOperations fobj = new FileOperations();

        fobj.DisplayFileInfo(strFileName);

        sobj.close();
    }
}