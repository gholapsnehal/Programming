/* Enter number of elements:
 8
output: 
*/ 

import java.util.*;

class program178
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
          if(iCnt % 2 == 0)
          {
            System.out.print("*\t");
          }
          else
          {
            System.out.print(((iCnt/2)+1) +"\t");
            
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