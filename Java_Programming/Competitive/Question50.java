///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 49  : Question 2
//  Program Name  : Personal Loan Eligibility
//  Description   : Check whether a customer is eligible for a personal loan
//                  based on age, monthly income, credit score and existing loan
//
//  Rules:
//      Age must be between 21 and 60 inclusive
//      Monthly income must be >= Rs.25,000
//      Credit score must be >= 700
//      Customer must NOT have an existing unpaid loan
//
//  Validation:
//      Age, income and credit score must be non-negative
//      Existing loan input must be Yes or No
//
//  Author        : Snehal Gholap
//  Date          : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class LoanEligibility
{
    private int age;
    private int income;
    private int creditScore;
    private String existingLoan;

    public LoanEligibility(int age, int income, int creditScore, String existingLoan)
    {
        this.age = age;
        this.income = income;
        this.creditScore = creditScore;
        this.existingLoan = existingLoan;
    }

    public String checkEligibility()
    {
        if (age < 21 || age > 60)
        {
            return "Invalid age for loan eligibility";
        }
        else if (income < 25000)
        {
            return "Monthly income is less than Rs.25000";
        }
        else if (creditScore < 700)
        {
            return "Credit score is less than 700";
        }
        else if (existingLoan.equalsIgnoreCase("Yes"))
        {
            return "Existing unpaid loan";
        }

        return "Loan Approved";
    }

    public void displayResult()
    {
        String result = checkEligibility();

        if (result.equals("Loan Approved"))
        {
            System.out.println("Loan Approved");
        }
        else
        {
            System.out.println("Loan Rejected: " + result);
        }
    }
}

public class Question50
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly income: ");
        int income = sc.nextInt();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Existing unpaid loan (Yes/No): ");
        String existingLoan = sc.next();

        // Validation
        if (age < 0 || income < 0 || creditScore < 0)
        {
            System.out.println("Invalid input. Age, income and credit score must be non-negative");
        }
        else if (!existingLoan.equalsIgnoreCase("Yes")
                && !existingLoan.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid input. Enter Yes or No for existing unpaid loan");
        }
        else
        {
            LoanEligibility loan =
                    new LoanEligibility(age, income, creditScore, existingLoan);

            loan.displayResult();
        }

        sc.close();
    }
}