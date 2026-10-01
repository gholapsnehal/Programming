import java.util.*;

class ArrayX
{
    // characteristics

    private int Arr[];
    private int iSize;

    public ArrayX()
    {
        this(5);
    }
    
    public ArrayX(int X)
    {
        iSize = X;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;

        System.out.println("Enter element: ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
    }

    public void Display()
    {
        int iCnt = 0;
        System.out.println("Elements of an array: ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);

        }
    }

    public int Summation()
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }

}

class program170
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0;
        int iRet = 0;

        ArrayX aobj = new ArrayX();
        
        System.out.println("Enter number of elements: ");
        iLength = sobj.nextInt();

        aobj = new ArrayX(iLength);

        aobj.Accept();
        aobj.Display();

        iRet = aobj.Summation();

        System.out.println("Summation is: "+iRet);

        sobj.close();

        aobj = null;
        System.gc();

    }
}