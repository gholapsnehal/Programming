///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 54 : Question 5
//  Program Name : PalindromeNumberChecker
//  Description  : Check whether a given number is Palindrome (remains the same when reversed)
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

class PalindromeNumberChecker
{
    public void CheckPalindrome(int iNo)
    {
        int iTemp = iNo;
        int iRev = 0;

        while(iTemp > 0)
        {
            int iDigit = iTemp % 10;
            iRev = (iRev * 10) + iDigit;
            iTemp /= 10;
        }

        if(iRev == iNo)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}

class Question75
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

        PalindromeNumberChecker pobj = new PalindromeNumberChecker();
        pobj.CheckPalindrome(iNo);
    }
}