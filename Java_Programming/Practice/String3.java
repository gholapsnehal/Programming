
class program711
{
    public static void main(String A[])
    {
        int i = 0;

        String Header = "india  is  my  country";

        String Arr[] = Header.split(" ");

        System.out.println(Header);
        System.out.println("Number of words are in Header : "+Arr.length);

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

    }
}    
