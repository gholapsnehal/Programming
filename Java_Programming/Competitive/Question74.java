///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 54 : Question 4
//  Program Name : HarshadNumberChecker
//  Description  : Check whether a given number is a Harshad Number (divisible by the sum of its digits)
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

class HarshadNumberChecker
{
    public void CheckHarshad(int iNo)
    {
        int iTemp = iNo;
        int iSum = 0;

        while(iTemp > 0)
        {
            int iDigit = iTemp % 10;
            iSum += iDigit;
            iTemp /= 10;
        }

        if(iSum != 0 && iNo % iSum == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}

class Question74
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

        HarshadNumberChecker hobj = new HarshadNumberChecker();
        hobj.CheckHarshad(iNo);
    }
}