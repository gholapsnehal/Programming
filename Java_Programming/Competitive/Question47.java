///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 48 : Question 4
//  Program Name  : Electricity Bill Calculator
//  Description   : Calculate the electricity bill based on units consumed
//                  using progressive slab rates
//
//  Rules:
//      First 100 units  -> Rs.5 per unit
//      Next 100 units   -> Rs.7 per unit
//      Above 200 units  -> Rs.10 per unit
//
//  Validation:
//      Units cannot be negative
//
//  Author        : Snehal Gholap
//  Date          : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ElectricityBill
{
    private int units;

    public ElectricityBill(int units)
    {
        this.units = units;
    }

    public double calculateBill()
    {
        double bill = 0;

        if (units <= 100)
        {
            bill = units * 5;
        }
        else if (units <= 200)
        {
            bill = (100 * 5) + ((units - 100) * 7);
        }
        else
        {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        return bill;
    }

    public void displayResult()
    {
        System.out.println("Total Units Consumed: " + units);
        System.out.println("Total Electricity Bill: Rs." + calculateBill());
    }
}

public class Question47
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units < 0)
        {
            System.out.println("Invalid input. Units cannot be negative");
        }
        else
        {
            ElectricityBill bill = new ElectricityBill(units);
            bill.displayResult();
        }

        sc.close();
    }
}