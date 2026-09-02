///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 65 : Question 1
//  Description   : 1. Implements a browser history tracker that stores only the last 5 visited websites.
//                  2. Uses a Deque/ArrayDeque or Queue data structure:
//                     - When a new website URL is visited, it is added to the end of the history.
//                     - If the size of history exceeds 5, the oldest visited website (at the front) is removed.
//                  3. Traverses and prints the remaining 5 most recent visited websites in chronological order.
//
//  Input         : Visited website URLs:
//                  google.com
//                  github.com
//                  openai.com
//                  oracle.com
//                  stackoverflow.com
//                  youtube.com
//
//  Output        : History after all visits (Last 5 visited websites):
//                  github.com
//                  openai.com
//                  oracle.com
//                  stackoverflow.com
//                  youtube.com
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class BrowserHistory
{
    private Queue<String> historyQueue;
    private final int iCapacity = 5;

    public BrowserHistory()
    {
        historyQueue = new ArrayDeque<>();
    }

    // Adds visited website URL and maintains size limit of 5
    public void VisitWebsite(String strUrl)
    {
        if(historyQueue.size() == iCapacity)
        {
            historyQueue.poll(); // Remove the oldest visited website
        }
        historyQueue.add(strUrl);
    }

    // Displays current history
    public void DisplayHistory()
    {
        for(String strUrl : historyQueue)
        {
            System.out.println(strUrl);
        }
    }
}

class Question117
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        BrowserHistory bobj = new BrowserHistory();

        System.out.println("Enter total number of website visits :");
        int iCount = sobj.nextInt();

        System.out.println("Enter website URLs :");
        for(int iCnt = 0; iCnt < iCount; iCnt++)
        {
            String strUrl = sobj.next();
            bobj.VisitWebsite(strUrl);
        }

        System.out.println("\nAfter all visits, history should contain:\n");
        bobj.DisplayHistory();

        sobj.close();
    }
}