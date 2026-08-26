///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 51 : Question 1
//  Program Name : HospitalBillCalculator
//  Description  : Calculates total hospital bill, insurance coverage, and final payable amount
//
//  Inputs:
//
//      Number of Days (int)
//      Ward Type (Normal / ICU) (String)
//      Medicine Bill (double)
//      Consultation Fee (double)
//      Insured Status (Yes / No) (String)
//
//  Validation:
//
//      All numerical inputs must be non-negative (>= 0)
//      Ward Type must be "Normal" or "ICU"
//      Insured status must be "Yes" or "No"
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class HospitalBillCalculator
{
    public void CalculateBill(int iDays, String wardType, double dMedicine, double dConsultation, String isInsured)
    {
        double dRoomRate = wardType.equalsIgnoreCase("ICU") ? 5000.0 : 2000.0;
        double dTotalBill = (iDays * dRoomRate) + dMedicine + dConsultation;
        double dInsuranceCover = 0.0;

        if(isInsured.equalsIgnoreCase("Yes"))
        {
            double dSeventyPercent = 0.70 * dTotalBill;
            dInsuranceCover = Math.min(50000.0, dSeventyPercent);
        }

        double dFinalPay = dTotalBill - dInsuranceCover;

        System.out.println("Total Bill        : Rs." + dTotalBill);
        System.out.println("Insurance Cover   : Rs." + dInsuranceCover);
        System.out.println("Final Amount Payable: Rs." + dFinalPay);
    }
}

class Question59
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number of Days: ");
        int iDays = sobj.nextInt();

        if(iDays < 0)
        {
            System.out.println("Invalid Input. Days must be non-negative");
            return;
        }

        System.out.print("Enter Ward Type (Normal/ICU): ");
        String wardType = sobj.next();

        if(!wardType.equalsIgnoreCase("Normal") && !wardType.equalsIgnoreCase("ICU"))
        {
            System.out.println("Invalid Input. Ward type must be 'Normal' or 'ICU'");
            return;
        }

        System.out.print("Enter Medicine Bill: ");
        double dMedicine = sobj.nextDouble();

        if(dMedicine < 0)
        {
            System.out.println("Invalid Input. Medicine bill must be non-negative");
            return;
        }

        System.out.print("Enter Consultation Fee: ");
        double dConsultation = sobj.nextDouble();

        if(dConsultation < 0)
        {
            System.out.println("Invalid Input. Consultation fee must be non-negative");
            return;
        }

        System.out.print("Is Insured? (Yes/No): ");
        String isInsured = sobj.next();

        if(!isInsured.equalsIgnoreCase("Yes") && !isInsured.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Input. Insured status must be 'Yes' or 'No'");
            return;
        }

        HospitalBillCalculator hobj = new HospitalBillCalculator();
        hobj.CalculateBill(iDays, wardType, dMedicine, dConsultation, isInsured);
    }
}