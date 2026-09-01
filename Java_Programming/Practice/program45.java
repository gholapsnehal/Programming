// Type 3


import java.util.Scanner;

class NumberX                     // user defined class so with X suffix so that inbuilt function and defined not face any conflict
{
    public boolean CheckDivisible(int iNo)          // removed static           
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0))
       {
          return true;
       }
       else
       {
          return false;
       }
    }
}

class program45
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int iValue = 0;
       boolean bRet = false;   // false = 0

       System.out.println("Enter number: ");
       iValue = sobj.nextInt();

       NumberX nobj = new NumberX();
       bRet = nobj.CheckDivisible(iValue);    
       
       if(bRet == true)
       {
        System.out.println("Number is divisible by 3 and 5");
       }
       else
       {
        System.out.println("Number is not divisible by 3 and 5");
       }

    }
}