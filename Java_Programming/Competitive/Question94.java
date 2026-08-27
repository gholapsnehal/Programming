///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 58 : Question 3
//  Program Name : MatrixMaxDiagonalFinder
//  Description  : Accept matrix from user and return largest number from both the diagonals
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
    public int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int iMax = Arr[0][0];

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if((i == j) || (i + j == iRow - 1))
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }

        return iMax;
    }
}

class Question94
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
        int iRet = mobj.MaxDiagonal(Arr, iRow, iCol);

        System.out.println("Output : " + iRet);
    }
}