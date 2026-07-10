//Menu Driven :  Doubly Linear Linked List

#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
    // It will get 20 byte 
    int data;
    struct node *next;
    struct node *previous;
};

typedef struct node NODE;
typedef struct node* PNODE;

class DoublyLL
{
    private:
       
        PNODE first;                   // 8 byte
        int iCount;                    // 4 byte
        
    public: 
        DoublyLL();
        void Display();        
        int Count();
        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);     
        void DeleteFirst();
        void DeleteLast();   
        void DeleteAtPos(int iPos);
      
};

// Constructor
DoublyLL :: DoublyLL()
{
    this->first = NULL;
    this->iCount = 0;
}

void DoublyLL :: Display()
{
    PNODE temp = this->first;

    cout<<"\nNULL <=> ";

    while(temp != NULL)
    {
        cout<<"| "<<temp->data<<"| <=> ";
        temp = temp->next;
    }

    cout<<"NULL\n";   

}

int DoublyLL :: Count()
{
    return this->iCount;
}

void DoublyLL :: InsertFirst(int iNo)
{
    PNODE newn = NULL;

    newn = new NODE;

    newn->data = iNo;
    newn->next = NULL;
    newn->previous = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else
    {
        newn->next = this->first;
        this->first->previous = newn;
        this->first = newn;       
    }

    this->iCount++;

}

void DoublyLL :: InsertLast(int iNo)
{
    PNODE temp = NULL;
    PNODE newn = NULL;

    newn = new NODE;

    newn->data = iNo;
    newn->next = NULL;
    newn->previous = NULL;

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
        newn->previous = temp;             
    }

    this->iCount++;

}

void DoublyLL :: InsertAtPos(int iNo, int iPos)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    int i = 0;

    // INPUT FILTER
    
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
        temp = this->first;

        newn = new NODE;

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

        this->iCount++;
    }
} 

void DoublyLL :: DeleteFirst()
{
    if(this->first == NULL)
    {
        return;
    }
    
    else if(this->first->next == NULL)
    {
        delete this->first;
        this->first = NULL;
    }

    else
    {
        this->first = this->first->next;
        delete this->first->previous;
        this->first->previous = NULL;
    }

    this->iCount--;

}

void DoublyLL :: DeleteLast()
{
    PNODE temp = NULL;
   
    if(this->first == NULL)
    {
        return;
    }
    
    else if(this->first->next == NULL)
    {
        delete this->first;
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

void DoublyLL :: DeleteAtPos(int iPos)
{
    PNODE temp = NULL;

    int i = 0;

    // INPUT FILTER
    
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

        temp->next = temp->next->next;

        delete temp->next->previous;

        temp->next->previous = temp;
        
        this->iCount--;

    }

}

int main()
{
    DoublyLL dobj;  

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
        cout<<"7 : Display elements in Doubly Linke List : \n";
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
                
                cout<<"Elements of Doubly Linked List are : \n";
                dobj.Display();
                break;

            case 8: 
                
                iRet = dobj.Count();
                cout<<"Number of elements are : "<<iRet<<endl;
                break;

            case 9: 
                
                cout<<"Thank you for using Doubly Linear Linked List Application\n";
                break;

            default:

                cout<<"Invalid choice\n";
                break;
            
        }
    }
  
    return 0;   
}