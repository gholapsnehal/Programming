// STACK Complete Code : Generic Code

#include<iostream>
using namespace std;

#pragma pack(1)
template<class T>

struct node
{
    T data;
    struct node<T> *next;
};

template<class T>

class Stack
{
    private:
        struct node<T> *first;
        int iCount;

    public:
        Stack();
        void Push(T iNo);       // InsertFirst
        T Pop();                // DeleteFirst
        T Peep();               // DeleteFirst
        void Display();
        int Count();

};

template<class T>

Stack<T> :: Stack()
{
    first = NULL;
    iCount = 0;    
}

template<class T>
void Stack<T> :: Push(T iNo)
{
    struct node<T> *newn = NULL;

    newn = new struct node<T>();

    newn->data = iNo;
    newn->next = NULL;

    newn->next = first;
    first = newn;

    iCount++;
   

    /*
    if(first == NULL)
    {
        first = newn;

    }
    else
    {
        newn->next = first;
        first = newn;
    }*/

    //iCount++;

}   

template<class T>
T Stack<T> :: Pop()
{
    // cannot remove if else here

    T iValue = 0;

    struct node<T> *temp = NULL;

    if(first == NULL)
    {
        cout<<"Stack is empty"<<endl;
        return -1;
    }

    else
    {
        iValue = first->data;    // ivalue made 101 aala

        temp = first;

        first = first->next;
        delete temp;

         iCount--;

         return iValue;

    }    
   
}   

template<class T>
T Stack<T> :: Peep()
{
    
    // cannot remove if else here

    T iValue = 0;

    struct node<T> *temp = NULL;

    if(first == NULL)
    {
        cout<<"Stack is empty"<<endl;
        return -1;
    }

    else
    {
        iValue = first->data;    // ivalue made 101 aala

        //temp = first;

        //first = first->next;
        //delete temp;

        //iCount--;

        return iValue;

    }    
}  

template<class T>
void Stack<T> :: Display()
{
    struct node<T> *temp = NULL;

    temp = first;

    while(temp != NULL)
    {
        cout<<"| "<<temp->data<<" |\n";
        temp = temp->next;
    }

}

template<class T>
int Stack<T> :: Count()
{
    return iCount;
}

// main() function below
int main()
{
    Stack <int> sobj;
    int iRet = 0;

    sobj.Push(11);
    sobj.Push(21);
    sobj.Push(51);
    sobj.Push(101);

    sobj.Display();

    iRet = sobj.Count();
    cout<<"Elements of the Stack are  : "<<iRet<<endl;

    iRet = sobj.Pop();
    cout<<"Popped element is : "<<iRet<<endl;

    sobj.Display();

    iRet = sobj.Count();
    cout<<"Elements of the Stack are  : "<<iRet<<endl;

    iRet = sobj.Peep();
    cout<<"Peeped element is : "<<iRet<<endl;

    sobj.Display();

    iRet = sobj.Count();
    cout<<"Elements of the Stack are  : "<<iRet<<endl;
    

    return 0;
}