// STACK Complete Code

#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
};

class Stack
{
    private:
        struct node *first;
        int iCount;

    public:
        Stack();
        void Push(int iNo);       // InsertFirst
        int Pop();                // DeleteFirst
        int Peep();               // DeleteFirst
        void Display();
        int Count();

};

Stack :: Stack()
{
    first = NULL;
    iCount = 0;    
}

void Stack :: Push(int iNo)
{
    struct node *newn = NULL;

    newn = new node();

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

int Stack :: Pop()
{
    // cannot remove if else here

    int iValue = 0;

    struct node *temp = NULL;

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

int Stack :: Peep()
{
    
    // cannot remove if else here

    int iValue = 0;

    struct node *temp = NULL;

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

void Stack :: Display()
{
    struct node *temp = NULL;

    temp = first;

    while(temp != NULL)
    {
        cout<<"| "<<temp->data<<" |\n";
        temp = temp->next;
    }

}

int Stack :: Count()
{
    return iCount;
}

// main() function below
int main()
{
    Stack sobj;
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