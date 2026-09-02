///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 62 : Question 3
//  Description   : Accepts the names of a source file and destination file
//                  and copies all data from the source into the destination
//
//  Input         : Source file name and Destination file name
//  Output        : Data copied successfully
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class FileOperations
{
    public void CopyData(String strSource, String strDest)
    {
        try
        {
            FileInputStream fiobj = new FileInputStream(strSource);
            FileOutputStream foobj = new FileOutputStream(strDest);

            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            fiobj.close();
            foobj.close();

            System.out.println("File copied successfully");
        }
        catch(FileNotFoundException eobj)
        {
            System.out.println("Unable to open file because file does not exist");
        }
        catch(IOException eobj)
        {
            System.out.println("Unable to copy file contents");
        }
    }
}

class Question104
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strSource;
        String strDest;

        System.out.println("Enter source file:");
        strSource = sobj.nextLine();

        System.out.println("Enter destination file:");
        strDest = sobj.nextLine();

        if(strSource.length() == 0 || strDest.length() == 0)
        {
            System.out.println("Invalid file name");
            return;
        }

        FileOperations fobj = new FileOperations();

        fobj.CopyData(strSource, strDest);

        sobj.close();
    }
}