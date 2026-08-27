///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 52 : Question 2
//  Program Name : ElectionVoteCounter
//  Description  : Store votes by voter ID, accepting unique votes and rejecting duplicate votes
//
//  Inputs:
//
//      Number of votes N (int)
//      N voter IDs (int array)
//
//  Validation:
//
//      N >= 0
//      IDs must be non-negative integers (>= 0)
//
//  Author       : Snehal Gholap
//  Date         : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class ElectionVoteCounter
{
    public void ProcessVotes(int Arr[])
    {
        HashSet<Integer> uniqueVoters = new HashSet<>();
        int iDuplicateCount = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(uniqueVoters.contains(Arr[i]))
            {
                iDuplicateCount++;
            }
            else
            {
                uniqueVoters.add(Arr[i]);
            }
        }

        System.out.println("Valid Votes: " + uniqueVoters.size());
        System.out.println("Rejected Duplicate Votes: " + iDuplicateCount);
    }
}

class Question65
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number of Votes (N): ");
        int iSize = sobj.nextInt();

        if(iSize < 0)
        {
            System.out.println("Invalid Input. N must be >= 0");
            return;
        }

        int Arr[] = new int[iSize];

        if(iSize > 0)
        {
            System.out.println("Enter Voter IDs:");
            for(int i = 0; i < iSize; i++)
            {
                Arr[i] = sobj.nextInt();

                if(Arr[i] < 0)
                {
                    System.out.println("Invalid Input. Voter IDs must be non-negative integers");
                    return;
                }
            }
        }

        ElectionVoteCounter vobj = new ElectionVoteCounter();
        vobj.ProcessVotes(Arr);
    }
}