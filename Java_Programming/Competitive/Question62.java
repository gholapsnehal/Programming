///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 51 : Question 4
//  Program Name : WaterBillCalculator
//  Description  : Calculates progressive slab water bill with late payment penalty fee
//
//  Inputs:
//
//      Units Consumed (int)
//      Weeks Late (int)
//
//  Validation:
//
//      Units must be non-negative (>= 0)
//      Weeks late must be non-negative (>= 0)
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class WaterBillCalculator
{
    public void CalculateBill(int iUnits, int iWeeksLate)
    {
        double dFixedCharge = 100.0;
        double dBaseBill = dFixedCharge;

        if(iUnits <= 100)
        {
            dBaseBill += iUnits * 2.0;
        }
        else if(iUnits <= 200)
        {
            dBaseBill += (100 * 2.0) + ((iUnits - 100) * 3.5);
        }
        else
        {
            dBaseBill += (100 * 2.0) + (100 * 3.5) + ((iUnits - 200) * 5.0);
        }

        double dPenaltyPercent = Math.min(iWeeksLate * 0.02, 0.10);
        double dPenalty = dBaseBill * dPenaltyPercent;
        double dTotalBill = dBaseBill + dPenalty;

        System.out.println("Base Bill Amount : Rs." + dBaseBill);
        System.out.println("Late Penalty     : Rs." + dPenalty);
        System.out.println("Total Bill Amount: Rs." + dTotalBill);
    }
}

class Question62
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Units Consumed: ");
        int iUnits = sobj.nextInt();

        if(iUnits < 0)
        {
            System.out.println("Invalid Input. Units must be non-negative");
            return;
        }

        System.out.print("Enter Weeks Late: ");
        int iWeeksLate = sobj.nextInt();

        if(iWeeksLate < 0)
        {
            System.out.println("Invalid Input. Weeks late must be non-negative");
            return;
        }

        WaterBillCalculator wobj = new WaterBillCalculator();
        wobj.CalculateBill(iUnits, iWeeksLate);
    }
}