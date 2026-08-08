/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  WriteDataAtEnd
// Input:          File name, Data
// Output:         void
// Description:    Accept file name from user and write data at the end of file
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

class FileX
{
    public static void WriteDataAtEnd(String filename, String Data)
    {
        try
        {
            FileOutputStream fobj = new FileOutputStream(filename, true);

            byte Arr[] = Data.getBytes();

            fobj.write(Arr);

            fobj.close();

            System.out.println("Data written successfully");
        }

        catch(FileNotFoundException obj)
        {
            System.out.println("Unable to open file");
        }
        catch(IOException obj)
        {
            System.out.println("Unable to write data");
        }
    }
}

public class Question29_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String Name = sobj.nextLine();

        System.out.println("Enter data : ");
        String str = sobj.nextLine();

        FileX.WriteDataAtEnd(Name, str);

        sobj.close();

    }  
    
}
