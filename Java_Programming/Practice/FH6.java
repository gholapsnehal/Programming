// directory traversal

import java.io.*;
import java.util.*;

class FH6
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
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}    
