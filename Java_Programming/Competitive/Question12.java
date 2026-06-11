////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   displayGrade
// Input:           Number
// Output:          void
// Description:     Write a program to display the grade of a student based on marks
// Date:            11/06/2026
// Author:          Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int iMarks)
    {
        if(iMarks >= 75)
        {
        System.out.println("Grade A");
        }
        else if(iMarks >= 60)
        {
        System.out.println("Grade B");
        }
        else if(iMarks >= 50)
        {
        System.out.println("Grade C");
        }
        else if(iMarks >= 35)
        {
        System.out.println("Grade D");
        }
        else
        {
        System.out.println("Fail");
        }
    }
}

class Question12
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.displayGrade(82);
    }
}