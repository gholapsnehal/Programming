using namespace std;
#include<iostream>


class Demo
    {
        public:
            int i;      // characteristics
            float f;    // characteristics

        void fun()     // Behavior
        {
            cout<<"Inside fun\n";
        }
    };

int main()
{
    Demo dobj;

    cout<<dobj.i<<"\n";
    dobj.fun(); 


    return 0;
}