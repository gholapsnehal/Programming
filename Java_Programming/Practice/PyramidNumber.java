///////////////////////////////////////////////////////////////
//
//  Description : Display Pyramid Star Pattern
//
//  Input  : 5
//
//  Output :
//                      1
//                    2 3 2
//                   3 4 5 4 3
//                 4 5 6 7 6 5 4
//               5 6 7 8 9 8 7 6 5                 
//
//  Author      : Snehal Gholap
//  Date        : 03/08/2026
//
///////////////////////////////////////////////////////////////

import java.util.Scanner;

class Pattern
{
    public void Display(int iNo)
    {
        int i = 0;
        int j = 0;

        int iValue = 0;

        for(i = 1; i <= iNo; i++)
        {
            iValue = i;
            // leading spaces
            for(j = 1; j <= iNo - i; j++)
            {
                System.out.print("  ");
            }
            // numbers
            for(j = 1; j <= (2 * i) - 1; j++)
            {
                System.out.print(iValue + " ");

                if(j < i)
                {
                    iValue++; 
                }
                else
                {
                    iValue--;
                }
            }

            System.out.println();
        }
    }
}

class PyramidNumber
{
    public static void main(String A[])
    {
        int iNum = 0;
        
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        iNum = sobj.nextInt();

        pobj.Display(iNum);
    
        sobj.close();
    }
}