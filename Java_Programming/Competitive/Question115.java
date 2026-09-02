///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 64 : Question 4
//  Description   : 1. Accepts total number of incoming transactions and an array of 
//                     transaction ID strings (e.g. TX101, TX102, etc.).
//                  2. Uses a HashSet/LinkedHashSet to track seen transactions and identify duplicates:
//                     - Iterates through the list of transaction IDs.
//                     - Tries adding each transaction ID to a 'seen' HashSet.
//                     - If add() returns false (meaning ID already exists), adds it to a 'duplicates' set.
//                  3. Displays the duplicate transaction IDs in order.
//
//  Input         : Number of transactions (e.g. 6)
//                  Transaction IDs (e.g. TX101, TX102, TX103, TX101, TX104, TX102)
//
//  Output        : List of duplicate transaction IDs
//                  Duplicate transactions:
//                  TX101
//                  TX102
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class TransactionTracker
{
    public void DisplayDuplicates(String Arr[])
    {
        if(Arr == null || Arr.length == 0)
        {
            return;
        }

        Set<String> seenTransactions = new LinkedHashSet<>();
        Set<String> duplicateTransactions = new LinkedHashSet<>();

        // Loop through all transaction IDs
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            // Set.add() returns false if element already exists in the set
            if(!seenTransactions.add(Arr[iCnt]))
            {
                duplicateTransactions.add(Arr[iCnt]);
            }
        }

        // Display identified duplicate transactions
        System.out.println("Duplicate transactions: ");
        for(String strTx : duplicateTransactions)
        {
            System.out.println(strTx);
        }
    }
}

class Question115
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter number of transactions: ");
        iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid size");
            return;
        }

        String Arr[] = new String[iSize];

        System.out.println("Enter Transaction IDs: ");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.next();
        }

        TransactionTracker tobj = new TransactionTracker();

        tobj.DisplayDuplicates(Arr);

        sobj.close();
    }
}