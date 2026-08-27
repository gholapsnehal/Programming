///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 51 : Question 3
//  Program Name : TelecomPlanAdvisor
//  Description  : Evaluates 4 mobile plans and recommends the cheapest option including extra usage
//
//  Inputs:
//
//      Call Minutes (int)
//      Data Usage in GB (double)
//      SMS Count (int)
//
//  Validation:
//
//      All inputs must be non-negative (>= 0)
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class TelecomPlanAdvisor
{
    public void RecommendPlan(int iMins, double dGB, int iSMS)
    {
        // Define 4 Plans: Base Cost, Max Mins, Max GB, Max SMS, Extra Min Rate, Extra GB Rate, Extra SMS Rate
        String planNames[] = {"Plan A (Basic)", "Plan B (Value)", "Plan C (Data Saver)", "Plan D (Unlimited)"};
        double baseCost[]   = {199.0, 349.0, 499.0, 799.0};
        int limitMins[]     = {300, 1000, 500, 5000};
        double limitGB[]    = {2.0, 10.0, 50.0, 100.0};
        int limitSMS[]      = {100, 300, 100, 1000};

        double minCost = Double.MAX_VALUE;
        String bestPlan = "";

        for(int i = 0; i < 4; i++)
        {
            double cost = baseCost[i];

            if(iMins > limitMins[i])
            {
                cost += (iMins - limitMins[i]) * 1.0;
            }
            if(dGB > limitGB[i])
            {
                cost += (dGB - limitGB[i]) * 20.0;
            }
            if(iSMS > limitSMS[i])
            {
                cost += (iSMS - limitSMS[i]) * 0.5;
            }

            if(cost < minCost)
            {
                minCost = cost;
                bestPlan = planNames[i];
            }
        }

        System.out.println("Recommended Plan : " + bestPlan);
        System.out.println("Total Cost       : Rs." + minCost);
    }
}

class Question61
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Call Usage (Minutes): ");
        int iMins = sobj.nextInt();

        if(iMins < 0)
        {
            System.out.println("Invalid Input. Minutes must be non-negative");
            return;
        }

        System.out.print("Enter Data Usage (GB): ");
        double dGB = sobj.nextDouble();

        if(dGB < 0)
        {
            System.out.println("Invalid Input. Data usage must be non-negative");
            return;
        }

        System.out.print("Enter SMS Count: ");
        int iSMS = sobj.nextInt();

        if(iSMS < 0)
        {
            System.out.println("Invalid Input. SMS count must be non-negative");
            return;
        }

        TelecomPlanAdvisor pobj = new TelecomPlanAdvisor();
        pobj.RecommendPlan(iMins, dGB, iSMS);
    }
}