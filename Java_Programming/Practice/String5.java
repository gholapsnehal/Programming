// Q. accept string from user and count words in that string

import java.util.*;

class StringX
{
    int CountWords(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        return Tokens.length;  

    }

}


class program713
{
    public static void main(String A[])
    {
        StringX strobj = new StringX();

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        iRet = strobj.CountWords(str);

        System.out.println("Number of words are : "+iRet);

        sobj.close();
    }
}    
