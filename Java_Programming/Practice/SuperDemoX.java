class Base
{
    public int i;
    

    public Base(int no)    // parameterized constructor
    {
        System.out.println("Inside Base constructor");

        this.i = no;   
    }

    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived extends Base
{
   public int i;
   
   public Derived()
   {
    super(11);   // Explicit call to Base Constructor

    System.out.println("Inside Derived constructor");

    this.i = 21;


   }

   public void gun()
   {
    System.out.println("Inside gun of Derived");

    System.out.println("Value of i from Derived: "+i);
    System.out.println("Value of i from Base: "+super.i);
    
   }
}

class SuperDemoX    
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        dobj.gun();
    }

}