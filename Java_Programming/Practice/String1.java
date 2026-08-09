// STRING CODE DIFF
// tokenization
// split() - > which is used for tokenization

// call : trim() -> replaceall(regex)->split()

class program709
{
    public static void main(String A[])
    {
        String Header = "india is my country";

        // space asel ki break karaycha
        String Arr[] = Header.split(" ");

        System.out.println(Header);
        System.out.println("Number of words are in Header : "+Arr.length);

    }
}    
