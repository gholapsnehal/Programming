///////////////////////////////////////////////////////////////////////////////
//
// Function name:   EvenSum
// Input:           Integer Array, Integer
// Output:          int
// Description:     Program to return sum of even elements from an array
// Date:            09/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class NumberX
{
    public int EvenSum(int Arr[], int iSize)
    {
        int iCnt = 0;
        
        int iEvenSum = 0;
        

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvenSum = iEvenSum + Arr[iCnt];
            }
        }

        return iEvenSum;
        
    }
}

class program06
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

        iRet = nobj.EvenSum(Brr, iLength);

        System.out.println("Sum of even array elements: "+iRet);

        sobj.close();

    }

}