// Q. matrix
// 

import java.util.*;

public class program788
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;

        System.out.println("Enter number of rows");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns");
        iCol = sobj.nextInt();


        int Arr[][] = new int[iRow][iCol];

        System.out.println("length of array : "+Arr.length);
        System.out.println("length of row : "+Arr[0].length);


        sobj.close();
       
        
    }
    
}
