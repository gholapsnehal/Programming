/* Enter number of elements:
 8
output: 1       *       2       *       3       *       4       *
*/ 

import java.util.*;

class program177
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1, iCount = 1; iCnt <= iNo; iCnt++)
        {
          if(iCnt % 2 == 0)
          {
            System.out.print("*\t");
          }
          else
          {
            System.out.print(iCount+"\t");
            iCount++;
          }
         
        }

        //System.out.println();                 
    }

       
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of elements: ");
        iValue = sobj.nextInt();

        Display(iValue);

    }
}