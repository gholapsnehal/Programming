///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 56 : Question 5
//  Program Name : CharacterFrequencyCounter
//  Description  : Count and display frequency of each character in a given string
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

class CharacterFrequencyCounter
{
    public void DisplayFrequency(String str)
    {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

class Question86
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

        CharacterFrequencyCounter fobj = new CharacterFrequencyCounter();
        fobj.DisplayFrequency(str);
    }
}