using namespace std;
#include<iostream>


class Demo
    {
        public:
            int i;
            float f;
    };

int main()
{
    Demo dobj;

    cout<<sizeof(dobj)<<"\n";   // 8 byte


    return 0;
}