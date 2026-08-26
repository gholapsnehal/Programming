///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 49 : Question 4
//  Program Name : TrafficFineCalculator
//  Description  : Calculate traffic fine based on rider violations.
//                 Multiple violations are allowed and corresponding
//                 fines are added to generate the total fine amount.
//
//  Rules:
//
//      No Helmet    -> Rs.500 Fine
//      No License   -> Rs.1000 Fine
//      Overspeeding -> Rs.1500 Fine
//
//      If multiple violations occur, fines are added.
//
//  Validation:
//
//      Inputs must be Yes or No only
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class TrafficFineCalculator
{
    public int CalculateFine(String Helmet, String License, String Overspeeding)
    {
        int iFine = 0;

        if(Helmet.equalsIgnoreCase("No"))
        {
            iFine = iFine + 500;
        }

        if(License.equalsIgnoreCase("No"))
        {
            iFine = iFine + 1000;
        }

        if(Overspeeding.equalsIgnoreCase("Yes"))
        {
            iFine = iFine + 1500;
        }

        return iFine;
    }

    public boolean ValidateInput(String Str)
    {
        if((Str.equalsIgnoreCase("Yes")) ||
           (Str.equalsIgnoreCase("No")))
        {
            return true;
        }

        return false;
    }
}

class Question52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strHelmet = "";
        String strLicense = "";
        String strOverspeeding = "";

        int iRet = 0;

        TrafficFineCalculator tobj = new TrafficFineCalculator();

        System.out.print("Helmet worn (Yes/No) : ");
        strHelmet = sobj.next();

        System.out.print("License available (Yes/No) : ");
        strLicense = sobj.next();

        System.out.print("Overspeeding (Yes/No) : ");
        strOverspeeding = sobj.next();

        if((tobj.ValidateInput(strHelmet) == false) ||
           (tobj.ValidateInput(strLicense) == false) ||
           (tobj.ValidateInput(strOverspeeding) == false))
        {
            System.out.println("Invalid input. Please enter Yes or No only");
            return;
        }

        iRet = tobj.CalculateFine(strHelmet, strLicense, strOverspeeding);

        System.out.println("Total Fine Amount : Rs." + iRet);


    }
}