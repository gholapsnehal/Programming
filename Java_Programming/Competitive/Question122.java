///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 66 : Question 1
//  Description   : 1. Accepts an array of transaction amounts and a target sum from the user.
//                  2. Uses a HashSet to achieve O(N) time complexity for finding two transaction 
//                     amounts that add up to the specified target sum (Two Sum problem).
//                  3. Iterates through the transaction array:
//                     - Computes complement value: (target - current amount).
//                     - Checks if complement already exists in HashSet.
//                     - If found, prints the pair matching the target sum.
//                     - If not found, inserts current transaction amount into HashSet.
//
//  Input         : Transactions list (e.g. 1200 500 700 300 1500)
//                  Target sum          (e.g. 2000)
//
//  Output        : Matching transaction pair
//                  500 + 1500 = 2000
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class TransactionMatcher
{
    public void FindTwoTransactions(int Arr[], int iTarget)
    {
        if(Arr == null || Arr.length < 2)
        {
            System.out.println("Invalid input array");
            return;
        }

        Set<Integer> seenAmounts = new HashSet<>();
        boolean bFound = false;

        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            int iComplement = iTarget - Arr[iCnt];

            // If complement exists, required pair is found
            if(seenAmounts.contains(iComplement))
            {
                System.out.println(iComplement + " + " + Arr[iCnt] + " = " + iTarget);
                bFound = true;
                break;
            }

            seenAmounts.add(Arr[iCnt]);
        }

        if(!bFound)
        {
            System.out.println("No two transactions sum up to " + iTarget);
        }
    }
}

class Question122
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter total number of transactions :");
        int iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid size");
            return;
        }

        int Arr[] = new int[iSize];

        System.out.println("Enter transaction amounts :");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter target sum :");
        int iTarget = sobj.nextInt();

        System.out.println();
        TransactionMatcher tmobj = new TransactionMatcher();
        tmobj.FindTwoTransactions(Arr, iTarget);

        sobj.close();
    }
}