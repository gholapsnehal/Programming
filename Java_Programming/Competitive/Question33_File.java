/////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:  CheckRegularFile
// Input:          File name
// Output:         void
// Description:    Accept file name from user and check whether it is
//                 regular file or not
// Date:           07/08/2026
// Author:         Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.*;
import java.io.*;

class FileX
{
    public static void CheckRegularFile(String filename)
    {
        File fobj = new File(filename);

        System.out.println("Exists : " +fobj.exists());
        System.out.println("IsFile : " +fobj.isFile());

        if(fobj.exists() && fobj.isFile())
        {
            System.out.println("It is regular file");
        }
        else
        {
            System.out.println("It is not a regular file");
        }
    }       
}

public class Question33_File 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String Name = sobj.nextLine();

        FileX.CheckRegularFile(Name);

        sobj.close();

    }     
}