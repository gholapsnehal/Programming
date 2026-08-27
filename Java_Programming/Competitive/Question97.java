///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 59 : Question 1
//  Program Name : MatrixTranspose
//  Description  : Accept matrix from user and display transpose of the matrix
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
    public void Transpose(int Arr[][], int iRow, int iCol)
    {
        for(int j = 0; j < iCol; j++)
        {
            for(int i = 0; i < iRow; i++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class Question97
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
        mobj.Transpose(Arr, iRow, iCol);
    }
}