
class Marvellous
{
    public Marvellous()
    {
        System.out.println("Inside constructor");

    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");

    }

}

class finalizeDemo
{
    public static void main(String A[])
    {
        // object creation of class

        Marvellous mobj = new Marvellous();
        

        mobj = null;

        System.gc();

        System.out.println("End of main");    

    }

}

