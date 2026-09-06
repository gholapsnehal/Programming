class Marvellous
{
    public int i,j,k;

    public Marvellous(int A, int B, int C)
    {
        this.i = A;
        this.j = B;
        this.k = C;
    }

}

class EqualsDemo
{
    public static void main(String A[])
    {
        Marvellous mobj1 = new Marvellous(11,21,51);

        Marvellous mobj2 = new Marvellous(11,21,51);


        if(mobj1.equals(mobj2))
        {
            System.out.println("Objects are identical");
        }
        else
        {
            System.out.println("Objects are different");
        }      
    }

}

// output: Objects are different