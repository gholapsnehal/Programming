#include<iostream>
using namespace std;

class Demo
{
    public:
       int i;     // non static
       int j;     // non static
       static int k;    // static


};

int main()
{
    Demo dobj;
    cout<<sizeof(dobj);   // 8 byte(summtion of non static )


    return 0;
}