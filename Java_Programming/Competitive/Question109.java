///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 63 : Question 3
//  Description   : Accepts the name of a text file and performs analysis 
//                  on its contents (characters, words, lines, uppercase,
//                  lowercase, digits, spaces)
//
//  Input         : File name
//  Output        : Detailed textual analysis of the file contents
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class FileOperations
{
    public void AnalyzeFile(String strFileName)
    {
        try
        {
            FileInputStream fiobj = new FileInputStream(strFileName);

            int iRet = 0;
            int iCharacters = 0;
            int iWords = 0;
            int iLines = 0;
            int iUpper = 0;
            int iLower = 0;
            int iDigits = 0;
            int iSpaces = 0;

            boolean bInWord = false;

            while((iRet = fiobj.read()) != -1)
            {
                char ch = (char)iRet;
                iCharacters++;

                if(ch >= 'A' && ch <= 'Z')
                {
                    iUpper++;
                }
                else if(ch >= 'a' && ch <= 'z')
                {
                    iLower++;
                }
                else if(ch >= '0' && ch <= '9')
                {
                    iDigits++;
                }
                else if(ch == ' ')
                {
                    iSpaces++;
                }

                if(ch == '\n')
                {
                    iLines++;
                }

                if(Character.isWhitespace(ch))
                {
                    if(bInWord)
                    {
                        iWords++;
                        bInWord = false;
                    }
                }
                else
                {
                    bInWord = true;
                }
            }

            if(bInWord)
            {
                iWords++;
            }

            if(iCharacters > 0 && iLines == 0)
            {
                iLines = 1;
            }

            System.out.println("File : " + strFileName + "\n");
            System.out.println("Characters : " + iCharacters);
            System.out.println("Words      : " + iWords);
            System.out.println("Lines      : " + iLines);
            System.out.println("Uppercase  : " + iUpper);
            System.out.println("Lowercase  : " + iLower);
            System.out.println("Digits     : " + iDigits);
            System.out.println("Spaces     : " + iSpaces);

            fiobj.close();
        }
        catch(FileNotFoundException eobj)
        {
            System.out.println("Unable to open file because file does not exist");
        }
        catch(IOException eobj)
        {
            System.out.println("Unable to read data from file");
        }
    }
}

class Question109
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String strFileName;

        System.out.println("Enter file name :");
        strFileName = sobj.nextLine();

        if(strFileName.length() == 0)
        {
            System.out.println("Invalid file name");
            return;
        }

        FileOperations fobj = new FileOperations();

        fobj.AnalyzeFile(strFileName);

        sobj.close();
    }
}