// Q. matrix
//  OOP

import java.util.*;

class Matrix
{
    private int Arr[][];
    private int iRow;
    private int iCol;
    
    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix constructor");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

   /* protected void finalize()
    {
        System.out.println("Inside finalize method");
        Arr = null;
        System.gc();
    }*/

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of matrix : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }

        }
    }

    public void Display()
    {
        System.out.println("Elements of matrix are : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }

            System.out.println();
        }

    }

}

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow, int iCol)
    {
        super(iRow, iCol);
    }

}


public class program794
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
