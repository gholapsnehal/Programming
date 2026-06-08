///////////////////////////////////////////////////////////////////////////////
//
// Function name:   Summation
// Input:           Integer Array, Integer
// Output:          int
// Description:     Program to return summation of elements of an array
// Date:            09/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class NumberX
{
    public int Summation(int Arr[], int iSize)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }
}

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        NumberX nobj = new NumberX();

        int Brr[];   
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;

        // STEP : ACEEPT NUMBER OF ELEMENTS :

        System.out.println("Enter number of elements: ");
        iLength = sobj.nextInt();

        // STEP 2: ALLOCATE MEMORY

        Brr = new int[iLength];    // array object allocation

        // STEP 3: ACCEPT VALUES FROM USER

        System.out.println("Enter the elements: ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        // STEP 4: USE THE MEMORY

        iRet = nobj.Summation(Brr, iLength);

        System.out.println("Summation of array elements is: "+iRet);

        sobj.close();

        // DEALLOCATE THE MEMORY: automatically manage memory : garbage collector

        Brr = null;
        System.gc();    
    }
}