/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountOdd
// Input:           address
// Output:          int
// Description:     Consider singly linear linked list and count nodes containing odd value
// Date :           08/07/2026
// Author:          Snehal Gholap
// 
/////////////////////////////////////////////////////////////////////////////////////////////////

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

int CountOdd(PNODE first)
{
    int iOddCount = 0;

    while(first != NULL)
    {
        if((first->data) % 2 != 0)
        {
            iOddCount++;
        }
        first = first->next;
    }
    return iOddCount;

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

int main()
{
    PNODE head = NULL;
    int iRet = 0;
    
    InsertFirst(&head,151);
    InsertFirst(&head,111);
    InsertFirst(&head,121);
    InsertFirst(&head,33);
    InsertFirst(&head,40);
    InsertFirst(&head,20);

    printf("Linked List After InsertFirst call: \n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes are :%d\n",iRet);
    printf("\n");

    iRet = CountOdd(head);
    printf("Odd nodes in linked list : %d\n",iRet);

    return 0;

}

