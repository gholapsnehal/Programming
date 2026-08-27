///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 57 : Question 1
//  Program Name : ReverseWordsInSentence
//  Description  : Reverse individual words of a sentence while keeping the word order same
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

class WordReverser
{
    public void ReverseWords(String str)
    {
        String words[] = str.split("\\s+");
        StringBuilder sbResult = new StringBuilder();

        for(String word : words)
        {
            StringBuilder sbWord = new StringBuilder(word);
            sbResult.append(sbWord.reverse().toString()).append(" ");
        }

        System.out.println(sbResult.toString().trim());
    }
}

class Question87
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

        WordReverser wobj = new WordReverser();
        wobj.ReverseWords(str);
    }
}
