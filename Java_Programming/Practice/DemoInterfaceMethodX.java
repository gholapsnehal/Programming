interface Circle
{
    // characteristics(by default public static final)
    float PI = 3.14f;      

    // Behaviors(by deafult public abstract)

    float Area(float radius);       // prototype  

    float Circumference(float radius);
}

class Marvellous implements Circle
{
    public float Area(float radius)
    {
         return Circle.PI * radius * radius;
    }

    public float Circumference(float radius)
    {
         return 2 * Circle.PI * radius;
    }


}

class DemoInterfaceMethodX
{
    public static void main(String A[])
    {
       
       //Circle cobj = new Circle();   //  not allowed---> error: Circle is abstract; cannot be instantiated

       Marvellous mobj = new Marvellous(); 

       float Ret = 0.0f;

       Ret = mobj.Area(10.5f);
       System.out.println("Area is : "+Ret);

       Ret = mobj.Circumference(10.5f);
       System.out.println("Circumference is : "+Ret);
    }
}

