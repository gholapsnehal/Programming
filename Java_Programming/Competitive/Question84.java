///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 56 : Question 3
//  Program Name : PangramChecker
//  Description  : Check whether a given sentence is a Pangram (contains all alphabets 'a' to 'z')
//
//  Inputs:
//
//      One sentence str
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

class PangramChecker
{
    public void CheckPangram(String str)
    {
        str = str.toLowerCase();
        boolean alphabetPresent[] = new boolean[26];

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z')
            {
                alphabetPresent[ch - 'a'] = true;
            }
        }

        boolean bIsPangram = true;
        for(int i = 0; i < 26; i++)
        {
            if(!alphabetPresent[i])
            {
                bIsPangram = false;
                break;
            }
        }

        if(bIsPangram)
        {
            System.out.println("Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }
    }
}

class Question84
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

        PangramChecker pobj = new PangramChecker();
        pobj.CheckPangram(str);
    }
}