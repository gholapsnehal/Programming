final class Demo
{
   public void fun()
   {
    System.out.println("Inside Demo fun");
   }

    public void gun()
   {
    System.out.println("Inside Demo gun");
   }

}

class Hello extends Demo     // ERROR
{
    public void gun()
    {
        System.out.println("Inside Hellow gun");
    }
}

class final_class
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();           // allowed
        Hello hobj = new Hello();    
      
    }
}