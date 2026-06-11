////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   checkLeapYear
// Input:           Number
// Output:          void
// Description:     Write a program to check whether a given year is leap year or not
// Date:            11/06/2026
// Author:          Snehal Gholap
//
/////////////////////////////////////////////////////////////////////////////////////// 

class Logic
{
    void checkLeapYear(int iYear)
    {
        if(iYear % 400 == 0)
        {
            System.out.println("Leap Year");
        }
        else if(iYear % 100 == 0)
        {
            System.out.println("Not Leap Year");
        }
        else if(iYear % 4 == 0)
        {
            System.out.println("Leap Year");
        }
        else 
        {
            System.out.println("Not Leap Year");
        }
    }
}

class Question11
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.checkLeapYear(2027);      

    }
}