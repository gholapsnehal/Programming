#include<stdio.h>
#include<stdlib.h>

// structure defination

struct Node
{
    int data;
    struct Node * next;
};

typedef struct Node NODE;
typedef struct Node * PNODE;
typedef struct Node ** PPNODE;

///////////////////////////////////////////////////////////////////////////////
//
// Function name:   InsertFirst
// Description:     used to insert at first position of linked list
// Parameters:      address of first pointer & data of node
// Return Value:    void
//
///////////////////////////////////////////////////////////////////////////////

void InsertFirst(PPNODE Head, int no)
{
    PNODE newn = NULL;
    newn = (PNODE) malloc (sizeof(NODE));   // allocate memory
    newn-> data = no;   // initialize data
    newn-> next = NULL;   // initialize pointer

    if(* Head == NULL)   // Linkedlist is empty
    {
        *Head = newn;
    }
    else                // LL contains atleast one node
    {
        newn-> next = *Head;
        *Head = newn;
    }
}


///////////////////////////////////////////////////////////////////////////////
//
// Function name:   InsertLast
// Description:     used to insert at last position of linked list
// Parameters:      address of first pointer & data of node
// Return Value:    void
//
///////////////////////////////////////////////////////////////////////////////

void InsertLast(PPNODE Head, int no)
{
    PNODE newn = NULL;
    PNODE temp = *Head;

    newn = (PNODE)malloc(sizeof(NODE));         // allocate memory
    newn-> data = no;       // initialize data
    newn-> next = NULL;     // initialize pointer

    if(*Head == NULL)          //linkedlist is empty
    {
        *Head = newn;
    }
    else   // LL contains atleast one node
    {
        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        temp -> next = newn;
    }
}


///////////////////////////////////////////////////////////////////////////////
//
// Function name:   Display
// Description:     used to display elements of linked list
// Parameters:      first pointer
// Return Value:    void
//
///////////////////////////////////////////////////////////////////////////////

void Display(PNODE Head)
{
    while(Head != NULL)
    {
        printf("%d\t",Head->data);
        Head = Head -> next;
    }
}


///////////////////////////////////////////////////////////////////////////////
//
// Function name:   Count
// Description:     used to count elements of linked list
// Parameters:      first pointer
// Return Value:    int
//
///////////////////////////////////////////////////////////////////////////////

int Count(PNODE Head)
{
    int iCnt = 0;

    while(Head != NULL)
    {
        iCnt++;

        Head = Head->next;
    }

    return iCnt;
}

int main()
{
    int iRet = 0;

    PNODE First = NULL;

    InsertFirst(&First, 51);
    InsertFirst(&First, 21);
    InsertFirst(&First, 11);

    Display(First);

    iRet = Count(First);

    printf("\nNumber of elements are : %d\n",iRet);

    InsertLast(&First, 101);
    InsertLast(&First, 111);

    Display(First);


    return 0;
}