///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 55 : Question 4
//  Program Name : SunnyNumberChecker
//  Description  : Check whether a given number is a Sunny Number (num + 1 is a perfect square)
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

class SunnyNumberChecker
{
    public void CheckSunny(int iNo)
    {
        int iNext = iNo + 1;
        double dSqrt = Math.sqrt(iNext);

        if(dSqrt - Math.floor(dSqrt) == 0)
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("Not Sunny Number");
        }
    }
}

class Question79
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

        SunnyNumberChecker sobjChecker = new SunnyNumberChecker();
        sobjChecker.CheckSunny(iNo);
    }
}