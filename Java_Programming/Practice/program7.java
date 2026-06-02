// find maximum number in array

import java.util.*;

class NumberX
{
    public int FindMax(int Arr[], int iSize)
    {
        int iCnt = 0;
        
        int iMax = Arr[0];
        

        for(iCnt = 1; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }

        return iMax;
        
    }
}

class program7
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        NumberX nobj = new NumberX();

        int Brr[];
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;
        
        System.out.println("Enter number of elements: ");
        iLength = sobj.nextInt();

        Brr = new int[iLength];

        // accept values from user

        System.out.println("Enter elements: ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        iRet = nobj.FindMax(Brr, iLength);

        System.out.println("Maximum number is: "+iRet);

        sobj.close();

    }

}