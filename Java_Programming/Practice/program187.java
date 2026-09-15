/* Enter number of elements:
 7
output: A b C d E f G
*/ 

import java.util.*;

class program187
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        char ch = '\0';
        char ch1 = '\0';
      
        for(iCnt = 1, ch = 'a', ch1 = 'A'; iCnt <= iNo; iCnt++,ch++,ch1++)
        {
          if(iCnt % 2 == 0)
          {
            System.out.print(ch+"\t");
           
          }
          else
          {
            System.out.print(ch1+"\t");                   
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