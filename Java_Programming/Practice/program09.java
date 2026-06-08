///////////////////////////////////////////////////////////////////////////////
//
// Function name:   DiffEvenOddSum
// Input:           Integer Array, Integer
// Output:          int
// Description:     Program to return difference between sum of even and odd elements
// Date:            09/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX
{
    public int DiffEvenOddSum(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iOddSum = 0;
        int iEvenSum = 0;
       
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvenSum = iEvenSum + Arr[iCnt];
            }
            else
            {
                iOddSum = iOddSum + Arr[iCnt];
            }
        }

        return (iEvenSum - iOddSum);
        
    }
}

class program09
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        ArrayX aobj = new ArrayX();

        int Brr[];
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;
        
        // accept number of elements
        System.out.println("Enter number of elements: ");
        iLength = sobj.nextInt();

        // allocate memory
        Brr = new int[iLength];

        // accept values from user

        System.out.println("Enter elements: ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        // use memory or operation
        iRet = aobj.DiffEvenOddSum(Brr, iLength);

        System.out.println("Difference between even and odd sum is : "+iRet);

        sobj.close();

        Brr = null;
        System.gc();
    }

}