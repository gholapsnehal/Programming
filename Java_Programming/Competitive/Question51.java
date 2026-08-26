///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment  49 : Question 3
//  Program Name  : Stock Order Processing
//  Description   : Check whether sufficient stock is available for an order,
//                  process the order, update the remaining stock and display
//                  a low stock alert when required
//
//  Rules:
//      If requested quantity > available stock -> Order fails
//      Else deduct requested quantity from stock
//      If remaining stock < 5 -> Print Low Stock Alert
//
//  Validation:
//      Stock cannot be negative
//      Requested quantity must be greater than 0
//
//  Author        : Snehal Gholap
//  Date          : 26/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class StockOrder
{
    private int stock;
    private int quantity;

    public StockOrder(int stock, int quantity)
    {
        this.stock = stock;
        this.quantity = quantity;
    }

    public void processOrder()
    {
        if (quantity > stock)
        {
            System.out.println("Order Failed: Insufficient Stock");
        }
        else
        {
            stock = stock - quantity;

            System.out.println("Order Processed Successfully");
            System.out.println("Remaining Stock: " + stock);

            if (stock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}

public class Question51
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current stock: ");
        int stock = sc.nextInt();

        System.out.print("Enter requested quantity: ");
        int quantity = sc.nextInt();

        // Validation
        if (stock < 0)
        {
            System.out.println("Invalid input. Stock cannot be negative");
        }
        else if (quantity <= 0)
        {
            System.out.println("Invalid input. Requested quantity must be greater than 0");
        }
        else
        {
            StockOrder order = new StockOrder(stock, quantity);
            order.processOrder();
        }

        sc.close();
    }
}