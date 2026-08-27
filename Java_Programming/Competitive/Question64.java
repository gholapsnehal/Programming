///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 52 : Question 1
//  Program Name : HotelBillCalculator
//  Description  : Calculate the final bill for hotel stays, applying a 5% discount if staying > 7 days
//
//  Inputs:
//
//      Number of days stayed (int)
//
//  Validation:
//
//      Days must be >= 0
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class HotelBillCalculator
{
    public void CalculateBill(int iDays)
    {
        double dTotal = iDays * 3000.0;

        if(iDays > 7)
        {
            dTotal = dTotal - (dTotal * 0.05);
        }

        System.out.println("Total Stay Duration: " + iDays + " days");
        System.out.println("Final Bill Amount: ₹" + dTotal);
    }
}

class Question64
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number of Days Stayed: ");
        int iDays = sobj.nextInt();

        if(iDays < 0)
        {
            System.out.println("Invalid Input. Days must be >= 0");
            return;
        }

        HotelBillCalculator hobj = new HotelBillCalculator();
        hobj.CalculateBill(iDays);
    }
}