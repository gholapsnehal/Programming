/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   Search
// Input:           address,number
// Output:          bool
// Description:     Consider singly linear linked list to check whether number is present or not
// Date :           08/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#pragma pack(1)

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

bool Search(PNODE first, int No)
{
    while(first != NULL)
    {
        if(first->data == No)
        {
            return true;
        }

        first = first->next;
    }

    return false;

}

void Display(PNODE first)
{
    while(first != NULL)
    {    
        printf("| %d | - >",first->data);
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

void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(NULL == *first)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;   
    }

}

void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(NULL == *first)
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(temp->next != NULL)
        {
            temp = temp ->next;
        }

        temp->next = newn;
               
    }

}

void InsertAtPos(PPNODE first, int iNo, int iPos)
{
    PNODE temp = NULL;
    PNODE newn = NULL;

    int i = 0;
    int size = 0;

    size = Count(*first);

    // INPUT FILTER
    if(iPos < 1 || iPos > size + 1) 
    {
        printf("Invalid Position\n");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,iNo);
    }
    else if(iPos == size +1)
    {
        InsertLast(first,iNo);
    }
    else
    {
       
        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = iNo;
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
            temp = temp->next;
        }

        free(temp->next);
        temp->next = NULL;
      
    }
}

void DeleteAtPos(PPNODE first, int iPos)
{
    
    PNODE temp = NULL;
    PNODE target = NULL;

    int i = 0;
    int size = 0;

    size = Count(*first);

    // INPUT FILTER
    if(iPos < 1 || iPos > size) 
    {
        printf("Invalid Position\n");
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst(first);
    }
    else if(iPos == size)
    {
        DeleteLast(first);
    }
    else
    {
        temp = *first;

        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        target = temp->next;

        temp->next = target->next;
        free(target);

    }

}

int main()
{
    PNODE head = NULL;
    int iRet = 0;
    bool bRet = false;
    
    InsertFirst(&head,121);
    InsertFirst(&head,111);
    InsertFirst(&head,101);
    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    printf("Linked List After InsertFirst call: \n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes are :%d\n",iRet);
    printf("\n");

    InsertLast(&head,151);

    printf("Linked List After InsertLast call: \n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes are :%d\n",iRet);
    printf("\n");

    InsertAtPos(&head,104,4);

    printf("Linked List After InsertAtPos call: \n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes are :%d\n",iRet);
    printf("\n");

    DeleteFirst(&head);

    printf("Linked List After DeleteFirst call: \n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes are :%d\n",iRet);
    printf("\n");

    DeleteLast(&head);

    printf("Linked List After DeletetLast call: \n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes are :%d\n",iRet);
    printf("\n");

    DeleteAtPos(&head,4);

    printf("Linked List After DeleteAtPos call: \n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes are :%d\n",iRet);
    printf("\n");

    printf("Linked List after Search Function: \n");
    bRet = Search(head,51);

    if(bRet == true)
    {
        printf("51 is present\n");
    }
    else
    {
        printf("51 is not present");
    }

    return 0;

}

