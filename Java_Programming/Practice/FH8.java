// directory traversal

import java.io.*;
import java.util.*;

class FH8
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;

        System.out.println("Enter directory name : ");
        DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        // to check directory present or not
        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Directory exists");

            File fArr[] = fobj.listFiles();  // data mde files cha aaray bnla

            System.out.println("Number of files in Data Directory : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("File Name : "+fArr[i].getName());
                System.out.println("File Size : "+fArr[i].length());
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}    
