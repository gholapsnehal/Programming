import java.util.Scanner;

public class Question42
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int daysKept = 0;
        int Fine = 0;

        System.out.println("Enter total number of days the book was kept (daysKept) : ");
        daysKept = sobj.nextInt();

        // validation
        if(daysKept < 0)
        {
            System.out.println("Invalid input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on time, no fine appplicable");
        }
        else if(daysKept <= 12)
        {
            System.out.println("Fine applicable because you kept book more than 8 days");

            Fine = (daysKept - 7) * 5;

            System.out.println("Total fine : "+Fine);
        }
        else
        {
            System.out.println("Fine applicable because you kept book more than 12 days");

            Fine = 25 + ((daysKept - 12) * 10);

            System.out.println("Total fine : "+Fine);
        }

        sobj.close();

    }

}