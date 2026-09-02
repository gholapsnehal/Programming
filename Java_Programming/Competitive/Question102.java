///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 62 : Question 1
//  Description   : Accepts a filename and textual data from the user
//                  and writes the data into the specified file
//
//  Input         : File name and textual data
//  Output        : Data written successfully
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class FileOperations
{
    public void WriteData(String strFileName, String strData)
    {
        try
        {
            FileOutputStream foobj = new FileOutputStream(strFileName);

            for(int iCnt = 0; iCnt < strData.length(); iCnt++)
            {
                foobj.write(strData.charAt(iCnt));
            }

            foobj.close();

            System.out.println("Data written successfully");
        }
        catch(IOException eobj)
        {
            System.out.println("Unable to write data into file");
        }
    }
}

class Question102
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strFileName;
        String strData;

        System.out.println("Enter file name:");
        strFileName = sobj.nextLine();

        System.out.println("Enter data:");
        strData = sobj.nextLine();

        if(strFileName.length() == 0)
        {
            System.out.println("Invalid file name");
            return;
        }

        if(strData.length() == 0)
        {
            System.out.println("Invalid data");
            return;
        }

        FileOperations fobj = new FileOperations();

        fobj.WriteData(strFileName, strData);

        sobj.close();
    }
}