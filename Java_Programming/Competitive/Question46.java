///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 48   : Question 3
//  Program Name  : Student Result Generation
//  Description   : Accept marks of five subjects, validate the marks,
//                  determine whether the student has failed in any subject,
//                  and if passed, calculate average marks and final classification
//
//  Rules:
//      Marks in each subject must be between 0 and 100
//      If marks in any subject are less than 35 -> Fail
//      Average >= 75 -> Distinction
//      Average >= 60 -> First Class
//      Average >= 50 -> Second Class
//      Average < 50  -> Pass
//
//  Author        : Snehal Gholap
//  Date          : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Question46
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        boolean fail = false;
        double average;

        // Accept and validate marks
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // Validate marks
            if (marks[i] < 0 || marks[i] > 100)
            {
                System.out.println("Invalid marks. Marks must be between 0 and 100");
                sc.close();
                return;
            }

            // Check for failure
            if (marks[i] < 35)
            {
                fail = true;
            }

            total = total + marks[i];
        }

        // Display result
        if (fail)
        {
            System.out.println("\nResult: Fail");
        }
        else
        {
            average = total / 5.0;

            System.out.printf("\nAverage Marks: %.2f%n", average);

            if (average >= 75)
            {
                System.out.println("Final Result: Distinction");
            }
            else if (average >= 60)
            {
                System.out.println("Final Result: First Class");
            }
            else if (average >= 50)
            {
                System.out.println("Final Result: Second Class");
            }
            else
            {
                System.out.println("Final Result: Pass");
            }
        }

        sc.close();
    }
}