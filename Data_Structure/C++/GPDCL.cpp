// Doubly Circular Linked List
#include<iostream>
using namespace std;

#pragma pack(1)
template<class T>
struct node
{
    T data;
    struct node<T> *next;
    struct node<T> *previous;
};


#pragma pack(1)

template<class T>
class DoublyCL
{
    private:
        struct node<T> *first;
        struct node<T> *last;
        int iCount;

    public:

        DoublyCL();

        void Display();
        int Count();

        void InsertFirst(T iNo);
        void InsertLast(T iNo);
        void InsertAtPos(T iNo,int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

template<class T>
DoublyCL <T>:: DoublyCL()
{
    first = NULL;
    last = NULL;

    iCount = 0;
}

template<class T>
void DoublyCL<T> :: Display()
{
    if(first == NULL && last == NULL)
    {
        return;
    }

    struct node<T> *temp = first;

    cout<<" <=> ";

    do
    {
        cout<<"| "<<temp->data<<" | <=> ";
        temp = temp->next;

    }while(temp != last->next);

    cout<<"\n";
    
}

template<class T>
int DoublyCL<T> :: Count()
{
    return iCount;
}

template<class T>
void DoublyCL<T> :: InsertFirst(T iNo)
{
    struct node<T> *newn = NULL;

    newn = new node<T>;

    newn->data = iNo;
    newn->next = NULL;
    newn->previous = NULL;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }

    else
    {
        newn->next = first;
        first->previous = newn;
        first = newn;
    }

    last->next = first;
    first->previous = last;

    iCount++;  // IMP
}

template<class T>
void DoublyCL<T> :: InsertLast(T iNo)
{
    struct node<T> *newn = NULL;

    newn = new node<T>;

    newn->data = iNo;
    newn->next = NULL;
    newn->previous = NULL;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        last->next = newn;
        newn->previous = last;
        last = newn;
    }

    last->next = first;
    first->previous = last;

    iCount++;
}

template<class T>
void DoublyCL<T> :: InsertAtPos(T iNo,int iPos)
{
    struct node<T> *temp = NULL;
    struct node<T> *newn = NULL;
    int i = 0;

    // Input Filter
    if((iPos < 1) || (iPos > iCount + 1))
    {
        cout<<"Invalid position\n";
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(iNo);
    }

    else if(iPos == iCount + 1)
    {
        InsertLast(iNo);
    }

    else
    {
        temp = first;

        newn = new node<T>;

        newn->data = iNo;
        newn->next = NULL;
        newn->previous = NULL;

        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next->previous = newn;

        temp->next = newn;
        newn->previous = temp;

        iCount++;
    }

}

template<class T>
void DoublyCL<T> :: DeleteFirst()
{
    if(first == NULL && last == NULL)
    {
        return;
    }

    else if(first == last)
    {
        delete first;

        first = NULL;
        last = NULL;
    }
    else
    {
        first = first->next;
        delete first->previous;

        last->next = first;
        first->previous = last;
    }

    iCount--;
}

template<class T>
void DoublyCL<T> :: DeleteLast()
{
    if(first == NULL && last == NULL)
    {
        return;
    }
    else if(first == last)
    {
        delete first;

        first = NULL;
        last = NULL;
    }
    else
    {
        last = last->previous;
        delete last->next;

        last->next = first;
        first->previous = last;
    }

    iCount--;
}

template<class T>
void DoublyCL<T> :: DeleteAtPos(int iPos)
{
    struct node<T> *temp = NULL;
    int i = 0;

    // Input Filter
    if((iPos < 1) || (iPos > iCount))
    {
        cout<<"Invalid Position\n";
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst();
    }
    else if(iPos == iCount)
    {
        DeleteLast();        
    }
    else
    {
        temp = first;

        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        temp->next = temp->next->next;

        delete temp->next->previous;

        temp->next->previous = temp;

        iCount--;
    }
}

int main()
{
    DoublyCL <int> dobj;  

    int iChoice = 0;
    int iValue = 0;
    int iRet = 0;
    int iPosition = 0;

    while(iChoice != 9)                     
    {
        cout<<"---------------------------------------\n";
        cout<<"Enter your choice : \n";
        cout<<"---------------------------------------\n";

        cout<<"1 : Insert node at first position : \n";
        cout<<"2 : Insert node at last position : \n";
        cout<<"3 : Insert node at given position : \n";
        cout<<"4 : Delete node at first position : \n";
        cout<<"5 : Delete node at last position : \n";
        cout<<"6 : Delete node at given position : \n";
        cout<<"7 : Display elements in Doubly Circular Linked List : \n";
        cout<<"8 : Count number of elements : \n";
        cout<<"9 : Exit\n";
        cout<<"---------------------------------------\n";

        cin>>iChoice;              

        switch(iChoice)
        {
            case 1: 
                cout<<"Enter the value: \n";
                cin>>iValue;
                dobj.InsertFirst(iValue);
                break;

            case 2: 
                cout<<"Enter the value: \n";
                cin>>iValue;
                dobj.InsertLast(iValue);
                break;

            case 3: 
                cout<<"Enter the value: \n";
                cin>>iValue;
                cout<<"Enter position: \n";
                cin>>iPosition;
                dobj.InsertAtPos(iValue,iPosition);
                break;

            case 4: 
                
                dobj.DeleteFirst();
                break;

            case 5: 
                
                dobj.DeleteLast();
                break;

            case 6: 
                
                cout<<"Enter position: \n";
                cin>>iPosition;
                dobj.DeleteAtPos(iPosition);
                break;

            case 7: 
                
                cout<<"Elements of Doubly Circular Linked List are : \n";
                dobj.Display();
                break;

            case 8: 
                
                iRet = dobj.Count();
                cout<<"Number of elements are : "<<iRet<<endl;
                break;

            case 9: 
                
                cout<<"Thank you for using Doubly Circular Linked List Application\n";
                break;

            default:

                cout<<"Invalid choice\n";
                break;
            
        }
    }
  
    return 0;
}