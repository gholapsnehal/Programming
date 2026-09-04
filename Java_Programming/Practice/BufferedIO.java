import java.io.*;

class BufferedIO
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name : ");
        String name = bobj.readLine();      // Checked Exception

        System.out.println("Hello "+name);
    }
}


/*
   throws error:
   BufferedIO.java:10: error: unreported exception IOException; must be caught or declared to be thrown
        String name = bobj.readLine();      // Checked Exception
                                   ^
1 error
error: compilation failed

*/