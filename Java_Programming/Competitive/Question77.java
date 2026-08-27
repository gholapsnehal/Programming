///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 55 : Question 2
//  Program Name : AutomorphicNumberChecker
//  Description  : Check whether a given number is an Automorphic Number (its square ends with the number itself)
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

class AutomorphicNumberChecker
{
    public void CheckAutomorphic(int iNo)
    {
        int iSquare = iNo * iNo;
        int iTemp = iNo;
        int iMod = 1;

        if(iNo == 0)
        {
            iMod = 10;
        }
        else
        {
            while(iTemp > 0)
            {
                iMod *= 10;
                iTemp /= 10;
            }
        }

        if(iSquare % iMod == iNo)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
    }
}

class Question77
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

        AutomorphicNumberChecker aobj = new AutomorphicNumberChecker();
        aobj.CheckAutomorphic(iNo);
    }
}