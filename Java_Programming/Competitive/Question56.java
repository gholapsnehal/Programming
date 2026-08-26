///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 50 : Question 3
//  Program Name : CourierChargeCalculator
//  Description  : Calculate courier charge based on parcel weight
//                 Charges increase as the parcel weight increases
//
//  Charges:
//
//      Up to 1 kg        -> Rs.50
//      1 - 5 kg         -> Rs.50 + Rs.20 per kg above 1 kg
//      Above 5 kg       -> Rs.150 + Rs.30 per kg above 5 kg
//
//  Validation:
//
//      Weight must be greater than 0
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class CourierChargeCalculator
{
    public int CalculateCharge(int iWeight)
    {
        int iCharge = 0;

        if(iWeight <= 1)
        {
            iCharge = 50;
        }
        else if(iWeight <= 5)
        {
            iCharge = 50 + ((iWeight - 1) * 20);
        }
        else
        {
            iCharge = 150 + ((iWeight - 5) * 30);
        }

        return iCharge;
    }
}

class Question56
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iWeight = 0;
        int iRet = 0;

        CourierChargeCalculator cobj = new CourierChargeCalculator();

        System.out.print("Enter Parcel Weight (kg) : ");
        iWeight = sobj.nextInt();

        if(iWeight <= 0)
        {
            System.out.println("Invalid Input. Weight must be greater than 0");
            return;
        }

        iRet = cobj.CalculateCharge(iWeight);

        System.out.println("Parcel Weight : " + iWeight + " kg");
        System.out.println("Courier Charge : Rs." + iRet);
    }
}