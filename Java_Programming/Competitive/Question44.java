///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 48  : Question 1
//  Program Name : Library Fine Calculator
//  Description  : Accept number of days a book was kept and calculate fine
//
//  Rules:
//      0 - 7 days   : No Fine
//      8 - 12 days  : Rs.5 per day
//      > 12 days    : Rs.10 per day after first 12 days
//
//  Author       : Snehal Gholap
//  Date         : 14/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class FineCalculator
{
    public int calculateFine(int daysKept)
    {
        int Fine = 0;

        if(daysKept < 0)
        {
            return -1;
        }
        else if(daysKept <= 7)
        {
            return 0;

        }
        else if(daysKept <= 12)
        {
            Fine = (daysKept - 7) * 5;
            return Fine;
        }
        else
        {

            Fine = 25 + ((daysKept - 12) * 10);
            return Fine;

        }
    }
}

public class Question44
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        FineCalculator cobj = new FineCalculator();

        int idaysKept = 0;
        int iRet = 0;

        System.out.println("Enter total number of days the book was kept (daysKept) : ");
        idaysKept = sobj.nextInt();

        iRet = cobj.calculateFine(idaysKept);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else if(iRet == 0)
        {
            System.out.println("Book returned on time, no fine applicable");
        }
        else
        {
            System.out.println("Total fine : "+iRet);
        }
      
        sobj.close();

    }

}