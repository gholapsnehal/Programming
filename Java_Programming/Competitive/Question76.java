///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 55 : Question 1
//  Program Name : NeonNumberChecker
//  Description  : Check whether a given number is a Neon Number (sum of digits of its square equals number)
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

class NeonNumberChecker
{
    public void CheckNeon(int iNo)
    {
        int iSquare = iNo * iNo;
        int iSum = 0;

        while(iSquare > 0)
        {
            int iDigit = iSquare % 10;
            iSum += iDigit;
            iSquare /= 10;
        }

        if(iNo == 0)
        {
            iSum = 0;
        }

        if(iSum == iNo)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}

class Question76
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

        NeonNumberChecker nobj = new NeonNumberChecker();
        nobj.CheckNeon(iNo);
    }
}