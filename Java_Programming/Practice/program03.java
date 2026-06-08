///////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Input:           Integer Array, Integer
// Output:          void
// Description:     Display elements of an array
// Date:            09/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////

import java.util.*;

class NumberX
{
    public void Display(int Arr[], int iSize)
    {
        int iCnt = 0;

        System.out.println("Elements of an array are: ");

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]); 
        }
    }
}

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        NumberX nobj = new NumberX();

        int Brr[];
        int iLength = 0;
        int iCnt = 0;

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

        nobj.Display(Brr,iLength);

        sobj.close();
 
        // use the memory

        // deallocate : garbage collectore
    }
}