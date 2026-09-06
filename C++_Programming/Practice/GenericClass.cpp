#include<iostream>
using namespace std;

// TEMPLATE CLASS OR GENERIC CLASS
template<class T>

class Arithmetic
{
    public:
        T No1;
        T No2;

        Arithmetic(T A, T B)     
        {
            this->No1 = A;
            this->No2 = B;
        }

        T Addition()
        {
            T Ans;
            Ans = No1 + No2;
            return Ans;
        }

         T Substraction()
        {
            T Ans;
            Ans = No1 - No2;
            return Ans;
        }
};

int main()
{

    Arithmetic aobj(11,10);                      // error

    cout<<aobj.Addition()<<"\n";           
    cout<<aobj.Substraction()<<"\n";       

    return 0;
}