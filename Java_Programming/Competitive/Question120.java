///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 65 : Question 4
//  Description   : 1. Accepts a line of text containing words separated by space.
//                  2. Uses LinkedHashMap to count word occurrences while preserving initial appearance order.
//                  3. Iterates over words in input line:
//                     - Increments count in Map if word is already present.
//                     - Inserts word into Map with count 1 if word appears for the first time.
//                  4. Prints the word frequencies and calculates the most frequently occurring word 
//                     along with its maximum frequency count.
//
//  Input         : Words string (e.g. java python java c java python cpp)
//
//  Output        : Frequency list and most frequent word summary:
//                  java   -> 3
//                  python -> 2
//                  c      -> 1
//                  cpp    -> 1
//
//                  Most frequent word : java
//                  Frequency : 3
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class WordFrequencyTracker
{
    public void DisplayWordFrequency(String strLine)
    {
        if(strLine == null || strLine.trim().isEmpty())
        {
            System.out.println("Invalid input line");
            return;
        }

        // Split line into words using space as delimiter
        String words[] = strLine.trim().split("\\s+");

        // LinkedHashMap maintains insertion order of words
        Map<String, Integer> wordMap = new LinkedHashMap<>();

        // Calculate frequency of each word
        for(String word : words)
        {
            if(wordMap.containsKey(word))
            {
                wordMap.put(word, wordMap.get(word) + 1);
            }
            else
            {
                wordMap.put(word, 1);
            }
        }

        String strMostFrequent = "";
        int iMaxFreq = 0;

        // Display individual frequencies and track max frequency
        for(Map.Entry<String, Integer> entry : wordMap.entrySet())
        {
            System.out.println(entry.getKey() + "\t-> " + entry.getValue());

            if(entry.getValue() > iMaxFreq)
            {
                iMaxFreq = entry.getValue();
                strMostFrequent = entry.getKey();
            }
        }

        // Display most frequent word details
        System.out.println("\nMost frequent word : " + strMostFrequent);
        System.out.println("Frequency : " + iMaxFreq);
    }
}

class Question120
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string of words :");
        String strLine = sobj.nextLine();

        WordFrequencyTracker wobj = new WordFrequencyTracker();
        wobj.DisplayWordFrequency(strLine);

        sobj.close();
    }
}