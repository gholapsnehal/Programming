import java.util.*;

public class program888
{
    public static void main(String A[])
    {
        Integer Arr[] = {10,13,34,21,15,7,24};

        // It shows the hashcode
        //System.out.println(Arr);

        
        // Actual Array
        System.out.println("Actual Array : ");
        for(int no : Arr)
        {
            System.out.print(no+"\t");
        }

        System.out.println();

        int index = Arrays.binarySearch(Arr, 27);

        if(index >= 0)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("There is no such element");
        }

        // Display Array
        for(int no : Arr)
        {
            System.out.print(no+"\t");
        }

        System.out.println();

    }
    
}
