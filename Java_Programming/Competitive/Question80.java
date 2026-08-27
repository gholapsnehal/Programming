///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 55 : Question 5
//  Program Name : DisariumNumberChecker
//  Description  : Check whether a given number is a Disarium Number 
//                 (sum of digits raised to their position starting from 1 equals the number)
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

class DisariumNumberChecker
{
    public void CheckDisarium(int iNo)
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
            iDigits--;
            iTemp /= 10;
        }

        if(iSum == iNo)
        {
            System.out.println("Disarium Number");
        }
        else
        {
            System.out.println("Not Disarium Number");
        }
    }
}

class Question80
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

        DisariumNumberChecker dobj = new DisariumNumberChecker();
        dobj.CheckDisarium(iNo);
    }
}