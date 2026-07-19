////////////////////////////////////////////////////////////////////////////
//
//     Included headerfile
//
////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>   // for malloc and free

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

//////////////////////////////////////////////////////////////////////////
//
//  Function Name : Display
//  Description   : Display all elements of linked list using recursion
//  Input         : PNODE
//  Output        : void
//  Author        : Snehal Gholap
//  Date          : 19/07/2026
//
//////////////////////////////////////////////////////////////////////////

void Display(PNODE first)       // PNODE first = head
{
    if(first != NULL)
    {
        printf("|%d| --> ",first->data);
        first = first->next;

        Display(first);                  // Recursive call 
    }
   
}

///////////////////////////////////////////////////////////////////////
//
//  Function Name : Count
//  Description   : Count the number of nodes in linked list
//  Input         : PNODE
//  Output        : int
//  Author        : Snehal Gholap
//  Date          : 19/07/2026
//
/////////////////////////////////////////////////////////////////////////

int Count(PNODE first)
{
    int iCount = 0;

    while(first != NULL)
    {
        iCount++;
        first = first->next;
    }
    
    return iCount;
}

/////////////////////////////////////////////////////////////////////////
//
//  Function Name : InsertFirst
//  Description   : Insert a new node at first position
//  Input         : PPNODE, int
//  Output        : void
//  Author        : Snehal Gholap
//  Date          : 19/07/2026
//
/////////////////////////////////////////////////////////////////////////

void InsertFirst(PPNODE first, int iNo)       // (&head,value)
{
    PNODE newn = NULL;          // newn = newnode

    newn = (PNODE)malloc(sizeof(NODE));      // newn means node created

    newn->data = iNo;
    newn->next = NULL;

    if(*first == NULL)              // linked list is empty
    {
        *first = newn;              // *first = head = newn  

    }
    else                           // LL contains atleast one node
    {
        newn->next = *first;     
        *first = newn;
         
    }

}

/////////////////////////////////////////////////////////////////////////////
//
//    Entrypoint function
//
/////////////////////////////////////////////////////////////////////////////

int main()
{
    PNODE head = NULL;        // head - main pointer holds address of first node should not change
    int iRet = 0;             // to store count return value

    InsertFirst(&head,101);
    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);          // first node data

    Display(head);
    iRet = Count(head);

    printf("Number of nodes are : %d\n",iRet);


    return 0;
}