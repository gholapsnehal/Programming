// Doubly Circular Linked List

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
        DoublyCL dobj = new DoublyCL();
        int iRet = 0;

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.Display();

        iRet = dobj.Count();
        System.out.println("Number of nodes are in DCL: "+iRet);

        dobj.InsertLast(111);
        dobj.InsertLast(121);
        dobj.InsertLast(151);

        dobj.Display();

        iRet = dobj.Count();
        System.out.println("Number of nodes are in DCL: "+iRet);

        dobj.InsertAtPos(101,4);

        dobj.Display();

        iRet = dobj.Count();
        System.out.println("Number of nodes are in DCL: "+iRet);

        dobj.DeleteFirst();

        dobj.DeleteLast();

        dobj.DeleteAtPos(4);

        dobj.Display();

        iRet = dobj.Count();
        System.out.println("Number of nodes are in DCL: "+iRet);
    }
    
}
