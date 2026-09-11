
class demo
{
    public int i, j;

    public demo fun()
    {
        return this;
    }

    public int gun()
    {
        return 11;
    }
}

public class program988
{
    public static void main(String A[])
    {
        demo dobj = new demo();

        // to uderstand concept of return this
        int ret = dobj.fun().gun();
                // dobj.gun();

        System.out.println(ret);

    }
    
}
