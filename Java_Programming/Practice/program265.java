// problems on string in java
import java.util.*;

class program265
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Arr = null;  // string class reference

        System.out.println("Enter string : ");
        Arr = sobj.nextLine();


        // length() = method to count number of characters
        System.out.println("Length of string is : "+Arr.length());

        char str[] = Arr.toCharArray(); // method to convert string into character array
        int i = 0;

        for(i = 0; i < str.length; i++)  // in array length is property
        {
            System.out.println(str[i]);
        }

        sobj.close();

    }
}


