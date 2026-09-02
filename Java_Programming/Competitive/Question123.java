///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 66 : Question 2
//  Description   : 1. Accepts total number of Employee IDs and an array containing Employee IDs.
//                  2. Uses a HashSet to achieve O(N) optimal time complexity for finding the 
//                     longest consecutive sequence of Employee IDs.
//                  3. Inserts all IDs into HashSet:
//                     - For each ID, checks if it is the starting point of a sequence (i.e. id - 1 is not in set).
//                     - If it is a starting point, checks for consecutive elements (id + 1, id + 2, etc.).
//                     - Tracks and stores the maximum length sequence and its elements.
//                  4. Prints the longest consecutive sequence elements along with its total length.
//
//  Input         : Employee IDs list (e.g. 100 4 200 1 3 2 5)
//
//  Output        : Longest consecutive sequence details:
//                  1 2 3 4 5
//                  Length : 5
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class SequenceTracker
{
    public void FindLongestConsecutiveSequence(int Arr[])
    {
        if(Arr == null || Arr.length == 0)
        {
            System.out.println("Invalid input array");
            return;
        }

        Set<Integer> idSet = new HashSet<>();

        // Add all elements to HashSet
        for(int val : Arr)
        {
            idSet.add(val);
        }

        int iMaxLen = 0;
        int iBestStart = 0;

        // Iterate through unique elements in set
        for(int id : idSet)
        {
            // Check if 'id' is the start of a sequence
            if(!idSet.contains(id - 1))
            {
                int iCurrentNum = id;
                int iCurrentStreak = 1;

                // Count consecutive numbers
                while(idSet.contains(iCurrentNum + 1))
                {
                    iCurrentNum += 1;
                    iCurrentStreak += 1;
                }

                if(iCurrentStreak > iMaxLen)
                {
                    iMaxLen = iCurrentStreak;
                    iBestStart = id;
                }
            }
        }

        // Display sequence numbers
        for(int iCnt = 0; iCnt < iMaxLen; iCnt++)
        {
            System.out.print((iBestStart + iCnt) + " ");
        }
        System.out.println("\n\nLength : " + iMaxLen);
    }
}

class Question123
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter total number of Employee IDs :");
        int iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid size");
            return;
        }

        int Arr[] = new int[iSize];

        System.out.println("Enter Employee IDs :");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println();
        SequenceTracker stobj = new SequenceTracker();
        stobj.FindLongestConsecutiveSequence(Arr);

        sobj.close();
    }
}