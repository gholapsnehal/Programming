///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 57 : Question 3
//  Program Name : DuplicateCharacterRemover
//  Description  : Remove duplicate characters from a string while keeping the first occurrence
//
//  Inputs:
//
//      One string
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

class DuplicateCharacterRemover
{
    public void RemoveDuplicates(String str)
    {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sbResult = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(seen.add(ch))
            {
                sbResult.append(ch);
            }
        }

        System.out.println(sbResult.toString());
    }
}

class Question89
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sobj.nextLine();

        if(str == null || str.trim().isEmpty())
        {
            System.out.println("Invalid Input. String cannot be empty.");
            return;
        }

        DuplicateCharacterRemover dobj = new DuplicateCharacterRemover();
        dobj.RemoveDuplicates(str);
    }
}