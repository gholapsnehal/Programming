/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  WriteFileData
// Input:          Directory name
// Output:         void
// Description:    Accept directory name from user and write data of all files
//                 from that directory into Marvellous.txt
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class FileX
{
    public static void WriteFileData(String DirectoryName)
    {
        try
        {
            File fobj = new File(DirectoryName);

            if(fobj.exists() && fobj.isDirectory())
            {
                File Arr[] = fobj.listFiles();

                FileOutputStream obj = new FileOutputStream("Marvellous.txt");

                byte Buffer[] = new byte[1024];
                int iRet = 0;

                for(File file : Arr)
                {
                    if(file.isFile())
                    {
                        FileInputStream fiobj = new FileInputStream(file);

                        while((iRet = fiobj.read(Buffer)) != -1)
                        {
                            obj.write(Buffer,0,iRet);
                        }

                        fiobj.close();
                    }
                }

                obj.close();

                System.out.println("Data copied successfully");
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

public class Question39_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name : ");
        String Name = sobj.nextLine();

        FileX.WriteFileData(Name);

        sobj.close();
    }
    
}
