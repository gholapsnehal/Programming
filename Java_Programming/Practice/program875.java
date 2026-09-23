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
}


public class program875
{
    public static void main(String A[])
    {
        Searching sobj = new Searching(5);

        sobj.Accept();
        sobj.Display();

        if(sobj.BiDirectionalSearch(30))
        {
            System.out.println("Element is present in an array");
        }
        else
        {
            System.out.println("Element is not there in an array");
        }
    }
}

// n/2
