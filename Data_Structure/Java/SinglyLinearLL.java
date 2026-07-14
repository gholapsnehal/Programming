// Singly Linear Linked List

import java.util.Scanner;

class node
{
    public int data;
    public node next;    

    node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" | - > ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public int Count()
    {
        node temp = first;
        int iCount = 0;

        while(temp != null)
        {
            iCount++;
            temp = temp.next;
        }

        return iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }

        iCount++;

    }   
    
    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);
        //node temp = null;

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
        }

        iCount++;

    }

    public void InsertAtPos(int iNo, int iPos)
    {
        node temp = null;
        node newn = null;
  
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
            newn = new node(iNo);
            temp = first;

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

            temp.next = null;
            
        }

        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        node temp = null;  
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

            iCount--;
        }

    }

}

public class SinglyLinearLL
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        SinglyLL obj = new SinglyLL();

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

                    System.out.println("Number of nodes are in Singly Linear: "+iRet);
                    break;

                case 9:
                    System.out.println("Thank you for using Singly Linear Linked List Application");
                    break;
                   
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sobj.close();
    }
}

