// Q. matrix
//  OOP

import Marvellous.Matrix;

import java.util.*;

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

}


public class program795
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0;
        int i = 0, j = 0;

        System.out.println("Enter number of rows");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        // function call

        mobj.Accept();
        mobj.Display();


        sobj.close();

        // now it will enter in finalize() method
        mobj = null;
        System.gc();            
    }
    
}
