///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 51 : Question 2
//  Program Name : TrainFareCalculator
//  Description  : Calculates final train fare including Tatkal charges and senior citizen discount
//
//  Inputs:
//
//      Distance in km (double)
//      Class Type (Sleeper / 3AC / 2AC) (String)
//      Booking Hours Before Journey (int)
//      Passenger Age (int)
//
//  Validation:
//
//      Distance must be greater than 0
//      Class Type must be "Sleeper", "3AC", or "2AC"
//      Booking Hours must be non-negative (>= 0)
//      Age must be greater than 0
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class TrainFareCalculator
{
    public void CalculateFare(double dDistance, String classType, int iHoursBefore, int iAge)
    {
        double dRatePerKm = 0.5;
        if(classType.equalsIgnoreCase("3AC"))
        {
            dRatePerKm = 1.5;
        }
        else if(classType.equalsIgnoreCase("2AC"))
        {
            dRatePerKm = 2.5;
        }

        double dBaseFare = dDistance * dRatePerKm;
        double dTatkalCharge = 0.0;
        double dDiscount = 0.0;

        if(iHoursBefore <= 24)
        {
            dTatkalCharge = 0.30 * dBaseFare;
        }

        double dCurrentFare = dBaseFare + dTatkalCharge;

        if(iAge >= 60)
        {
            dDiscount = 0.40 * dCurrentFare;
        }

        double dFinalFare = dCurrentFare - dDiscount;

        System.out.println("\n--- Fare Breakdown ---");
        System.out.println("Base Fare            : Rs." + dBaseFare);
        if(dTatkalCharge > 0)
        {
            System.out.println("Tatkal Surcharge (30%): +Rs." + dTatkalCharge);
        }
        if(dDiscount > 0)
        {
            System.out.println("Senior Citizen (40%)  : -Rs." + dDiscount);
        }
        System.out.println("Final Fare           : Rs." + dFinalFare);
    }
}

class Question60
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Distance (in km): ");
        double dDistance = sobj.nextDouble();

        if(dDistance <= 0)
        {
            System.out.println("Invalid Input. Distance must be greater than 0");
            return;
        }

        System.out.print("Enter Class Type (Sleeper/3AC/2AC): ");
        String classType = sobj.next();

        if(!classType.equalsIgnoreCase("Sleeper") && !classType.equalsIgnoreCase("3AC") && !classType.equalsIgnoreCase("2AC"))
        {
            System.out.println("Invalid Input. Class type must be Sleeper, 3AC, or 2AC");
            return;
        }

        System.out.print("Enter Booking Hours Before Journey: ");
        int iHoursBefore = sobj.nextInt();

        if(iHoursBefore < 0)
        {
            System.out.println("Invalid Input. Booking hours must be non-negative");
            return;
        }

        System.out.print("Enter Age: ");
        int iAge = sobj.nextInt();

        if(iAge <= 0)
        {
            System.out.println("Invalid Input. Age must be greater than 0");
            return;
        }

        TrainFareCalculator tobj = new TrainFareCalculator();
        tobj.CalculateFare(dDistance, classType, iHoursBefore, iAge);
    }
}