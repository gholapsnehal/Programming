// accept number from user and check whether its perfect or not

import java.util.Scanner;

class NumberX  
{
   public boolean CheckPerfect(int iNo)
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

       if(iSum == iNo)                // sum of factor of number equals to that user inout number = perfect number
       {
         return true;
       }
       else
       {
         return false;
       }
   }

}

class program50
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int iValue = 0;
       boolean bRet = false;
       
       System.out.println("Enter number: ");
       iValue = sobj.nextInt();

       NumberX nobj = new NumberX();

       bRet = nobj.CheckPerfect(iValue);        // function call

       if(bRet == true)
       {
         System.out.println("It's a perfect number");
       }
       else
       {
         System.out.println("Its not a perfect number");
       }

    }
}

// Time Complexity : O(N/2)
// where N >= 0