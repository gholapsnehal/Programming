interface Circle
{
    // characteristics(by default public static final)
    float PI = 3.14f;      

    // Behaviors(by deafult public abstract)

    float Area(float radius);         

    float Circumference(float radius);
}

class Marvellous implements Circle
{
   // ERROR due to missing body of Area and Circumference 
}

class DemoInterfaceMethod
{
    public static void main(String A[])
    {
       Marvellous mobj = new Marvellous(); 
    }
}

/*
DemoInterfaceMethod.java:13: error: Marvellous is not abstract and does not override 
abstract method Circumference(float) in Circle

*/