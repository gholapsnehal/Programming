///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 49  : Question 1
//  Program Name  : Parking Fee Calculator
//  Description   : Calculate parking fees based on total parking duration
//                  and apply an additional penalty for long-duration parking
//
//  Rules:
//      First 2 hours  -> Rs.20 (flat)
//      After 2 hours  -> Rs.10 per extra hour
//      Total hours > 10 -> Add Rs.50 penalty
//
//  Validation:
//      Hours cannot be negative
//
//  Author        : Snehal Gholap
//  Date          : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ParkingFee
{
    private int hours;

    public ParkingFee(int hours)
    {
        this.hours = hours;
    }

    public int calculateFee()
    {
        int fee;

        if (hours <= 2)
        {
            fee = 20;
        }
        else
        {
            fee = 20 + ((hours - 2) * 10);
        }

        // Add penalty for more than 10 hours
        if (hours > 10)
        {
            fee = fee + 50;
        }

        return fee;
    }

    public void displayResult()
    {
        System.out.println("Total Parking Duration: " + hours + " hours");
        System.out.println("Total Parking Fee: Rs." + calculateFee());
    }
}

public class Question49
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total parking hours: ");
        int hours = sc.nextInt();

        // Validation
        if (hours < 0)
        {
            System.out.println("Invalid input. Hours cannot be negative");
        }
        else
        {
            ParkingFee parking = new ParkingFee(hours);
            parking.displayResult();
        }

        sc.close();
    }
}