/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  CreateFile
// Input:          File name
// Output:         void
// Description:    Accept file name from user and create new file if it is not existing
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class FileX
{
    public static void CreateFile(String filename)
    {
        try
        {
            File fobj = new File(filename);

            if(fobj.createNewFile())
            {
                System.out.println("File created successfully");
            }
            else
            {
                System.out.println("File already exist");
            }
        }

        catch(IOException obj)
        {
            System.out.println("Unable to create file");
        }
    }
}

public class Question30_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String Name = sobj.nextLine();

        FileX.CreateFile(Name);

        sobj.close();

    }  
    
}
