
// anonymous

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

public class program993
{
    public static void main(String A[])
    {
        new demo()
        .setI(11)
        .setJ(21)
        .display();

    }
    
}
