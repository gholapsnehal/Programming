import java.util.*;

class program267
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = new String(); // reference

        System.out.println(str.length());

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        System.out.println("String is : "+str);

        System.out.println(str.length());


        sobj.close();
        
    }
    
}

/*
0
Enter String :
Jay Ganesh
String is : Jay Ganesh
1
 */

