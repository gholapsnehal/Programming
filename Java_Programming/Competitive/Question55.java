///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 50 : Question 2
//  Program Name : ScholarshipEligibilityChecker
//  Description  : Determine whether a student is eligible for a
//                 scholarship based on academic performance,
//                 attendance and family income
//
//  Conditions:
//
//      Marks >= 80%
//      Attendance >= 75%
//      Family Income <= Rs.3,00,000
//
//  Validation:
//
//      Marks must be between 0 and 100
//      Attendance must be between 0 and 100
//      Income cannot be negative
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ScholarshipEligibilityChecker
{
    public String CheckEligibility(int iMarks, int iAttendance, int iIncome)
    {
        if(iMarks < 80)
        {
            return "Scholarship Rejected: Marks below 80%";
        }

        if(iAttendance < 75)
        {
            return "Scholarship Rejected: Attendance below 75%";
        }

        if(iIncome > 300000)
        {
            return "Scholarship Rejected: Family income exceeds Rs.300000";
        }

        return "Scholarship Approved";
    }
}

class Question55
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iMarks = 0;
        int iAttendance = 0;
        int iIncome = 0;

        ScholarshipEligibilityChecker scobj = new ScholarshipEligibilityChecker();

        System.out.print("Enter Marks Percentage : ");
        iMarks = sobj.nextInt();

        System.out.print("Enter Attendance Percentage : ");
        iAttendance = sobj.nextInt();

        System.out.print("Enter Family Income : ");
        iIncome = sobj.nextInt();

        if((iMarks < 0) || (iMarks > 100))
        {
            System.out.println("Invalid Input. Marks must be between 0 and 100");
            return;
        }

        if((iAttendance < 0) || (iAttendance > 100))
        {
            System.out.println("Invalid Input. Attendance must be between 0 and 100");
            return;
        }

        if(iIncome < 0)
        {
            System.out.println("Invalid Input. Income cannot be negative");
            return;
        }

        String strRet = scobj.CheckEligibility(iMarks, iAttendance, iIncome);

        System.out.println(strRet);
    }
}