import java.util.Scanner;

class DynamicMemory
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner (System.in);
       int size = 0;

       System.out.println("Enter number of elements: ");

       size = sobj.nextInt();

       // Dynamic Memory Allocation
       float Marks[] = new float[size];

       // Use the Memory

       Marks = null;
       System.gc();

    }
}