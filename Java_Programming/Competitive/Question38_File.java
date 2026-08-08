/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  WriteFileNames
// Input:          Directory name
// Output:         void
// Description:    Accept directory name from user and write names of all files
//                 from that directory into Marvellous.txt
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class FileX
{
    public static void WriteFileNames(String DirectoryName)
    {
        try
        {
            File fobj = new File(DirectoryName);

            if(fobj.exists() && fobj.isDirectory())
            {
                File Arr[] = fobj.listFiles();

                FileOutputStream obj = new FileOutputStream("Marvellous.txt");

                for(File file : Arr)
                {
                    if(file.isFile())
                    {
                        String str = file.getName() + "\n";

                        obj.write(str.getBytes());
                    }
                }

                obj.close();

                System.out.println("Data written successfully");
            }
            else
            {
                System.out.println("Invalid directory");
            }    
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }        
    }
}

public class Question38_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String Name = sobj.nextLine();

        FileX.WriteFileNames(Name);

        sobj.close();

    }
    
}
