/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  DisplayFileContents
// Input:          File name
// Output:         void
// Description:    Accept file name from user and display contents of file
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class FileX
{
    public static void DisplayFileContent(String filename)
    {
        try
        {
            FileInputStream fobj = new FileInputStream(filename);

            int iData = 0;

            while((iData = fobj.read()) != -1)
            {
                System.out.print((char)iData);
            }

            fobj.close();
        }

        catch(FileNotFoundException obj)
        {
            System.out.println("Unable to open a file");
        }

        catch(IOException obj)
        {
            System.out.println("Unable to read file");
        }
    }
}


public class Question28_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String Name = sobj.nextLine();

        FileX.DisplayFileContent(Name);

        sobj.close();
        
    }
    
}
