///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 61 : Question 1
//  Program Name : StringOperations
//  Description  : Perform different string operations requested by the client
//
//  Supported Operations:
//
//      LENGTH <string>
//      UPPER <string>
//      LOWER <string>
//      REVERSE <string>
//      PALINDROME <string>
//      VOWELS <string>
//      QUIT
//
//  Author       : Snehal Gholap
//  Date         : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

class StringOperations
{
    public String FindLength(String str)
    {
        return "Length of string is : " + str.length();
    }

    public String ConvertUpper(String str)
    {
        return str.toUpperCase();
    }

    public String ConvertLower(String str)
    {
        return str.toLowerCase();
    }

    public String ReverseString(String str)
    {
        String strReverse = "";
        int iCnt = 0;

        for(iCnt = str.length() - 1; iCnt >= 0; iCnt--)
        {
            strReverse = strReverse + str.charAt(iCnt);
        }

        return strReverse;
    }

    public String CheckPalindrome(String str)
    {
        String strReverse = "";
        int iCnt = 0;

        for(iCnt = str.length() - 1; iCnt >= 0; iCnt--)
        {
            strReverse = strReverse + str.charAt(iCnt);
        }

        if(str.equalsIgnoreCase(strReverse))
        {
            return str + " is a Palindrome";
        }

        return str + " is not a Palindrome";
    }

    public String CountVowels(String str)
    {
        int iCnt = 0;
        int iVowelCount = 0;
        char ch = '\0';

        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            ch = Character.toLowerCase(str.charAt(iCnt));

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u')
            {
                iVowelCount++;
            }
        }

        return "Number of vowels : " + iVowelCount;
    }

    public String PerformOperation(String strCommand)
    {
        strCommand = strCommand.trim();

        if(strCommand.equalsIgnoreCase("QUIT"))
        {
            return "QUIT";
        }

        int iSpace = strCommand.indexOf(' ');

        if(iSpace == -1)
        {
            return "Invalid command format";
        }

        String strOperation = strCommand.substring(0, iSpace).toUpperCase();
        String strValue = strCommand.substring(iSpace + 1).trim();

        if(strValue.length() == 0)
        {
            return "String cannot be empty";
        }

        switch(strOperation)
        {
            case "LENGTH":
                return FindLength(strValue);

            case "UPPER":
                return ConvertUpper(strValue);

            case "LOWER":
                return ConvertLower(strValue);

            case "REVERSE":
                return ReverseString(strValue);

            case "PALINDROME":
                return CheckPalindrome(strValue);

            case "VOWELS":
                return CountVowels(strValue);

            default:
                return "Invalid command";
        }
    }
}