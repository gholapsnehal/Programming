#include<iostream>
using namespace std;

class Arithmetic
{
    public:
        float No1;
        float No2;

        Arithmetic(float A, float B)      // parameterized constructor
        {
            this->No1 = A;
            this->No2 = B;
        }

        float Addition()
        {
            float Ans;
            Ans = No1 + No2;
            return Ans;
        }

         float Substraction()
        {
            float Ans;
            Ans = No1 - No2;
            return Ans;
        }
};

int main()
{

    Arithmetic aobj(11.5f,10.3f);                // static object

    cout<<aobj.Addition()<<"\n";           // addition call   
    cout<<aobj.Substraction()<<"\n";       // substraction call   

    return 0;
}