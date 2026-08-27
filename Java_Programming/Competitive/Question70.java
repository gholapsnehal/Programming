///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 54 : Question 1
//  Program Name : StrongNumberChecker
//  Description  : Check whether a given number is a Strong Number (sum of factorials of digits equals number)
//
//  Inputs:
//
//      One integer num
//
//  Validation:
//
//      Number must be non-negative (>= 0)
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StrongNumberChecker
{
    private int Factorial(int iNo)
    {
        int iFact = 1;
        for(int i = 1; i <= iNo; i++)
        {
            iFact *= i;
        }
        return iFact;
    }

    public void CheckStrong(int iNo)
    {
        int iTemp = iNo;
        int iSum = 0;

        while(iTemp > 0)
        {
            int iDigit = iTemp % 10;
            iSum += Factorial(iDigit);
            iTemp /= 10;
        }

        if(iNo == 0)
        {
            iSum = Factorial(0);
        }

        if(iSum == iNo)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not Strong Number");
        }
    }
}

class Question70
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int iNo = sobj.nextInt();

        if(iNo < 0)
        {
            System.out.println("Invalid Input. Number must be non-negative");
            return;
        }

        StrongNumberChecker sobjChecker = new StrongNumberChecker();
        sobjChecker.CheckStrong(iNo);
    }
}