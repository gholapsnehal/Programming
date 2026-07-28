#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
};  

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first->next;
    }

   printf("NULL\n");

}

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

void InsertFirst(PPNODE first, int No)
{
    PNODE newn = NULL;  // pointer created and set to NULL means 0

    // allocate size to newn
    newn = (PNODE)malloc(sizeof(NODE));  //node created

    newn->data = No;
    newn->next = NULL;

    // if linked list is empty
    if(*first == NULL)
    {
        *first = newn;   // *first and head he pointer ahet address hold krnar data nahi
    }
    // if LL is not empty and contains atleast one node then insert first location
    else
    {
        newn->next = *first;
        *first = newn;
    }

}

void InsertLast(PPNODE first, int No)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = No;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else  // last node chya nantr insert
    {
        temp = *first;

        while(temp->next != NULL)  
        {
            temp = temp->next;
        }

        temp->next = newn;
    }  

}
void InsertAtPos(PPNODE first, int No, int iPos)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    int i = 0;
    int size = 0;

    size = Count(*first);

    // INPUT FILTER
    if((iPos < 1) || (iPos > size+1))
    {
        printf("INVALID POSITION:\n");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,No);
    }
    else if(iPos == iPos+1)
    {
        InsertLast(first,No);
    }
    else
    {
        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = No;
        newn->next = NULL;

        temp = *first;

        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }
            newn->next = temp->next;
            temp->next = newn;
    }

}

void DeleteFirst(PPNODE first)
{
    PNODE temp = NULL;

    if(*first == NULL)
    {
        return;
    }
    else if((*first)->next == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else
    {
        temp = *first;

        *first = (*first)->next;
        free(temp);
    }

}

void DeleteLast(PPNODE first)
{
    PNODE temp = NULL;

    if(*first == NULL)
    {
        return;
    }
    else if((*first)->next == NULL)
    {
        free(*first);
        *first = NULL;
    }
    else
    {
        temp = *first;

        while(temp->next->next != NULL)
        {
            temp = temp -> next;
        }

        free(temp->next);
        temp->next = NULL;

    }
   
}

void DeleteAtPos(PPNODE first, int No, int pos)
{
    PNODE temp = NULL;   // for traversal while

    int i = 0;   // i for loop 
    int size = 0;   // to store node count

    size = Count(*first);   // size made count ala node cha

    // filter
    if((pos < 1) || (pos > size))
    {
        printf("invalid position:\n");
        return;
    }

    if(pos == 1)
    {
        DeleteFirst(first);
    }
    else if(pos == size)
    {
        DeleteLast(first);
    }
    else
    {
        temp = *first;

        for(i = 0; i < (pos - 1); i++)
        {
            temp = temp->next;
        }

        


    }
}


int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,101);
    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);
    InsertFirst(&head,7);

    printf("Linked List after insert first: \n");
    Display(head);

    iRet = Count(head);

    printf("Number of nodes are : %d\n",iRet);
    printf("\n");

    InsertLast(&head,111);
    InsertLast(&head,121);
    InsertLast(&head,151);
    InsertLast(&head,165);

    printf("Linked list after insert at last: \n");
    Display(head);

    iRet = Count(head);

    printf("Number of nodes are : %d\n",iRet);
    printf("\n");

    DeleteFirst(&head);

    printf("Linked list after deletion of first node: \n");
    Display(head);

    iRet = Count(head);

    printf("Number of nodes are : %d\n",iRet);
    printf("\n");

    DeleteLast(&head);

    printf("Linked list after deletion of last node : \n");
    Display(head);

    iRet = Count(head);

    printf("Number of nodes are : %d\n",iRet);
    printf("\n");

    InsertAtPos(&head,205,3);

    Display(head);

    iRet = Count(head);
    printf("Number of nodes are: %d\n",iRet);
    printf("\n");

    return 0;
}