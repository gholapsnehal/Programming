// problems on string in java
import java.util.*;

class program263
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Arr = null;  // string class reference

        System.out.println("Enter string : ");
        Arr = sobj.nextLine();


        // length() = method to count number of characters
        System.out.println("Length of string is : "+Arr.length());

        sobj.close();

    }
}


