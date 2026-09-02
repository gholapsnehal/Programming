///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 64 : Question 2
//  Description   : 1. Accepts a message string from the user.
//                  2. Uses a LinkedHashMap to store each character as key and its occurrence count 
//                     as value, preserving the original order of characters in the string.
//                  3. Traverses the input string character by character to build frequency map:
//                     - Increments frequency if character already exists in Map.
//                     - Adds character with count 1 if appearing for the first time.
//                  4. Iterates through the LinkedHashMap entries to find and display the first 
//                     character whose frequency count equals 1
//
//  Input         : String (e.g. programming)
//
//  Output        : First non-repeating character in the original character order
//                  First non-repeating character : p
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class CharacterTracker
{
    public void DisplayFirstNonRepeating(String str)
    {
        if(str == null || str.length() == 0)
        {
            System.out.println("Invalid input string");
            return;
        }

        // LinkedHashMap keeps character count while maintaining insertion order
        Map<Character, Integer> hobj = new LinkedHashMap<>();

        // Loop through all characters of input string
        for(int iCnt = 0; iCnt < str.length(); iCnt++)
        {
            char ch = str.charAt(iCnt);

            if(hobj.containsKey(ch))
            {
                // Increment frequency count if character exists
                hobj.put(ch, hobj.get(ch) + 1);
            }
            else
            {
                // Set initial frequency 1 for new character
                hobj.put(ch, 1);
            }
        }

        boolean bFound = false;

        // Traverse map to find first character with frequency 1
        for(Map.Entry<Character, Integer> entry : hobj.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println("First non-repeating character : " + entry.getKey());
                bFound = true;
                break;
            }
        }

        if(bFound == false)
        {
            System.out.println("There are no non-repeating characters in the string");
        }
    }
}

class Question113
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strInput;

        System.out.println("Enter string:");
        strInput = sobj.nextLine();

        if(strInput.length() == 0)
        {
            System.out.println("Invalid input");
            return;
        }

        CharacterTracker cobj = new CharacterTracker();

        cobj.DisplayFirstNonRepeating(strInput);

        sobj.close();
    }
}