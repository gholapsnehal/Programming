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

    Arithmetic <int> aobj1(11,10);                      

    cout<<aobj1.Addition()<<"\n";           
    cout<<aobj1.Substraction()<<"\n";   
    
    Arithmetic <double> aobj2(11.2345,10.1234);                      

    cout<<aobj2.Addition()<<"\n";           
    cout<<aobj2.Substraction()<<"\n";

    return 0;
}


// after compilation 2 copies will create one for integer and another one is for float