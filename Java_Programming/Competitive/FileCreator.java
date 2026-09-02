///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 61 : Question 3
//  Program Name : FileCreator
//  Description  : Accept a file name from the user and create a new file
//                 on the local machine
//
//  Inputs:
//
//      File name
//
//  Display:
//
//      File name
//      Absolute path
//      File creation status
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class FileOperations
{
    public void CreateFile(String strFileName)
    {
        try
        {
            File fobj = new File(strFileName);

            System.out.println("File name : " + fobj.getName());
            System.out.println("Absolute path : " + fobj.getAbsolutePath());

            if(fobj.exists())
            {
                System.out.println(fobj.getName() + " already exists");
                return;
            }

            if(fobj.createNewFile())
            {
                System.out.println(fobj.getName() + " created successfully");
            }
            else
            {
                System.out.println("File creation failed");
            }
        }
        catch(IOException e)
        {
            System.out.println("File creation error : " + e.getMessage());
        }
    }
}

class FileCreator
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String strFileName = sobj.nextLine();

        if(strFileName.trim().length() == 0)
        {
            System.out.println("Invalid file name");
            return;
        }

        FileOperations fobj = new FileOperations();

        fobj.CreateFile(strFileName);

        sobj.close();
    }
}