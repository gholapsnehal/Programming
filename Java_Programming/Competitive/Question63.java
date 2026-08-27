///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 51 : Question 5
//  Program Name : CinemaSeatBookingSystem
//  Description  : Validates cinema seat availability, applies row pricing, and calculates group discount
//
//  Inputs:
//
//      Total Rows & Columns (int)
//      Booked Seats Count & Seat Identifiers (String array e.g., A1, B2)
//      Requested Seats Count & Seat Identifiers (String array)
//
//  Validation:
//
//      Rows and Columns must be greater than 0
//      Requested seats must not be already booked
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CinemaSeatBookingSystem
{
    public void BookSeats(int iRows, int iCols, HashSet<String> bookedSeats, List<String> requestedSeats)
    {
        for(String seat : requestedSeats)
        {
            if(bookedSeats.contains(seat.toUpperCase()))
            {
                System.out.println("Booking Status: Failed");
                System.out.println("Reason        : Seat " + seat + " is already booked.");
                return;
            }
        }

        double dTotalCost = 0.0;
        for(String seat : requestedSeats)
        {
            char rowChar = Character.toUpperCase(seat.charAt(0));
            if(rowChar <= 'B')
            {
                dTotalCost += 300.0; // Premium Rows (A, B)
            }
            else
            {
                dTotalCost += 200.0; // Standard Rows (C and above)
            }
        }

        if(requestedSeats.size() >= 6)
        {
            dTotalCost = dTotalCost - (0.10 * dTotalCost); // 10% Group Discount
        }

        int iTotalSeats = iRows * iCols;
        int iRemainingSeats = iTotalSeats - (bookedSeats.size() + requestedSeats.size());

        System.out.println("Booking Status : Success");
        System.out.println("Total Cost     : Rs." + dTotalCost);
        System.out.println("Remaining Seats: " + iRemainingSeats);
    }
}

class Question63
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Total Rows: ");
        int iRows = sobj.nextInt();

        System.out.print("Enter Total Columns: ");
        int iCols = sobj.nextInt();

        if(iRows <= 0 || iCols <= 0)
        {
            System.out.println("Invalid Input. Rows and Columns must be greater than 0");
            return;
        }

        System.out.print("Enter Number of Already Booked Seats: ");
        int iBookedCount = sobj.nextInt();
        HashSet<String> bookedSeats = new HashSet<>();
        
        System.out.println("Enter Already Booked Seats (e.g., A1 B2):");
        for(int i = 0; i < iBookedCount; i++)
        {
            bookedSeats.add(sobj.next().toUpperCase());
        }

        System.out.print("Enter Number of Seats to Book: ");
        int iRequestCount = sobj.nextInt();
        List<String> requestedSeats = new ArrayList<>();

        System.out.println("Enter Seats to Book (e.g., A3 A4):");
        for(int i = 0; i < iRequestCount; i++)
        {
            requestedSeats.add(sobj.next().toUpperCase());
        }

        CinemaSeatBookingSystem cobj = new CinemaSeatBookingSystem();
        cobj.BookSeats(iRows, iCols, bookedSeats, requestedSeats);
    }
}