
class Student
{
    public String name;
    public int age;
    public int marks;

    Student(String A, int B, int C)
    {
        this.name = A;
        this.age = B;
        this.marks = C;
    }

    public String toString()
    {
       return "Marvellous";
    }
}

class ToStringDemoStudent
{
    public static void main(String A[])
    {
        Student sobj = new Student("Amit",27,98);

        // when you print sobj object, it will call toString() automatically
        System.out.println(sobj);      
    }

}

// output: 