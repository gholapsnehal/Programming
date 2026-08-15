// Q. 
// hashmap in java



import java.util.*;

public class hashmap10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        // for Each loop 
        // in case of keyword is is for but execution is like for each loop
        // this is not controlled loop : drawback
        for(char ch : Arr)
        {
            System.out.println(ch);
        }

       

           
       sobj.close();  

    }
    
}
