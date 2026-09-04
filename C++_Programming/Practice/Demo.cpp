#include<iostream>
using namespace std;

class Maximum
{
    public:
    int a,b;

    void getData()
    {
        cout<<"Enter two numbers:\n";
        cin>>a>>b;
    }

    void findMax()
    {
        if(a>b)
        {
            cout<<"Maximum number is:"<<a;
        }
        else{
            cout<<"Maximum number is:"<<b;
        }
    }
};

int main()
{
    Maximum obj;
    obj.getData();
    obj.findMax();

    return 0;
}

