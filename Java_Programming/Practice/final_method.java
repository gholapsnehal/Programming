class Demo
{
   public void fun()
   {
    System.out.println("Inside Demo fun");
   }

    public final void gun()
   {
    System.out.println("Inside Demo gun");
   }

}

class Hello extends Demo
{
    public void gun()
    {
        System.out.println("Inside Hellow gun");
    }
}

class final_method
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();    
     
    }
}