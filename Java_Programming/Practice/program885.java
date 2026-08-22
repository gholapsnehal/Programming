import java.util.*;

public class program885
{
    public static void main(String A[])
    {
        int Arr[] = {10,13,7,21,15};

        // It shows the hashcode
        //System.out.println(Arr);

        
        // Actual Array
        System.out.println("Actual Array : ");
        for(int no : Arr)
        {
            System.out.print(no+"\t");
        }

        System.out.println();

        // To sort array in built class
        Arrays.sort(Arr);

        System.out.println("Sorted Array :");
        for(int no : Arr)
        {
            System.out.print(no+"\t");
        }

        System.out.println();

    }
    
}
