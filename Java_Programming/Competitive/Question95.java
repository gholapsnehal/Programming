///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 58 : Question 4
//  Program Name : MatrixColumnAdder
//  Description  : Accept matrix from user and display addition of elements from each column
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
    public void AddColumn(int Arr[][], int iRow, int iCol)
    {
        for(int j = 0; j < iCol; j++)
        {
            int iSum = 0;
            for(int i = 0; i < iRow; i++)
            {
                iSum += Arr[i][j];
            }
            System.out.print(iSum + "  ");
        }
        System.out.println();
    }
}

class Question95
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
        System.out.print("Output : ");
        mobj.AddColumn(Arr, iRow, iCol);
    }
}