///////////////////////////////////////////////////////////////
//
//  Description : Display Pyramid Star Pattern
//
//  Input  : 5
//
//  Output :
//
//          *
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * *
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

        for(i = 1; i <= iNo; i++)
        {
            for(j = 1; j <= iNo - i; j++)
            {
                System.out.print("  ");
            }

            for(j = 1; j <= (2 * i) - 1; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}

class PyramidStarX1
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