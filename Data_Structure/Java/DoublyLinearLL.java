// Doubly Linear Linked List

import java.util.Scanner;

class node
{
    public int data;
    public node next;
    public node previous;

    node(int no)
    {
        this.data = no;
        this.next = null;
        this.previous = null;
    }
}

class DoublyLL 
{
    private node first;
    private int iCount = 0;

    public DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        System.out.print("null <=> ");

        while(temp != null)
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.next;
        }

        System.out.print("null");
        System.out.println();
    }

    public int Count()
    {
       return this.iCount;
    }

    public void InsertFirst(int iNo)
    {
      
        node newn = new node(iNo);

        if(null == first)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first.previous = newn;
            first = newn;
        }

        iCount++;

    }

    public void InsertLast(int iNo)
    {
        
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
           node temp = first;
           
           while(temp.next != null)
           {
               temp = temp.next;             
           }

           temp.next = newn;
           newn.previous = temp;
        }

        iCount++;

    }

    public void InsertAtPos(int iNo, int iPos)
    {
        int i = 0;

        // Input Filter
        if((iPos < 1) || (iPos > iCount + 1))
        {
            System.out.println("Invalid position");
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
            node temp = first;

            node newn = new node(iNo);

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
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            first = first.next;
            first.previous = null;
        }

        iCount--;

    }

    public void DeleteLast()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else 
        {
            node temp = first;
            
            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            node target = temp.next;
            temp.next = null;
            target.previous = null;
        }

        iCount--;

    }

    public void DeleteAtPos(int iPos)
    {
        node temp = null;
        int i = 0;

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

            for(i = 1; i < iPos - 1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            temp.next.previous = temp;

            iCount--;
        }
    }

}

public class DoublyLinearLL 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        DoublyLL obj = new DoublyLL();

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

                    System.out.println("Number of nodes are in Doubly Linear: "+iRet);
                    break;

                case 9:
                    System.out.println("Thank you for using Doubly Linear Linked List Application");
                    break;
                   
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        sobj.close();
        
    }
    
}
