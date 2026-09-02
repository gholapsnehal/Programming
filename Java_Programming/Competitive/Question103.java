///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 62 : Question 2
//  Description   : Accepts a filename from the user and displays the 
//                  complete contents of that file using FileInputStream
//
//  Input         : File name
//  Output        : Contents of the specified file
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class FileOperations
{
    public void ReadData(String strFileName)
    {
        try
        {
            FileInputStream fiobj = new FileInputStream(strFileName);

            int iRet = 0;

            System.out.println("File contents:\n");

            while((iRet = fiobj.read()) != -1)
            {
                System.out.print((char)iRet);
            }

            System.out.println();

            fiobj.close();
        }
        catch(FileNotFoundException eobj)
        {
            System.out.println("Unable to open file because file does not exist");
        }
        catch(IOException eobj)
        {
            System.out.println("Unable to read data from file");
        }
    }
}

class Question103
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

        fobj.ReadData(strFileName);

        sobj.close();
    }
}