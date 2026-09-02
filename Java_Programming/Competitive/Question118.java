///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 65 : Question 2
//  Description   : 1. Implements a customer support request handling system following FIFO 
//                     (First-In, First-Out) order using Java Queue interface (LinkedList).
//                  2. Provides the following core methods:
//                     - addRequest(String request) : Enqueues a new customer request ID to the system.
//                     - processRequest()           : Removes and processes the oldest pending request from front.
//                     - showPendingRequests()      : Displays all support requests currently waiting in queue.
//                  3. Manages pending request queue appropriately when processing empty requests.
//
//  Input         : Support request IDs (e.g. R101, R102, R103, R104)
//
//  Output        : Processed requests in FIFO order and remaining pending queue list
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class SupportSystem
{
    private Queue<String> requestQueue;

    public SupportSystem()
    {
        requestQueue = new LinkedList<>();
    }

    // Adds new customer support request to the queue
    public void addRequest(String strRequestId)
    {
        requestQueue.add(strRequestId);
        System.out.println("Request added: " + strRequestId);
    }

    // Processes the oldest request in FIFO order
    public void processRequest()
    {
        if(requestQueue.isEmpty())
        {
            System.out.println("No pending requests to process");
            return;
        }

        String strProcessed = requestQueue.poll();
        System.out.println("Processing request: " + strProcessed);
    }

    // Displays all pending requests currently in the queue
    public void showPendingRequests()
    {
        if(requestQueue.isEmpty())
        {
            System.out.println("No pending requests");
            return;
        }

        System.out.println("Pending Requests: " + requestQueue);
    }
}

class Question118
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        SupportSystem system = new SupportSystem();

        System.out.println("Enter number of initial requests :");
        int iCount = sobj.nextInt();

        System.out.println("Enter request IDs :");
        for(int iCnt = 0; iCnt < iCount; iCnt++)
        {
            String strReq = sobj.next();
            system.addRequest(strReq);
        }

        System.out.println("\n--- Current Queue Status ---");
        system.showPendingRequests();

        System.out.println("\n--- Processing Requests ---");
        system.processRequest();
        system.processRequest();

        System.out.println("\n--- Queue Status After Processing ---");
        system.showPendingRequests();

        sobj.close();
    }
}