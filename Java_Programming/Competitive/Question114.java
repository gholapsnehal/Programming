///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 64 : Question 3
//  Description   : 1. Implements an e-commerce warehouse stock management system 
//                     using HashMap (Product ID -> Available Quantity).
//                  2. Supports the following operations:
//                     - ADD <id> <qty>     : Adds a new product or updates existing stock.
//                     - SELL <id> <qty>    : Decreases quantity of product if sufficient stock exists.
//                     - RESTOCK <id> <qty> : Increases stock quantity of an existing product.
//                     - SEARCH <id>        : Displays available quantity of the requested product.
//                  3. Performs validation to display appropriate error messages if product 
//                     does not exist or stock is insufficient for SELL operation.
//
//  Input         : Operations list (ADD, SELL, RESTOCK, SEARCH)
//                  ADD 101 50
//                  ADD 102 30
//                  SELL 101 5
//                  RESTOCK 102 20
//                  SEARCH 101
//
//  Output        : Stock status output
//                  Product 101 available quantity : 45
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Warehouse
{
    private Map<Integer, Integer> stockMap;

    public Warehouse()
    {
        stockMap = new HashMap<>();
    }

    // Adds new product or sets initial stock
    public void AddProduct(int iProductID, int iQuantity)
    {
        if(stockMap.containsKey(iProductID))
        {
            stockMap.put(iProductID, stockMap.get(iProductID) + iQuantity);
        }
        else
        {
            stockMap.put(iProductID, iQuantity);
        }
    }

    // Sells products and reduces current stock
    public void SellProduct(int iProductID, int iQuantity)
    {
        if(!stockMap.containsKey(iProductID))
        {
            System.out.println("Product " + iProductID + " does not exist");
            return;
        }

        int iCurrentQty = stockMap.get(iProductID);

        if(iCurrentQty >= iQuantity)
        {
            stockMap.put(iProductID, iCurrentQty - iQuantity);
        }
        else
        {
            System.out.println("Insufficient stock for product " + iProductID);
        }
    }

    // Restocks existing product
    public void RestockProduct(int iProductID, int iQuantity)
    {
        if(!stockMap.containsKey(iProductID))
        {
            System.out.println("Product " + iProductID + " does not exist");
            return;
        }

        stockMap.put(iProductID, stockMap.get(iProductID) + iQuantity);
    }

    // Searches and displays current product quantity
    public void SearchProduct(int iProductID)
    {
        if(stockMap.containsKey(iProductID))
        {
            System.out.println("Product " + iProductID + " available quantity : " + stockMap.get(iProductID));
        }
        else
        {
            System.out.println("Product " + iProductID + " does not exist");
        }
    }
}

class Question114
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Warehouse wobj = new Warehouse();

        System.out.println("Enter number of operations: ");
        int iOps = sobj.nextInt();

        for(int iCnt = 0; iCnt < iOps; iCnt++)
        {
            String strCommand = sobj.next();

            if(strCommand.equalsIgnoreCase("ADD"))
            {
                int iProductID = sobj.nextInt();
                int iQty = sobj.nextInt();
                wobj.AddProduct(iProductID, iQty);
            }
            else if(strCommand.equalsIgnoreCase("SELL"))
            {
                int iProductID = sobj.nextInt();
                int iQty = sobj.nextInt();
                wobj.SellProduct(iProductID, iQty);
            }
            else if(strCommand.equalsIgnoreCase("RESTOCK"))
            {
                int iProductID = sobj.nextInt();
                int iQty = sobj.nextInt();
                wobj.RestockProduct(iProductID, iQty);
            }
            else if(strCommand.equalsIgnoreCase("SEARCH"))
            {
                int iProductID = sobj.nextInt();
                wobj.SearchProduct(iProductID);
            }
        }

        sobj.close();
    }
}