// FileOutputStrem : write()
// FileInputStream : read()
import java.io.*;
import java.util.*;


class FH4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String FnameSrc = null;
        String FnameDest = null;

        File fobjSrc = null;
        File fobjdest = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;
        int iRet = 0;

        System.out.println("Enter source name : ");
        FnameSrc = sobj.nextLine();

        System.out.println("Enter destination name : ");
        FnameDest = sobj.nextLine();

        fobjSrc = new File(FnameSrc);
        fobjdest = new File(FnameDest);

        fiobj = new FileInputStream(fobjSrc);  
        foobj = new FileOutputStream(fobjdest); 

        fobjdest.createNewFile();

        byte Buffer[] = new byte[100];
      
        if(fobjSrc.exists())
        {
           // String str = null;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }

            fiobj.close();
            foobj.close();

            System.out.println("Data copied successfully");           
        }

        else
        {
            System.out.println("There is no such file");
        }
    }
}