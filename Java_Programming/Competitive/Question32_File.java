/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  CopyFileData
// Input:          Source file name, Destination file name
// Output:         void
// Description:    Accept two file names from user and copy data from first
//                 file into second file
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
import java.io.*;

class FileX
{
    public static void CopyFileData(String sourceFile, String destinationFile)
    {
        try
        {
            FileInputStream fobj = new FileInputStream(sourceFile);

            FileOutputStream fobj1 = new FileOutputStream(destinationFile);

            int iData = 0;

            while((iData = fobj.read()) != -1)
            {
                fobj1.write(iData);
            }

            fobj.close();
            fobj1.close();

            System.out.println("Data copied successfully");
        }
        catch(FileNotFoundException obj)
        {
            System.out.println("Unable to open file");
        }
        catch(IOException eobj)
        {
            System.out.println("Unable to copy data");
        }
    }
}

public class Question32_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file name : ");
        String Source = sobj.nextLine();

        System.out.println("Enter destination file name : ");
        String Destination = sobj.nextLine();

        FileX.CopyFileData(Source,Destination);

        sobj.close();

    }  
    
}