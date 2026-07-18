// MENU DRIVEN: SINGLY LINEAR LINKED LIST

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
class SinglyLL
{
    private:
       
        struct node<T> *first;                   
        int iCount;                   
        
    public: 
        SinglyLL();
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
SinglyLL<T> :: SinglyLL()
{
    this->first = NULL;
    this->iCount = 0;
}

template<class T>
void SinglyLL<T> :: Display()

{
    struct node<T> *temp = NULL;

    temp = this->first;

    while(temp != NULL)
    {
        cout<<"| "<<temp->data<<" | - > ";
        temp = temp->next;
    }

    cout<<"NULL"<<endl;
}

template<class T>
int SinglyLL<T> :: Count()
{
    return this->iCount;
}

template<class T>
void SinglyLL<T> :: InsertFirst(T iNo)
{
    struct node<T> *newn = NULL;

    newn = new struct node<T>();                   

    newn->data = iNo;
    newn->next = NULL;

    if(this->first == NULL)
    {
        this->first = newn;

    }
    else
    {
        newn->next = this->first;
        this->first = newn;
    }

    this->iCount++;           

}

template<class T>
void SinglyLL<T> :: InsertLast(T iNo)
{
    struct node<T> *newn = NULL;
    struct node<T> *temp = NULL;

    newn = new struct node<T>;  
    //newn = new struct node<T>();
    //newn = new node<T>;                

    newn->data = iNo;
    newn->next = NULL;

    if(this->first == NULL)
    {
        this->first = newn;

    }
    else
    {
        temp = this->first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;

    }

    this->iCount++;         

}

template<class T>
void SinglyLL<T> :: InsertAtPos(T iNo, int iPos)
{
    struct node<T> *newn = NULL;
    struct node<T> *temp = NULL;

    int i = 0;

    // Input Filter
    if((iPos < 1) || (iPos > iCount + 1))
    {
        cout<<"Invalid position"<<endl;
        return;
    }

    if(iPos == 1)
    {
        this->InsertFirst(iNo);
    }

    else if(iPos == iCount + 1)
    {
        this->InsertLast(iNo);
    }

    else
    {
        newn = new struct node<T>;

        newn->data = iNo;
        newn->next = NULL;

        temp = this->first;

        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;

        }

        newn->next = temp->next;
        temp->next = newn;

        this->iCount++;

    }
} 

template<class T>
void SinglyLL<T> :: DeleteFirst()
{
    struct node<T> *temp = NULL;

    if(this->first == NULL)
    {
        return;
    }

    else if(this->first->next == NULL)      
    {
        delete(this->first);
        this->first = NULL;
    }

    else
    {
        temp = this->first;

        this->first = this->first->next;

        delete(temp);

    }

    this->iCount--;

}

template<class T>
void SinglyLL<T> :: DeleteLast()
{
    struct node<T> *temp = NULL;
  
    if(this->first == NULL)
    {
        return;
    }

    else if(this->first->next == NULL)     
    {
        delete(this->first);
        this->first = NULL;
    }

    else
    {
        temp = this->first;

        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }

        delete temp->next;
        temp->next = NULL;

    }

    this->iCount--;

}   

template<class T>
void SinglyLL<T> :: DeleteAtPos(int iPos)
{
    struct node<T> *temp = NULL;
    struct node<T> *target = NULL;

    int i = 0;

    // Input Filter
    if((iPos < 1) || (iPos > iCount))
    {
        cout<<"Invalid position"<<endl;
        return;
    }

    if(iPos == 1)
    {
        this->DeleteFirst();
    }

    else if(iPos == iCount)
    {
        this->DeleteLast();
    }

    else
    {
        temp = this->first;

        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        target = temp->next;    

        temp->next = target->next;
        delete target;


        this->iCount--;
    }

}

int main()
{
    SinglyLL <int> sobj;

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
        cout<<"6 : delete node at given position : \n";
        cout<<"7 : Display elements: \n";
        cout<<"8 : Count number of elements: \n";
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
                
                cout<<"Elements of linked list are : \n";
                sobj.Display();
                break;

            case 8: 
                
                iRet = sobj.Count();
                cout<<"Number of elements are : "<<iRet<<endl;
                break;

            case 9: 
                
                cout<<"Thank you for using Singly Linear Linked List Application\n";
                break;

            default:

                cout<<"Invalid choice\n";
                break;
            
        }
    }
  
    return 0;
}