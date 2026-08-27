///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 55 : Question 3
//  Program Name : SpyNumberChecker
//  Description  : Check whether a given number is a Spy Number (sum of digits equals product of digits)
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

class SpyNumberChecker
{
    public void CheckSpy(int iNo)
    {
        int iTemp = iNo;
        int iSum = 0;
        int iProduct = 1;

        while(iTemp > 0)
        {
            int iDigit = iTemp % 10;
            iSum += iDigit;
            iProduct *= iDigit;
            iTemp /= 10;
        }

        if(iNo == 0)
        {
            iSum = 0;
            iProduct = 0;
        }

        if(iSum == iProduct)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}

class Question78
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

        SpyNumberChecker sobjChecker = new SpyNumberChecker();
        sobjChecker.CheckSpy(iNo);
    }
}