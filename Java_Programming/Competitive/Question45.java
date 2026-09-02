///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 48   : Question 2
//  Program Name : ATMTransaction
//  Description  : Accept current balance and withdrawal amount, validate
//                 transaction rules and display remaining balance.
//
//  Rules:
//      Withdrawal amount must be a multiple of Rs.100
//      Maximum withdrawal per transaction is Rs.25000
//      Minimum balance after withdrawal must be Rs.1000
//
//  Author       : Snehal Gholap
//  Date         : 14/08/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

class ATMTransaction
{
    public int processWithdrawal(int balance, int withdrawalAmount)
    {
        int newBalance = 0;
        
        if(balance < 0 || withdrawalAmount <= 0)
        {
            return -1;
        }
        else if(withdrawalAmount % 100 != 0)
        {
            return -2;
        }
        else if(withdrawalAmount > 25000)
        {
            return -3;
        }
        else if((balance - withdrawalAmount) < 1000)
        {
            return -4;
        }

        newBalance = balance - withdrawalAmount;
        return newBalance;
    }
}

public class Question45
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        ATMTransaction aobj = new ATMTransaction();

        int amount = 0;
        int balance = 0;
        int iRet = 0;

        System.out.println("Enter current balance : ");
        balance = sobj.nextInt();

        System.out.println("Enter withdrawal amount : ");
        amount = sobj.nextInt();

        iRet = aobj.processWithdrawal(balance,amount);

        if(iRet == -1)
        {
            System.out.println("Invalid input");
        }
        else if(iRet == -2)
        {
            System.out.println("Transaction Failed : Amount must be multiple of 100");  
        }
        else if(iRet == -3)
        {
            System.out.println("Transaction Failed : Maximum withdrawal limit exceeded");
        }
        else if(iRet == -4)
        {
            System.out.println("Transaction Failed : Minimum balance of Rs.1000 must be maintained");
        }
        else
        {
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance : "+iRet);
        }

        sobj.close();
    }
}