#include<iostream>
using namespace std;

class Arithmetic
{
    public:
        int No1;
        int No2;

        Arithmetic(int A, int B)      // parameterized constructor
        {
            this->No1 = A;
            this->No2 = B;
        }

        int Addition()
        {
            int Ans;
            Ans = No1 + No2;
            return Ans;
        }

         int Substraction()
        {
            int Ans;
            Ans = No1 - No2;
            return Ans;
        }
};

int main()
{

    Arithmetic aobj(11,10);                // static object

    cout<<aobj.Addition()<<"\n";           // addition call   21
    cout<<aobj.Substraction()<<"\n";       // substraction call   1

    return 0;
}