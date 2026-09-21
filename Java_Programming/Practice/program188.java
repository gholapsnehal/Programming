/* Enter number of elements:
 11
output: * * * # # # * * * # #
*/

import java.util.Scanner;

class program188
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(((iCnt - 1) / 3) % 2 == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("#\t");
            }
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter number of elements: ");
        iValue = sobj.nextInt();

        Display(iValue);

    }
}





