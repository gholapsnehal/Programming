///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 63 : Question 1
//  Description   : Accepts the path of a directory and displays all files 
//                  and directories with distinguishing tags ([FILE]/[DIR])
//                  and displays sizes for files
//
//  Input         : Directory path
//  Output        : Directory listing showing files with sizes and directories
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

        File FileList[] = fobj.listFiles();

        if(FileList == null || FileList.length == 0)
        {
            System.out.println("Directory is empty");
            return;
        }

        for(int iCnt = 0; iCnt < FileList.length; iCnt++)
        {
            if(FileList[iCnt].isFile())
            {
                System.out.println("[FILE] " + FileList[iCnt].getName() + "\t\t" + FileList[iCnt].length() + " bytes");
            }
            else if(FileList[iCnt].isDirectory())
            {
                System.out.println("[DIR]  " + FileList[iCnt].getName());
            }
        }
    }
}

class Question107
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strDirPath;

        System.out.println("Enter directory: ");
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