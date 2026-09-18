/*  36 times loop iterate
iRow : 4
iCol : 4

a b c d
1 2 3 4
a b c d 
1 2 3 4
 */
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = '\0';

        for(i = 1; i <= iRow; i++)
        {
            if((i % 2) != 0)
            {
                for(j = 1,ch = 'a'; j <= iCol; j++,ch++)
                {
                System.out.print(ch+"\t"); 
                }
            }    
            else 
            {
               for(j = 1; j <= iCol; j++)
                {
                System.out.print(j+"\t"); 
                }
            }     

            System.out.println();
            }
        }
    }


public class program206
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Pattern pobj = new Pattern();

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns :");
        iValue2 = sobj.nextInt();

        pobj.Display(iValue1,iValue2);

    }
    
}
