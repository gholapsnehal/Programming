///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 56 : Question 1
//  Program Name : StringPalindromeChecker
//  Description  : Check whether a given string is a Palindrome (reads same forward and backward)
//
//  Inputs:
//
//      One string str
//
//  Validation:
//
//      String must not be null or empty
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringPalindromeChecker
{
    public void CheckPalindrome(String str)
    {
        int iStart = 0;
        int iEnd = str.length() - 1;
        boolean bIsPalindrome = true;

        while(iStart < iEnd)
        {
            if(str.charAt(iStart) != str.charAt(iEnd))
            {
                bIsPalindrome = false;
                break;
            }
            iStart++;
            iEnd--;
        }

        if(bIsPalindrome)
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}

class Question82
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sobj.nextLine();

        if(str == null || str.trim().isEmpty())
        {
            System.out.println("Invalid Input. String cannot be empty");
            return;
        }

        StringPalindromeChecker sobjChecker = new StringPalindromeChecker();
        sobjChecker.CheckPalindrome(str);
    }
}