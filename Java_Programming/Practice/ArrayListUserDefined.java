// Program is used to demonstrate ArrayList with user defined class

import java.lang.*;
import java.io.*;
import java.util.*;

class Student
{
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class ArrayListUserDefined
{
    public static void main(String args[])
    {
        // Creating user-defined class objects
        Student s1 = new Student(101, "A", 23);
        Student s2 = new Student(102, "B", 21);
        Student s3 = new Student(103, "C", 25);

        // Creating ArrayList
        ArrayList<Student> al = new ArrayList<Student>();

        // Adding Student class objects
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator<Student> itr = al.iterator();

        // Traversing elements of ArrayList
        while(itr.hasNext())
        {
            Student st = itr.next();

            if(st.age >= 20)
            {
                System.out.println(st.rollno + " " +
                                   st.name + " " +
                                   st.age);
            }
        }
    }
}