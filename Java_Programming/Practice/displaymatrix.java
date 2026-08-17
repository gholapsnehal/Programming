// Questions on Matrix


import java.util.*;

class Matrix
{
    protected int Arr[][];
    protected int iRow;
    protected int iCol;
    
    public Matrix(int iRow, int iCol)
    {
        System.out.println("Inside matrix constructor");

        this.iRow = iRow;
        this.iCol = iCol;

        Arr = new int[iRow][iCol];
    }

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

        sobj.close();
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

    public int SummationAll()
    {
        int sum = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                sum = sum + Arr[i][j];
            }
        }

        return sum;
    }

    // summation of rows

    public void SummationRows()
    {
        int sum = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                sum = sum + Arr[i][j];
            }

            System.out.println("Summation of rows : "+i+" is : "+sum);

            sum = 0;  // reserted sum
        }        
    }

    // find maximum elements from matrix

    public int maximumAll()
    {
        int max = 0;

        max = Arr[0][0];

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] > max)
                {
                    max = Arr[i][j];
                }               
            }
        }

        return max;
    }

    // find minimum of matrix element

    public int minimumAll()
    {
        int min = 0;

        min = Arr[0][0];

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][i] < min)
                {
                    min = Arr[i][j];
                }               
            }
        }

        return min;
    }

}


public class displaymatrix
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRow = 0, iCol = 0, iRet = 0;

        System.out.println("Enter number of rows");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns");
        iCol = sobj.nextInt();

        MatrixLB mobj = new MatrixLB(iRow, iCol);

        // function call

        mobj.Accept();
        mobj.Display();

        iRet = mobj.SummationAll();

        System.out.println("Summation of all elements of matrix : "+iRet);

        mobj.SummationRows();

        iRet = mobj.maximumAll();
        System.out.println("Maximum number is : "+iRet);


        iRet = mobj.minimumAll();
        System.out.println("Minimum number is : "+iRet);

        sobj.close();

        // now it will enter in finalize() method
        mobj = null;
        System.gc();            
    }
    
}
