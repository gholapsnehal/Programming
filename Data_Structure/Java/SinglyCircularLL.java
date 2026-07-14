//Singly Circular Linked List

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
        int iRet = 0;

        SinglyCL sobj = new SinglyCL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(101);
        sobj.InsertLast(111);
        sobj.InsertLast(121);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of nodes in SCL: "+iRet);

        sobj.InsertAtPos(105,4);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of nodes in SCL: "+iRet);

        sobj.DeleteFirst();

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of nodes in SCL: "+iRet);

        sobj.DeleteLast();

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of nodes in SCL: "+iRet);

        sobj.DeleteAtPos(4);

        sobj.Display();

        iRet = sobj.Count();
        System.out.println("Number of nodes in SCL: "+iRet);

    }
    
}
