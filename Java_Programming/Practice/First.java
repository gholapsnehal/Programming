class First
{
    public static void main(String A[])
    {
        //System.out.println("Inside main");

        Arithmetic aobj = new Arithmetic(11,10);

        int Result = 0;

        Result = aobj.Addition();
        System.out.println("Addition is: "+Result); // + == concatenation

        Result = aobj.Substraction();
        System.out.println("Substraction is: "+Result);
    }
}

class Arithmetic
{
    public int No1, No2;   // characteristics 

    public Arithmetic()
    {
        this.No1 = 0;
        this.No2 = 0;
    }   

     public Arithmetic(int Value1, int Value2)
    {
        this.No1 = Value1;
        this.No2 = Value2;
    } 

    public int Addition()
    {
        int Ans = 0;
        Ans = this.No1 + this.No2;
        return Ans;
    }

     public int Substraction()
    {
        int Ans = 0;
        Ans = this.No1 - this.No2;
        return Ans;
    }
}

