///////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountOdd
// Input:           Integer Array, Integer
// Output:          int
// Description:     Program to return odd count of elements from array
// Date:            09/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class NumberX
{
    public int CountOdd(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iOddCount = 0;
        

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iOddCount++;
            }
        }
        return iOddCount;

    }
}

class program05
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

        iRet = nobj.CountOdd(Brr, iLength);

        System.out.println("Odd Count: "+iRet);

        sobj.close();

    }

}