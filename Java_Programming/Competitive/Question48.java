///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment   : Question 5
//  Program Name  : E-Commerce Discount Calculator
//  Description   : Calculate the final payable amount based on purchase amount
//                  and membership type
//
//  Rules:
//      Amount > 5000  -> 20% discount
//      Amount > 2000  -> 10% discount
//      Otherwise      -> No discount
//      Premium member -> Extra 5% discount on the discounted amount
//
//  Validation:
//      Amount must be greater than 0
//      Membership must be Premium or Regular
//
//  Author        : Snehal Gholap
//  Date          : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class DiscountCalculator
{
    private int amount;
    private String membership;

    public DiscountCalculator(int amount, String membership)
    {
        this.amount = amount;
        this.membership = membership;
    }

    public double calculateDiscount()
    {
        double mainDiscount;

        // Calculate main discount
        if (amount > 5000)
        {
            mainDiscount = amount * 0.20;
        }
        else if (amount > 2000)
        {
            mainDiscount = amount * 0.10;
        }
        else
        {
            mainDiscount = 0;
        }

        // Amount after main discount
        double discountedAmount = amount - mainDiscount;

        // Extra 5% discount for Premium members
        double premiumDiscount = 0;

        if (membership.equalsIgnoreCase("Premium"))
        {
            premiumDiscount = discountedAmount * 0.05;
        }

        return mainDiscount + premiumDiscount;
    }

    public double calculateFinalAmount()
    {
        return amount - calculateDiscount();
    }

    public void displayResult()
    {
        System.out.println("Original Amount: Rs." + amount);
        System.out.println("Total Discount: Rs." + calculateDiscount());
        System.out.println("Final Payable Amount: Rs." + calculateFinalAmount());
    }
}

public class Question48
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();

        System.out.print("Enter membership type (Premium/Regular): ");
        String membership = sc.next();

        // Validation
        if (amount <= 0)
        {
            System.out.println("Invalid amount. Amount must be greater than 0");
        }
        else if (!membership.equalsIgnoreCase("Premium")
                && !membership.equalsIgnoreCase("Regular"))
        {
            System.out.println("Invalid membership type. Enter Premium or Regular");
        }
        else
        {
            DiscountCalculator calculator =
                    new DiscountCalculator(amount, membership);

            calculator.displayResult();
        }

        sc.close();
    }
}