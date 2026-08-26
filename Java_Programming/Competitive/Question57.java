///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 50 : Question 4
//  Program Name : ShoppingBudgetCalculator
//  Description  : Determine how many items can be purchased within
//                 the available budget and display the remaining balance
//
//  Inputs:
//
//      Budget Amount
//      Number of Items
//      Prices of N Items
//
//  Validation:
//
//      Budget must be greater than or equal to 0
//      Number of Items must be greater than or equal to 0
//      Each Item Price must be greater than 0
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ShoppingBudgetCalculator
{
    public void CalculatePurchase(int iBudget, int Arr[])
    {
        int iCount = 0;
        int iBalance = iBudget;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] <= iBalance)
            {
                iBalance = iBalance - Arr[i];
                iCount++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased : " + iCount);
        System.out.println("Remaining Balance : Rs." + iBalance);
    }
}

class Question57
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iBudget = 0;
        int iSize = 0;

        System.out.print("Enter Budget Amount : ");
        iBudget = sobj.nextInt();

        if(iBudget < 0)
        {
            System.out.println("Invalid Input. Budget must be greater than or equal to 0");
            return;
        }

        System.out.print("Enter Number of Items : ");
        iSize = sobj.nextInt();

        if(iSize < 0)
        {
            System.out.println("Invalid Input. Number of Items must be greater than or equal to 0");
            return;
        }

        int Arr[] = new int[iSize];

        System.out.println("Enter Item Prices :");

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();

            if(Arr[i] <= 0)
            {
                System.out.println("Invalid Input. Item price must be greater than 0");
                return;
            }
        }

        ShoppingBudgetCalculator bobj = new ShoppingBudgetCalculator();

        bobj.CalculatePurchase(iBudget, Arr);
    }
}