//Singly Circular Linked List

import java.util.Scanner;

class Node
{
    public int data;
    public Node next;

    Node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyCL 
{
    private Node first;
    private Node last;
    private int iCount;

    public SinglyCL()
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void Display()
    {
        // Input filter
        if(first == null && last == null)
        {
            return;
        }

        Node temp = first;

        do 
        {
            System.out.print("| "+temp.data+" | - > ");
            temp = temp.next;

        }while(temp != last.next);

        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int iNo)
    {
        Node newn = new Node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else 
        {
            newn.next = first;
            first = newn;
        }

        last.next = first;

        iCount++;
    }

    public void InsertLast(int iNo)
    {
        Node newn = new Node(iNo);
       
        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else 
        {
            last.next = newn;
            last = last.next;
        }

        last.next = first;

        iCount++;
    }

    public void InsertAtPos(int iNo, int iPos)
    {
        Node temp = null;
        Node newn = null;

        int i = 0;

        // Input Filter
        if((iPos < 1) || (iPos > iCount + 1))
        {
            System.out.println("Invalid positon");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == iCount + 1)
        {
            InsertLast(iNo);
        }
        else 
        {
            temp = first;

            newn = new Node(iNo);

            for(i = 1; i < (iPos - 1); i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;

            iCount++;
        }

    }

    public void DeleteFirst()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else 
        {
            first = first.next;

            last.next = first;
        }

        iCount--;
    }

    public void DeleteLast()
    {
        Node temp = null;

        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else 
        {
            temp = first;

            while(temp.next != last)
            {
                temp = temp.next;
            }

            last = temp;

            last.next = first;
        }

        iCount--;

    }

    public void DeleteAtPos(int iPos)
    {
        int i = 0;
        Node temp = null;

        // Input Filter
        if((iPos < 1) || (iPos > iCount))
        {
            System.out.println("Invalid position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else 
        {
            temp = first;
            Node target = null;

            for(i = 1; i < (iPos - 1); i++)
            {
                temp = temp.next;
            }

            // target initialized
            target = temp.next;

            temp.next = target.next;
            //target = null;

            iCount--;
        }

    }
}

public class SinglyCircularLL 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        SinglyCL obj = new SinglyCL();

        int iChoice = 0;
        int iValue = 0;
        int iPosition = 0;
        int iRet = 0;

        while(iChoice != 9)
        {
            System.out.println("--------------------------------");
            System.out.println("1 : Insert First");
            System.out.println("2 : Insert Last");
            System.out.println("3 : Insert At Position");
            System.out.println("4 : Delete First");
            System.out.println("5 : Delete Last");
            System.out.println("6 : Delete At Position");
            System.out.println("7 : Display");
            System.out.println("8 : Count");
            System.out.println("9 : Exit");
            System.out.println("--------------------------------");

            System.out.println("Enter your choice : ");
            iChoice = sobj.nextInt();

            switch (iChoice) 
            {
                case 1:
                    System.out.print("Enter Value : ");
                    iValue = sobj.nextInt();
                    obj.InsertFirst(iValue);
                    break;

                case 2:
                    System.out.print("Enter Value : ");
                    iValue = sobj.nextInt();
                    obj.InsertLast(iValue);
                    break;

                case 3:
                    System.out.print("Enter Value : ");
                    iValue = sobj.nextInt();
                    System.out.print("Enter Position : ");
                    iPosition = sobj.nextInt();

                    obj.InsertAtPos(iValue, iPosition);
                    break;

                case 4:
                    obj.DeleteFirst();
                    break;

                case 5:
                    obj.DeleteLast();
                    break;

                case 6:
                    System.out.print("Enter position : ");
                    iPosition = sobj.nextInt();

                    obj.DeleteAtPos(iPosition);
                    break;

                case 7:
                    obj.Display();
                    break;

                case 8:
                    iRet = obj.Count();

                    System.out.println("Number of nodes are in Singly Circular: "+iRet);
                    break;

                case 9:
                    System.out.println("Thank you for using Singly Circular Linked List Application");
                    break;
                   
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        sobj.close();
    }
    
}
