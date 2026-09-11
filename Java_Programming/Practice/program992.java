
class demo
{
    public int i, j;

    public demo setI(int no)
    {
        this.i = no;
        return this;
    }

    public demo setJ(int no)
    {
        this.j = no;
        return this;
    }

    public void display()
    {
        System.out.println("i : "+i);
        System.out.println("j : "+j);
    }
  
}

public class program992
{
    public static void main(String A[])
    {
        demo dobj = new demo();

        dobj.
        setI(11)
        .setJ(21)
        .display();

    }
    
}
