///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 53 : Question 2
//  Program Name : CinemaSeatingManager
//  Description  : Manage cinema hall seating using a 2D array, counting booked seats,
//                 finding the row with maximum bookings, and checking for full rows
//
//  Inputs:
//
//      Integer R (rows)
//      Integer C (columns)
//      Next R lines: C integers (0 or 1)
//
//  Validation:
//
//      R > 0
//      C > 0
//      Matrix values must be 0 or 1 only
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CinemaSeatingManager
{
    public void ManageSeating(int Arr[][], int iR, int iC)
    {
        int iTotalBooked = 0;
        int iMaxBookings = -1;
        int iMaxRowIndex = 1;
        boolean bFullRowExists = false;

        for(int i = 0; i < iR; i++)
        {
            int iRowBooked = 0;
            for(int j = 0; j < iC; j++)
            {
                if(Arr[i][j] == 1)
                {
                    iRowBooked++;
                    iTotalBooked++;
                }
            }

            if(iRowBooked > iMaxBookings)
            {
                iMaxBookings = iRowBooked;
                iMaxRowIndex = i + 1;
            }

            if(iRowBooked == iC)
            {
                bFullRowExists = true;
            }
        }

        System.out.println("Total Booked Seats: " + iTotalBooked);
        System.out.println("Row With Maximum Bookings: Row " + iMaxRowIndex);
        System.out.println("Full Row Exists: " + (bFullRowExists ? "Yes" : "No"));
    }
}

class Question69
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        if(!sobj.hasNextInt())
        {
            System.out.println("Invalid Input");
            return;
        }
        int iR = sobj.nextInt();

        if(!sobj.hasNextInt())
        {
            System.out.println("Invalid Input");
            return;
        }
        int iC = sobj.nextInt();

        if(iR <= 0 || iC <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[iR][iC];

        for(int i = 0; i < iR; i++)
        {
            for(int j = 0; j < iC; j++)
            {
                if(!sobj.hasNextInt())
                {
                    System.out.println("Invalid Input");
                    return;
                }
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] != 0 && Arr[i][j] != 1)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        CinemaSeatingManager cobj = new CinemaSeatingManager();
        cobj.ManageSeating(Arr, iR, iC);
    }
}