///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 53 : Question 1
//  Program Name : StudentPerformanceAnalyzer
//  Description  : Analyze student performance using a 2D matrix (student totals, topper,
//                 subject averages, failed students)
//
//  Inputs:
//
//      Integer N (number of students)
//      Integer M (number of subjects)
//      N lines of M integers each (marks of each student)
//
//  Validation:
//
//      N > 0
//      M > 0
//      Each mark must be between 0 and 100
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class StudentPerformanceAnalyzer
{
    public void AnalyzePerformance(int Arr[][], int iN, int iM)
    {
        int studentTotals[] = new int[iN];
        int iMaxTotal = -1;
        int iTopperIndex = 1;

        for(int i = 0; i < iN; i++)
        {
            int iSum = 0;
            for(int j = 0; j < iM; j++)
            {
                iSum += Arr[i][j];
            }
            studentTotals[i] = iSum;

            if(iSum > iMaxTotal)
            {
                iMaxTotal = iSum;
                iTopperIndex = i + 1;
            }
        }

        System.out.println("Student Totals:");
        for(int i = 0; i < iN; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + studentTotals[i]);
        }

        System.out.println("\nTopper: Student " + iTopperIndex);

        System.out.println("\nSubject Averages:");
        for(int j = 0; j < iM; j++)
        {
            double dSubSum = 0;
            for(int i = 0; i < iN; i++)
            {
                dSubSum += Arr[i][j];
            }
            double dAvg = dSubSum / iN;
            System.out.printf("Subject %d: %.2f\n", (j + 1), dAvg);
        }

        System.out.println("\nStudents Failed:");
        boolean bAnyFailed = false;
        for(int i = 0; i < iN; i++)
        {
            for(int j = 0; j < iM; j++)
            {
                if(Arr[i][j] < 35)
                {
                    System.out.println("Student " + (i + 1));
                    bAnyFailed = true;
                    break;
                }
            }
        }

        if(!bAnyFailed)
        {
            System.out.println("None");
        }
    }
}

class Question68
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        if(!sobj.hasNextInt())
        {
            System.out.println("Invalid Input");
            return;
        }
        int iN = sobj.nextInt();

        if(!sobj.hasNextInt())
        {
            System.out.println("Invalid Input");
            return;
        }
        int iM = sobj.nextInt();

        if(iN <= 0 || iM <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[][] = new int[iN][iM];

        for(int i = 0; i < iN; i++)
        {
            for(int j = 0; j < iM; j++)
            {
                if(!sobj.hasNextInt())
                {
                    System.out.println("Invalid Input");
                    return;
                }
                Arr[i][j] = sobj.nextInt();

                if(Arr[i][j] < 0 || Arr[i][j] > 100)
                {
                    System.out.println("Invalid Input");
                    return;
                }
            }
        }

        StudentPerformanceAnalyzer sobjAnalyzer = new StudentPerformanceAnalyzer();
        sobjAnalyzer.AnalyzePerformance(Arr, iN, iM);
    }
}