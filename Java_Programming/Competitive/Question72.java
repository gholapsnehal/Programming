///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 54 : Question 2
//  Program Name : ArmstrongNumberChecker
//  Description  : Check whether a given number is an Armstrong Number
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

class ArmstrongNumberChecker
{
    public void CheckArmstrong(int iNo)
    {
        int iTemp = iNo;
        int iDigits = 0;

        while(iTemp > 0)
        {
            iDigits++;
            iTemp /= 10;
        }

        if(iNo == 0)
        {
            iDigits = 1;
        }

        iTemp = iNo;
        int iSum = 0;

        while(iTemp > 0)
        {
            int iDigit = iTemp % 10;
            iSum += Math.pow(iDigit, iDigits);
            iTemp /= 10;
        }

        if(iSum == iNo)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}

class Question72
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

        ArmstrongNumberChecker aobj = new ArmstrongNumberChecker();
        aobj.CheckArmstrong(iNo);

    }
}