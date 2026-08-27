///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 57 : Question 5
//  Program Name : StringRotationChecker
//  Description  : Check whether one string is a rotation of another
//
//  Inputs:
//
//      First string str1
//      Second string str2
//
//  Validation:
//
//      Strings must not be null or empty
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StringRotationChecker
{
    public void CheckRotation(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            System.out.println("Not Rotation");
            return;
        }

        String temp = str1 + str1;

        if(temp.contains(str2))
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not Rotation");
        }
    }
}

class Question91
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sobj.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sobj.nextLine();

        if(str1 == null || str2 == null || str1.trim().isEmpty() || str2.trim().isEmpty())
        {
            System.out.println("Invalid Input. Strings cannot be empty");
            return;
        }

        StringRotationChecker robj = new StringRotationChecker();
        robj.CheckRotation(str1, str2);
    }
}