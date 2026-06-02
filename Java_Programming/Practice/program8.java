// find maximum number in array

import java.util.*;

class NumberX
{
    public int FindMin(int Arr[], int iSize)
    {
        int iCnt = 0;
        
        int iMin = Arr[0];
        

        for(iCnt = 1; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }

        return iMin;
        
    }
}

class program8
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

        iRet = nobj.FindMin(Brr, iLength);

        System.out.println("Minimum number is: "+iRet);

        sobj.close();

    }

}