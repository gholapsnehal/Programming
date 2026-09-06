
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

class finalizeDemoX
{
    public static void main(String A[])
    {
        // object creation of class

        Marvellous mobj = new Marvellous();
        Marvellous mobj2 = mobj;
        

        mobj = null;
        
        System.gc();

        System.out.println("End of main");    

    }

}

