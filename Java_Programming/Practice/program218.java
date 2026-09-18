/*  36 times loop iterate
iRow : 4
iCol : 4

// photoframe pattern
%  #  #   #
%  %  #   #          
%  %   %  #        
%   %  %  %       
 
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid parameters");
            System.out.println("number of rows and columns should be same");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i >= j)
                    {
                        System.out.print("%\t");
                    }  
                    else 
                        {
                            System.out.print("#\t");
                        }            
            }  
            System.out.println();         
        }
       
    } 
}

public class program218
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
