///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 52 : Question 5
//  Program Name : TelecomCallBillingSystem
//  Description  : Calculate the final bill charge for call duration based on duration slabs
//
//  Inputs:
//
//      Call duration in minutes (integer)
//
//  Validation:
//
//      Minutes must be >= 0
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class TelecomCallBillingSystem
{
    public void CalculateCallCharge(int iMinutes)
    {
        int iTotalCharge = 0;

        if(iMinutes <= 5)
        {
            iTotalCharge = 0;
        }
        else if(iMinutes <= 15)
        {
            iTotalCharge = (iMinutes - 5) * 1;
        }
        else
        {
            iTotalCharge = (10 * 1) + ((iMinutes - 15) * 2);
        }

        System.out.println("Call Duration: " + iMinutes + " minutes");
        System.out.println("Total Call Charge: ₹" + iTotalCharge);
    }
}

class Question67
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Call Duration (in minutes): ");
        int iMinutes = sobj.nextInt();

        if(iMinutes < 0)
        {
            System.out.println("Invalid Input. Minutes must be >= 0");
            return;
        }

        TelecomCallBillingSystem tobj = new TelecomCallBillingSystem();
        tobj.CalculateCallCharge(iMinutes);
    }
}