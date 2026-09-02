///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 62 : Question 5
//  Description   : Accepts the path of a directory and displays all files 
//                  and directories present inside it
//
//  Input         : Directory path
//  Output        : List of files and directories inside the path
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class FileOperations
{
    public void DisplayDirectoryContents(String strDirPath)
    {
        File fobj = new File(strDirPath);

        if(!fobj.exists())
        {
            System.out.println("The specified path does not exist");
            return;
        }

        if(!fobj.isDirectory())
        {
            System.out.println("The specified path is not a directory");
            return;
        }

        String Arr[] = fobj.list();

        if(Arr == null || Arr.length == 0)
        {
            System.out.println("Directory is empty");
            return;
        }

        System.out.println("Contents:");
        System.out.println();

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class Question106
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strDirPath;

        System.out.println("Enter directory:");
        strDirPath = sobj.nextLine();

        if(strDirPath.length() == 0)
        {
            System.out.println("Invalid directory path");
            return;
        }

        FileOperations fobj = new FileOperations();

        fobj.DisplayDirectoryContents(strDirPath);

        sobj.close();
    }
}