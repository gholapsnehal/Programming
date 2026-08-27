///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 52 : Question 3
//  Program Name : FitnessStepTracker
//  Description  : Record steps for 7 days, count how many days the user achieved the goal (>= 10000 steps),
//                 and determine the maximum step count in the week
//
//  Inputs:
//
//      7 integers (steps per day)
//
//  Validation:
//
//      Steps must be >= 0
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class FitnessStepTracker
{
    public void AnalyzeSteps(int Arr[])
    {
        int iGoalCount = 0;
        int iMaxSteps = Arr[0];

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 10000)
            {
                iGoalCount++;
            }

            if(Arr[i] > iMaxSteps)
            {
                iMaxSteps = Arr[i];
            }
        }

        System.out.println("Goal Achieved Days: " + iGoalCount);
        System.out.println("Maximum Steps in Week: " + iMaxSteps);
    }
}

class Question66
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = new int[7];

        System.out.println("Enter step counts for 7 days:");
        for(int i = 0; i < 7; i++)
        {
            Arr[i] = sobj.nextInt();

            if(Arr[i] < 0)
            {
                System.out.println("Invalid Input. Steps must be >= 0");
                return;
            }
        }

        FitnessStepTracker fobj = new FitnessStepTracker();
        fobj.AnalyzeSteps(Arr);
    }
}