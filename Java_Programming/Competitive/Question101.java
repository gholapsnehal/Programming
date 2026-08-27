///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 59 : Question 5
//  Program Name : SparseMatrixChecker
//  Description  : Accept matrix and check whether the matrix is a Sparse matrix or not
//                 (Sparse matrix has majority of its elements equal to zero)
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
    public boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int iZeroCount = 0;
        int iTotalElements = iRow * iCol;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iZeroCount++;
                }
            }
        }

        if(iZeroCount > (iTotalElements / 2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Question101
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
        boolean bRet = mobj.ChkSparse(Arr, iRow, iCol);

        if(bRet == true)
        {
            System.out.println("Output : True");
        }
        else
        {
            System.out.println("Output : False");
        }
    }
}