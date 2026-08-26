///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 50 : Question 1
//  Program Name : RideFareCalculator
//  Description  : Calculate trip fare based on distance travelled and
//                 whether the trip occurred during peak hours
//                 Peak hours attract an additional surcharge
//
//  Rules:
//
//      Base Fare           -> Rs.50
//      First 10 km         -> Rs.12 per km
//      Beyond 10 km        -> Rs.15 per km
//      Peak Hours          -> 20% extra on total fare
//
//  Validation:
//
//      Distance cannot be negative
//      Peak Hour input must be Yes or No only
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class RideFareCalculator
{
    public double CalculateFare(int iDistance, String strPeakHour)
    {
        double dFare = 50;

        if(iDistance <= 10)
        {
            dFare = dFare + (iDistance * 12);
        }
        else
        {
            dFare = dFare + (10 * 12);
            dFare = dFare + ((iDistance - 10) * 15);
        }

        if(strPeakHour.equalsIgnoreCase("Yes"))
        {
            dFare = dFare + (dFare * 0.20);
        }

        return dFare;
    }

    public boolean ValidateInput(String str)
    {
        if((str.equalsIgnoreCase("Yes")) ||
           (str.equalsIgnoreCase("No")))
        {
            return true;
        }

        return false;
    }
}

class Question54
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iDistance = 0;
        String strPeakHour = "";

        RideFareCalculator robj = new RideFareCalculator();

        System.out.print("Enter Distance (km) : ");
        iDistance = sobj.nextInt();

        if(iDistance < 0)
        {
            System.out.println("Invalid Input. Distance cannot be negative");
            return;
        }

        System.out.print("Peak Hour (Yes/No) : ");
        strPeakHour = sobj.next();

        if(robj.ValidateInput(strPeakHour) == false)
        {
            System.out.println("Invalid Input. Enter Yes or No only");
            return;
        }

        double dRet = robj.CalculateFare(iDistance, strPeakHour);

        System.out.println("Distance : " + iDistance + " km");
        System.out.println("Peak Hour : " + strPeakHour);
        System.out.println("Total Fare : Rs." + dRet);
    }
}