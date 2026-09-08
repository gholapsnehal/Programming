interface Circle
{
    // characteristics
    float PI = 3.14f;      // by default public static final
}

class DemoInterface
{
    public static void main(String A[])
    {
        System.out.println(Circle.PI);
        Circle.PI = 7.12f;            // Error due to final
    }
}