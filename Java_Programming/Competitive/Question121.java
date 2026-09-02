///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 65 : Question 5
//  Description   : 1. Accepts total number of product IDs and an array of recorded Product IDs.
//                  2. Uses HashMap to store each Product ID and calculate its purchase frequency:
//                     - Increments count in Map if Product ID already exists.
//                     - Adds Product ID with count 1 if appearing for the first time.
//                  3. Converts Map entries to a List and sorts them in descending order based on 
//                     frequency (value).
//                  4. Displays top 2 most frequently purchased product IDs along with their count.
//
//  Input         : Product IDs array:
//                  101 102 101 103 101 102 104 105 102 102 103
//
//  Output        : Top 2 most frequently purchased products:
//                  102 -> 4
//                  101 -> 3
//
//  Author        : Snehal Gholap
//  Date          : 03/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class ProductTracker
{
    public void DisplayTopTwoProducts(int Arr[])
    {
        if(Arr == null || Arr.length == 0)
        {
            return;
        }

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Calculate product purchase frequency
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(freqMap.containsKey(Arr[iCnt]))
            {
                freqMap.put(Arr[iCnt], freqMap.get(Arr[iCnt]) + 1);
            }
            else
            {
                freqMap.put(Arr[iCnt], 1);
            }
        }

        // Convert Map entries to List for sorting
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());

        // Sort entries in descending order of frequency (value)
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>()
        {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2)
            {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        // Print top 2 most frequent products
        int iCount = 0;
        for(Map.Entry<Integer, Integer> entry : entryList)
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            iCount++;
            if(iCount == 2)
            {
                break;
            }
        }
    }
}

class Question121
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of product records :");
        int iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid size");
            return;
        }

        int Arr[] = new int[iSize];

        System.out.println("Enter Product IDs :");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println();
        ProductTracker pobj = new ProductTracker();
        pobj.DisplayTopTwoProducts(Arr);

        sobj.close();
    }
}