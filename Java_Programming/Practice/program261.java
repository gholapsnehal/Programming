// problems on string in java
import java.util.*;

class program261
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Arr = null;  // string class reference

        System.out.println("Enter string : ");
        Arr = sobj.nextLine();

        // ERROR
        
        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);

    }
}


