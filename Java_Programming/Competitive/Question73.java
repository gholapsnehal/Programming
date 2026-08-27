///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 54 : Question 3
//  Program Name : PerfectNumberChecker
//  Description  : Check whether a given number is a Perfect Number (sum of proper divisors equals number)
//
//  Inputs:
//
//      One integer num
//
//  Validation:
//
//      Number must be greater than 0
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class PerfectNumberChecker
{
    public void CheckPerfect(int iNo)
    {
        int iSum = 0;

        for(int i = 1; i <= iNo / 2; i++)
        {
            if(iNo % i == 0)
            {
                iSum += i;
            }
        }

        if(iSum == iNo)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
}

class Question73
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int iNo = sobj.nextInt();

        if(iNo <= 0)
        {
            System.out.println("Invalid Input. Number must be greater than 0");
            return;
        }

        PerfectNumberChecker pobj = new PerfectNumberChecker();
        pobj.CheckPerfect(iNo);
    }
}