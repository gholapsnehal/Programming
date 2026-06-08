///////////////////////////////////////////////////////////////////////////////
//
// Function name:   findMinimum
// Input:           Number
// Output:          int
// Description:     Program to find the minimum of two numbers.
// Date:            09/06/2026
// Author:          Snehal Gholap
/////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findMinimum(int a, int b, int c)
    {
        if(a <= b && a<= c) 
        {
            System.out.println(a +" is minimum");
        }
        else if(b <= a && b <= c) 
        {
            System.out.println(b +" is minimum");
        }
        else 
        {
            System.out.println(c +" is minimum");
        }
    }
}

class Question04
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.findMinimum(3,7,2);

    }
}