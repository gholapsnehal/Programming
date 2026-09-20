// problems on string in java
import java.util.*;

class program262
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Arr = null;  // string class reference

        System.out.println("Enter string : ");
        Arr = sobj.nextLine();

        // charAt(index) - method to read characters from index
        System.out.println(Arr.charAt(0));
        System.out.println(Arr.charAt(1));
        System.out.println(Arr.charAt(2));

    }
}


