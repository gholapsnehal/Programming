///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 57 : Question 4
//  Program Name : VowelConsonantCounter
//  Description  : Count total vowels (a, e, i, o, u) and consonants separately in a given string
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

class VowelConsonantCounter
{
    public void CountVowelsAndConsonants(String str)
    {
        int iVowels = 0;
        int iConsonants = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    iVowels++;
                }
                else
                {
                    iConsonants++;
                }
            }
        }

        System.out.println("Vowels: " + iVowels);
        System.out.println("Consonants: " + iConsonants);
    }
}

class Question90
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

        VowelConsonantCounter vcobj = new VowelConsonantCounter();
        vcobj.CountVowelsAndConsonants(str);
    }
}