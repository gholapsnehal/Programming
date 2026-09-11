
class demo
{
    public int i, j;

    public demo fun()
    {
        this.i = 11;
        return this;
    }

    public int gun()
    {
        return this.i;
    }
}

public class program989
{
    public static void main(String A[])
    {
        demo dobj = new demo();

        int ret = dobj.fun().gun();
        
        System.out.println(ret);

    }
    
}
