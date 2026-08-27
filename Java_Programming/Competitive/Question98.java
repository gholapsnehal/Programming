///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 59 : Question 2
//  Program Name : MatrixRowReverser
//  Description  : Accept matrix from user and reverse the contents of each row
//
//  Inputs:
//
//      Two-dimensional integer array Arr
//      Number of rows iRow
//      Number of columns iCol
//
//  Validation:
//
//      Matrix dimensions must be positive (iRow > 0, iCol > 0)
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class MatrixOperations
{
    public void ReverseRow(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iRow; i++)
        {
            int iStart = 0;
            int iEnd = iCol - 1;

            while(iStart < iEnd)
            {
                int temp = Arr[i][iStart];
                Arr[i][iStart] = Arr[i][iEnd];
                Arr[i][iEnd] = temp;

                iStart++;
                iEnd--;
            }
        }

        // Display matrix after reversing each row
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class Question98
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int iRow = sobj.nextInt();

        System.out.print("Enter number of columns: ");
        int iCol = sobj.nextInt();

        if(iRow <= 0 || iCol <= 0)
        {
            System.out.println("Invalid dimensions. Rows and columns must be greater than 0");
            return;
        }

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        MatrixOperations mobj = new MatrixOperations();
        System.out.println("Output :");
        mobj.ReverseRow(Arr, iRow, iCol);
    }
}