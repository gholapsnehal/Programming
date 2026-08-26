///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 49 : Question 5
//  Program Name : IncomeTaxCalculator
//  Description  : Calculate income tax based on annual income using
//                 progressive tax slabs. Only the amount falling in
//                 each slab is taxed at that slab's rate
//
//  Tax Slabs:
//
//      Up to Rs.2,50,000          -> 0%
//      Rs.2,50,001 to Rs.5,00,000 -> 5%
//      Rs.5,00,001 to Rs.10,00,000-> 20%
//      Above Rs.10,00,000         -> 30%
//
//  Validation:
//
//      Income cannot be negative
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class IncomeTaxCalculator
{
    public double CalculateTax(int iIncome)
    {
        double dTax = 0;

        if(iIncome > 1000000)
        {
            dTax = dTax + ((iIncome - 1000000) * 0.30);
            iIncome = 1000000;
        }

        if(iIncome > 500000)
        {
            dTax = dTax + ((iIncome - 500000) * 0.20);
            iIncome = 500000;
        }

        if(iIncome > 250000)
        {
            dTax = dTax + ((iIncome - 250000) * 0.05);
        }

        return dTax;
    }
}

class Question53
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iIncome = 0;
        double dRet = 0;

        IncomeTaxCalculator tobj = new IncomeTaxCalculator();

        System.out.print("Enter Annual Income : ");
        iIncome = sobj.nextInt();

        if(iIncome < 0)
        {
            System.out.println("Invalid Input. Income cannot be negative");
            return;
        }

        dRet = tobj.CalculateTax(iIncome);

        System.out.println("Annual Income : Rs." + iIncome);
        System.out.println("Total Tax Payable : Rs." + dRet);
    }
}