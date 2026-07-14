// Doubly Circular Linked List
import java.util.Scanner;

class Node
{
    public int data;
    public Node next;
    public Node previous;

    Node(int no)
    {
        this.data = no;
        this.next = null;
        this.previous = null;
    }
}

class DoublyCL 
{
    private Node first;
    private Node last;
    private int iCount;

    public DoublyCL()
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void Display()
    {
        Node temp = first;

        // Input Filter
        if(first == null && last == null)
        {
            return;
        }

        System.out.print(" <=> ");

        do 
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.next;

        }while(temp != last.next);

        System.out.println();
    }

    public int Count()
    {
        return this.iCount;
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
            first.previous = newn;
            first = newn;
        }

        last.next = first;
        first.previous = last;

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
            newn.previous = last;
            last = newn;
        }

        last.next = first;
        first.previous = last;

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
            System.out.println("Invalid Position");
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
            temp.next.previous = newn;

            temp.next = newn;
            newn.previous = temp;

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
            first.previous = last;
        }

        iCount--;
    }

    public void DeleteLast()
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
            last = last.previous;

            last.next = first;
            first.previous = last;
        }

        iCount--;
        
    }

    public void DeleteAtPos(int iPos)
    {
        Node temp = null;
        int i = 0;

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

            for(i = 1; i < (iPos - 1); i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            temp.next.previous = temp;

            iCount--;
        }

    }
}

public class DoublyCircularLL 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DoublyCL dobj = new DoublyCL();

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
                    dobj.InsertFirst(iValue);
                    break;

                case 2:
                    System.out.print("Enter Value : ");
                    iValue = sobj.nextInt();
                    dobj.InsertLast(iValue);
                    break;

                case 3:
                    System.out.print("Enter Value : ");
                    iValue = sobj.nextInt();
                    System.out.print("Enter Position : ");
                    iPosition = sobj.nextInt();

                    dobj.InsertAtPos(iValue, iPosition);
                    break;

                case 4:
                    dobj.DeleteFirst();
                    break;

                case 5:
                    dobj.DeleteLast();
                    break;

                case 6:
                    System.out.print("Enter position : ");
                    iPosition = sobj.nextInt();

                    dobj.DeleteAtPos(iPosition);
                    break;

                case 7:
                    dobj.Display();
                    break;

                case 8:
                    iRet = dobj.Count();

                    System.out.println("Number of nodes are in Doubly Circular: "+iRet);
                    break;

                case 9:
                    System.out.println("Thank you for using Doubly Circular Linked List Application");
                    break;
                   
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sobj.close();        
    }
    
}
