///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 50 : Question 5
//  Program Name : BatteryStatusNotifier
//  Description  : Check battery percentage and display corresponding battery status
//
//  Inputs:
//
//      Battery percentage (integer)
//
//  Validation:
//
//      0 to 100 only
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class BatteryStatusNotifier
{
    public void DisplayBatteryStatus(int iBattery)
    {
        System.out.println("Battery Percentage: " + iBattery + "%");

        if(iBattery <= 5)
        {
            System.out.println("Status: Critical");
        }
        else if(iBattery <= 15)
        {
            System.out.println("Status: Low");
        }
        else
        {
            System.out.println("Status: Normal");
        }
    }
}

class Question58
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iBattery = 0;

        System.out.print("Enter Battery Percentage : ");
        iBattery = sobj.nextInt();

        if(iBattery < 0 || iBattery > 100)
        {
            System.out.println("Invalid Input. Battery percentage must be between 0 and 100");
            return;
        }

        BatteryStatusNotifier bobj = new BatteryStatusNotifier();

        bobj.DisplayBatteryStatus(iBattery);
    }
}