///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 56 : Question 2
//  Program Name : StringAnagramChecker
//  Description  : Check whether two strings are Anagrams (same characters with same frequency)
//
//  Inputs:
//
//      First string str1
//      Second string str2
//
//  Validation:
//
//      Strings must not be null or empty
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringAnagramChecker
{
    public void CheckAnagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            System.out.println("Not Anagram");
            return;
        }

        char Arr1[] = str1.toCharArray();
        char Arr2[] = str2.toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        if(Arrays.equals(Arr1, Arr2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}

class Question83
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sobj.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sobj.nextLine();

        if(str1 == null || str2 == null || str1.trim().isEmpty() || str2.trim().isEmpty())
        {
            System.out.println("Invalid Input. Strings cannot be empty");
            return;
        }

        StringAnagramChecker aobj = new StringAnagramChecker();
        aobj.CheckAnagram(str1, str2);
    }
}