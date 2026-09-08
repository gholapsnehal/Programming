
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
       return "Name: "+this.name+" Age: "+this.age+" Marks: "+this.marks;
    }
}

class ToStringDemoStudentX
{
    public static void main(String A[])
    {
        Student sobj = new Student("Amit",27,98);
  
        System.out.println(sobj);      
    }

}

// output: 
// Name: Amit Age: 27 Marks: 98