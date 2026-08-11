// FileOutputStrem : write()
// FileInputStream : read()
import java.io.*;
import java.util.*;


class program680
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String Fname = null;
        File fobj = null;
        FileInputStream fiobj = null;
        int iRet = 0;

        System.out.println("Enter file name : ");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        fiobj = new FileInputStream(fobj);   

        //String Data = "Marvellous Infosystems";

        byte Buffer[] = new byte[50];
      
        if(fobj.exists())
        {
            String str = null;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer);

                System.out.print(str);
            }
      
        }

        else
        {
            System.out.println("There is no such file");
        }
    }
}