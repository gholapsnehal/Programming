///////////////////////////////////////////////////////////////////////////////
//
// Function name:   findMax
// Input:           Number
// Output:          void
// Description:     Program to find the maximum of two numbers.
// Date:            08/06/2026
// Author:          Snehal Gholap
/////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
        {
            System.out.println(a +" is maximum");
        }
        else
        {
            System.out.println(b +" is maximum");
        }
    }

}

class Question03
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();

        lobj.findMax(20,15);
   
    }
}