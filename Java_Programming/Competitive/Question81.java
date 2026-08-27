///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 55 : Question 6
//  Program Name : TrimorphicNumberChecker
//  Description  : Check whether a given number is a Trimorphic Number (its cube ends with the number itself)
//
//  Inputs:
//
//      One integer num
//
//  Validation:
//
//      Number must be non-negative (>= 0)
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class TrimorphicNumberChecker
{
    public void CheckTrimorphic(int iNo)
    {
        long lCube = (long) iNo * iNo * iNo;
        int iTemp = iNo;
        long lMod = 1;

        if(iNo == 0)
        {
            lMod = 10;
        }
        else
        {
            while(iTemp > 0)
            {
                lMod *= 10;
                iTemp /= 10;
            }
        }

        if(lCube % lMod == iNo)
        {
            System.out.println("Trimorphic Number");
        }
        else
        {
            System.out.println("Not Trimorphic Number");
        }
    }
}

class Question81
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int iNo = sobj.nextInt();

        if(iNo < 0)
        {
            System.out.println("Invalid Input. Number must be non-negative");
            return;
        }

        TrimorphicNumberChecker tobj = new TrimorphicNumberChecker();
        tobj.CheckTrimorphic(iNo);
    }
}