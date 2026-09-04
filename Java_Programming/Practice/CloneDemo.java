
class Student implements Cloneable
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

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();  // Obect class method clone
    }
}

class CloneDemo
{
    public static void main(String A[]) throws Exception
    {
        Student sobj = new Student("Amit",27,98);

        Student sobjX = (Student)sobj.clone();
  
        System.out.println(sobj);  
        System.out.println(sobjX);   
        
        System.out.println(sobj.hashCode());
        System.out.println(sobjX.hashCode());
    }

}

// output: 