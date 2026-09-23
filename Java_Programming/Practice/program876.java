// Q. To check whether Array is sorted or not

import java.util.*;

interface GetterSetter
{
    void Accept();
    void Display();

}

class ArrayX implements GetterSetter
{
    protected int Arr[];
    protected int iSize;

    public ArrayX(int iSize)
    {
        this.iSize = iSize;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of array");

        for(int i = 0; i < this.iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {

        System.out.println("Elements of  an array");

        for(int i = 0; i < this.iSize; i++)
        {
            System.out.print(Arr[i]+"\t");
        }

        System.out.println();
    }

}

// cannot be extended by othe classes
final class Searching extends ArrayX
{
    public Searching(int iSize)
    {
        // It will call constructor of ArrayX class
        super(iSize);    
    }

    public boolean LinearSearch(int iNo)
    {
        int i = 0;
        boolean bFlag = false;

        for(i = 0; i < super.iSize; i++)
        {
            if(Arr[i] == iNo)
            {
                bFlag = true;
                break;
            }

        }

        return bFlag;
    }

    public boolean BiDirectionalSearch(int iNo)
    {
        int iStart = 0, iEnd = 0;

        iStart = 0;
        iEnd = super.iSize - 1;

        boolean bFlag = false;

        while(iStart <= iEnd)
        {
            if(Arr[iStart] == iNo || Arr[iEnd] == iNo)
            {
                bFlag = true;
                break;
            }

            iStart++;
            iEnd--;
        }

        return bFlag;

    }

    public boolean CheckSorted()
    {
        int i = 0;
        boolean bFlag = true;

        for(i = 0; i < iSize - 1; i++)
        {
            if(Arr[i] > Arr[i + 1])
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;

    }
}


public class program876
{
    public static void main(String A[])
    {
        Searching sobj = new Searching(5);

        sobj.Accept();
        sobj.Display();

        if(sobj.CheckSorted())
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}

// n/2
