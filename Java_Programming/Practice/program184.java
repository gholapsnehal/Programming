/* Enter number of elements:
 7
output: A * B * C * D 
*/ 

import java.util.*;

class program184
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        char ch = 'A';
      
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
          if(iCnt % 2 == 0)
          {
            System.out.print("*\t");
          }
          else
          {
            System.out.print(ch+"\t");
            ch++;
            
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