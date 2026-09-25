#include<iostream>
using namespace std;

class Demo
{
    public:
        int i;
    private:
        int j;
    protected:
        int k;

    public:
        Demo()
        {
            i = 0;
            j = 0;
            k = 0;
        }

        void Display()
        {
            cout<<"Value of i :"<<i<<"\n";  // allowed
            cout<<"Value of j :"<<j<<"\n";  // allowed 
            cout<<"Value of k :"<<k<<"\n";  // allowed
        }

};

int main()
{
    Demo dobj;

    dobj.Display();

    cout<<"Value of i :"<<dobj.i<<"\n";   // allowed 
    cout<<"Value of j :"<<dobj.j<<"\n";   // not allowed 
    cout<<"Value of k :"<<dobj.k<<"\n";   // not allowed

    return 0;
}