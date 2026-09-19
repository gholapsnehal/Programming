// accept number from user and perform addition of their factors.

import java.util.Scanner;

class NumberX  
{
   public void DisplaySumFactor(int iNo)
   {
      int iCnt = 0;
      int iSum = 0;

      for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
      {
         if((iNo % iCnt == 0))
         {
            iSum = iSum + iCnt;
         }
      }

       System.out.println("Summation of factors: "+iSum);
   }

}

class program48
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int iValue = 0;
       
       System.out.println("Enter number: ");
       iValue = sobj.nextInt();

       NumberX nobj = new NumberX();

       nobj.DisplaySumFactor(iValue);        // function call
 
    }
}

// Time Complexity : O(N/2)
// where N >= 0