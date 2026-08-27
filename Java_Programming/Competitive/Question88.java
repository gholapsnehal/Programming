///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 57 : Question 2
//  Program Name : LongestWordFinder
//  Description  : Identify and print the word having maximum length in a given sentence
//
//  Inputs:
//
//      One sentence
//
//  Validation:
//
//      Sentence must not be null or empty
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class LongestWordFinder
{
    public void DisplayLongestWord(String str)
    {
        String words[] = str.split("\\s+");
        String longestWord = "";

        for(String word : words)
        {
            if(word.length() > longestWord.length())
            {
                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}

class Question88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String str = sobj.nextLine();

        if(str == null || str.trim().isEmpty())
        {
            System.out.println("Invalid Input. Sentence cannot be empty");
            return;
        }

        LongestWordFinder lobj = new LongestWordFinder();
        lobj.DisplayLongestWord(str);
    }
}