///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 56 : Question 4
//  Program Name : DuplicateCharacterPrinter
//  Description  : Find and display characters that appear more than once in a given string
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

class DuplicateCharacterPrinter
{
    public void DisplayDuplicates(String str)
    {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder duplicates = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            if(entry.getValue() > 1)
            {
                duplicates.append(entry.getKey()).append(" ");
            }
        }

        System.out.println(duplicates.toString().trim());
    }
}

class Question85
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

        DuplicateCharacterPrinter dobj = new DuplicateCharacterPrinter();
        dobj.DisplayDuplicates(str);
    }
}