///////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountEven
// Input:           Integer Array, Integer
// Output:          int
// Description:     Program to return even count of elements from array
// Date:            09/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class NumberX
{
    public int CountEven(int Arr[], int iSize)
    {
        int iCnt = 0;
        int iCountEven = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {

            if(Arr[iCnt] % 2 == 0)
            {
                iCountEven++;
            }
        }
        return iCountEven;
    }
}

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        NumberX nobj = new NumberX();

        int Brr[];
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;

        // step 1: accept number of elements:
        
        System.out.println("Enter number of elements: ");
        iLength = sobj.nextInt();

        // step 2: allocate memory

        Brr = new int[iLength];

        // accept values from user

        System.out.println("Enter the elements: ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        // use the memory
        iRet = nobj.CountEven(Brr,iLength);

        System.out.println("Even count is: "+iRet);

        sobj.close();
 
        // deallocate : garbage collectore
    }
}