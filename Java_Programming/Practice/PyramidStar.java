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

class PyramidStar
{
    public static void main(String A[])
    {
        int iNum = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        iNum = sobj.nextInt();

        for(i = 1; i <= iNum; i++)
        {
            for(j = 1; j <= iNum - i; j++)
            {
                System.out.print("  ");
            }

            for(j = 1; j <= (2 * i) - 1; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        sobj.close();
    }
}