import java.util.*;



class ArrayListDemoIterate
{
    public static void main (String A[])
    {
        ArrayList <Float> aobj = new ArrayList <Float> ();

        aobj.add(90.67f);
        aobj.add(78.56f);
        aobj.add(89.99f);
        aobj.add(90.78f);

        Iterator iobj = aobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

    }
}