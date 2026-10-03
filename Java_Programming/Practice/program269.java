import java.util.*;

class StringX
{
    public void Display(String str)  // data from main will get stored in str in Display method
    {
        System.out.println("Received string is : "+str);

    }

}

class program269
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String data = null; // reference
        StringX strobj = new StringX();

        System.out.println("Enter String : ");
        data = sobj.nextLine();

        strobj.Display(data);

       
        sobj.close();
        
    }
    
}



