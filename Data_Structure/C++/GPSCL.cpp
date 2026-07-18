// Singly Circular Linked List

#include<iostream>
using namespace std;
  
#pragma pack(1)

template<class T>
struct node
{
    T data;
    struct node<T> *next;
};


#pragma pack(1)

template<class T>
class SinglyCL
{
    private:
        struct node<T> *first;
        struct node<T> *last;
        int iCount;

    public:
      // declaration of construtor
        SinglyCL();

        void Display();
        int Count();

        void InsertFirst(T iNo);
        void InsertLast(T iNo);
        void InsertAtPos(T iNo, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);

};

template<class T>
SinglyCL<T> :: SinglyCL()
{
    this->first = NULL;
    this->last = NULL;

    this->iCount = 0;
}

template<class T>
void SinglyCL<T> :: Display()
{
    struct node<T> *temp = NULL;

    // Input filter
    if(first == NULL && last == NULL)
    {
        return;
    }

    temp = first;

    do
    {
        cout<<"| "<<temp->data<<" | - > ";
        temp = temp->next;

    }while(last->next != temp);

    cout<<"\n";

}

template<class T>
int SinglyCL<T> :: Count()
{
    return this->iCount;
}

template<class T>
void SinglyCL<T> :: InsertFirst(T iNo)
{
    struct node<T> *newn = NULL;

    newn = new struct node<T>;    // newn = new node; bcz struct node already declared

    newn->data = iNo;
    newn->next = NULL;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        newn->next = first;
        first = newn;
        
    }

    last->next = first;        // IMP
    iCount++;                  // IMP

}

template<class T>
void SinglyCL<T> :: InsertLast(T iNo)
{
    struct node<T> *newn = NULL;

    newn = new struct node<T>;

    newn->data = iNo;
    newn->next = NULL;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        last->next = newn;
        last = newn;    
    }

    last->next = first;
    iCount++;
}

template<class T>
void SinglyCL<T> :: InsertAtPos(T iNo, int iPos)
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

        newn = new struct node<T>;

        newn->data = iNo;
        newn->next = NULL;

        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn;

        iCount++;
    }

}

template<class T>
void SinglyCL<T> :: DeleteFirst()   
{
    struct node<T> *temp = NULL;

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
        temp = first;

        first = first->next;

        delete temp;

        last->next = first;

    }

    iCount--;

}

template<class T>
void SinglyCL<T> :: DeleteLast()
{
    struct node<T> *temp = NULL;

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
        // traversal required
       temp = first;

       while(temp->next != last)
       {
        temp = temp->next;
       }

       delete last;
       last = temp;

       last->next = first;

    }

    iCount--;

}

template<class T>
void SinglyCL<T> :: DeleteAtPos(int iPos)
{
    struct node<T> *temp = NULL;
    struct node<T> *target = NULL;

    int i = 0;

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

        target = temp->next;

        temp->next = target->next;
        
        delete target;

        iCount--;
    }

}


int main()
{
    SinglyCL <int> sobj;

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
        cout<<"7 : Display elements: \n";
        cout<<"8 : Count elements : \n";
        cout<<"9 : Exit\n";
        cout<<"---------------------------------------\n";

        cin>>iChoice;             

        switch(iChoice)
        {
            case 1: 
                cout<<"Enter the value: \n";
                cin>>iValue;

                sobj.InsertFirst(iValue);
                break;

            case 2: 
                cout<<"Enter the value: \n";
                cin>>iValue;
                sobj.InsertLast(iValue);
                break;

            case 3: 
                cout<<"Enter the value: \n";
                cin>>iValue;
                cout<<"Enter position: \n";
                cin>>iPosition;
                sobj.InsertAtPos(iValue,iPosition);
                break;

            case 4: 
                
                sobj.DeleteFirst();
                break;

            case 5: 
                
                sobj.DeleteLast();
                break;

            case 6: 
                
                cout<<"Enter position: \n";
                cin>>iPosition;
                sobj.DeleteAtPos(iPosition);
                break;

            case 7: 
                
                cout<<"Elements of Singly Circular Linked List are : \n";
                sobj.Display();
                break;

            case 8: 
                
                iRet = sobj.Count();
                cout<<"Number of elements are : "<<iRet<<endl;
                break;

            case 9: 
                
                cout<<"Thank you for using Singly Circular Linked List Application\n";
                break;

            default:

                cout<<"Invalid choice\n";
                break;
            
        }
    }
  
    return 0;
}
