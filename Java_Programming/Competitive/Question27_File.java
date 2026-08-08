/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  OpenFile
// Input:          File name
// Output:         void
// Description:    Accept file name from user and open that file
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
import java.io.*;


class FileX
{
    public static void OpenFile(String Filename)
    {
        try
        {
            FileInputStream fobj = new FileInputStream(Filename);

            System.out.println("File opened successfully");

            fobj.close();       
        }

        catch(FileNotFoundException obj)
        {
            System.out.println("Unable to open file");
        }
        catch(IOException obj)
        {
            System.out.println("Unable to close file");
        }
    }
}

public class Question27_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String Name = sobj.nextLine();

        FileX.OpenFile(Name);


        sobj.close();

    }
    
}
