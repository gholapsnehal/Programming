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
    void checkDivisible(int iNumber)
    {
        if((iNumber % 5) == 0 && (iNumber % 11 == 0))
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}

class Question13
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.checkDivisible(55);
    }
}