///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 64 : Question 1
//  Description   : 1. Accepts total number of employee entries and an array of Employee IDs.
//                  2. Uses LinkedHashMap to preserve the insertion order of Employee IDs.
//                  3. Iterates through the input array and updates the frequency count in Map:
//                     - If ID already exists in Map, increment its count by 1.
//                     - If ID is new, insert it into Map with initial count of 1.
//                  4. Traverses Map entries and prints each Employee ID along with its entry count.
//
//  Input         : Number of entries (e.g. 8)
//                  Employee IDs array (e.g. 101 102 103 101 104 102 101 105)
//
//  Output        : Frequency of each Employee ID in order of appearance
//                  101 -> 3
//                  102 -> 2
//                  103 -> 1
//                  104 -> 1
//                  105 -> 1
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class EmployeeTracker
{
    public void DisplayEntryCount(int Arr[])
    {
        if(Arr == null || Arr.length == 0)
        {
            return;
        }

        // LinkedHashMap keeps track of unique IDs and maintains order of first arrival
        Map<Integer, Integer> hobj = new LinkedHashMap<>();

        // Loop through all recorded Employee IDs
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(hobj.containsKey(Arr[iCnt]))
            {
                // Increment count if ID is already registered
                hobj.put(Arr[iCnt], hobj.get(Arr[iCnt]) + 1);
            }
            else
            {
                // Set initial count 1 for new Employee ID
                hobj.put(Arr[iCnt], 1);
            }
        }

        // Display results in required format (ID -> Count)
        for(Map.Entry<Integer, Integer> entry : hobj.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

class Question112
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter number of entries: ");
        iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid size");
            return;
        }

        int Arr[] = new int[iSize];

        System.out.println("Enter Employee IDs: ");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        EmployeeTracker eobj = new EmployeeTracker();

        eobj.DisplayEntryCount(Arr);

        sobj.close();
    }
}