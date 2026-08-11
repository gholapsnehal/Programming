// directory traversal

import java.io.*;
import java.util.*;

class FH5
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;

        System.out.println("Enter directory name : ");
        DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if(fobj.exists())
        {
            System.out.println("Directory exists");
        }
        else
        {
            System.out.println("There is no such directory");
        }
    }
}    
