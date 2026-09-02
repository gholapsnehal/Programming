///////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Assignment 64 : Question 5
//  Description   : 1. Creates a custom Student class containing Name and Marks.
//                  2. Implements the Comparable interface in Student class to define sorting logic:
//                     - Primary condition  : Sort students by Marks in descending order.
//                     - Secondary condition: If marks are equal, sort names alphabetically in ascending order.
//                  3. Accepts student details from user into an ArrayList.
//                  4. Uses Collections.sort() to sort student objects based on specified logic.
//                  5. Displays the sorted student list.
//
//  Input         : Student list (Name and Marks):
//                  Amit 78
//                  Pooja 92
//                  Rahul 85
//                  Neha 92
//                  Kiran 67
//
//  Output        : Sorted student list (Descending marks, tie-breaker alphabetical):
//                  Neha  92
//                  Pooja 92
//                  Rahul 85
//                  Amit  78
//                  Kiran 67
//
//  Author        : Snehal Gholap
//  Date          : 02/09/2026
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>
{
    public String strName;
    public int iMarks;

    public Student(String strName, int iMarks)
    {
        this.strName = strName;
        this.iMarks = iMarks;
    }

    @Override
    public int compareTo(Student obj)
    {
        // Primary sorting: Marks in descending order
        if(this.iMarks != obj.iMarks)
        {
            return obj.iMarks - this.iMarks;
        }
        else
        {
            // Secondary sorting: Name in ascending alphabetical order
            return this.strName.compareTo(obj.strName);
        }
    }
}

class StudentTracker
{
    public void DisplaySortedStudents(List<Student> list)
    {
        if(list == null || list.isEmpty())
        {
            return;
        }

        // Sort list based on compareTo method logic
        Collections.sort(list);

        // Print sorted students
        for(Student sobj : list)
        {
            System.out.println(sobj.strName + "\t" + sobj.iMarks);
        }
    }
}

class Question116
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter number of students :");
        iSize = sobj.nextInt();

        if(iSize <= 0)
        {
            System.out.println("Invalid number of students");
            return;
        }

        List<Student> studentList = new ArrayList<>();

        System.out.println("Enter Student Name and Marks :");
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            String strName = sobj.next();
            int iMarks = sobj.nextInt();

            studentList.add(new Student(strName, iMarks));
        }

        System.out.println();

        StudentTracker stobj = new StudentTracker();
        stobj.DisplaySortedStudents(studentList);

        sobj.close();
    }
}