///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 63 : Question 2
//  Description   : Accepts a directory path and a filename from the user 
//                  and searches for the specified file inside the directory
//
//  Input         : Directory path and File name
//  Output        : File information if found, or search failure message
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Scanner;

class FileOperations
{
    public void SearchFile(String strDirPath, String strFileName)
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
        boolean bFlag = false;

        if(FileList != null)
        {
            for(int iCnt = 0; iCnt < FileList.length; iCnt++)
            {
                if(FileList[iCnt].isFile() && FileList[iCnt].getName().equalsIgnoreCase(strFileName))
                {
                    System.out.println("File found\n");
                    System.out.println("Name : " + FileList[iCnt].getName());
                    System.out.println("Size : " + FileList[iCnt].length() + " bytes");
                    System.out.println("Path : " + FileList[iCnt].getAbsolutePath());
                    bFlag = true;
                    break;
                }
            }
        }

        if(bFlag == false)
        {
            System.out.println(strFileName + " not found");
        }
    }
}

class Question108
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strDirPath;
        String strFileName;

        System.out.println("Enter directory :");
        strDirPath = sobj.nextLine();

        System.out.println("Enter file to search :");
        strFileName = sobj.nextLine();

        if(strDirPath.length() == 0)
        {
            System.out.println("Invalid directory path");
            return;
        }

        if(strFileName.length() == 0)
        {
            System.out.println("Invalid file name");
            return;
        }

        FileOperations fobj = new FileOperations();

        fobj.SearchFile(strDirPath, strFileName);

        sobj.close();
    }
}