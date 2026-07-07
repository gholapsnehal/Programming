/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   LastOccur
// Input:           address,number
// Output:          int
// Description:     Consider singly linear linked list and return position of last occurrence
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

int LastOccur(PNODE first, int iNo)
{
   int iPos = 1;
   int iLast = -1;

   while(first != NULL)
   {
        if(first->data == iNo)
        {
            iLast = iPos;
        }

        first = first->next;
        iPos++;
   }

   return iLast;
    
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
    InsertFirst(&head,100);
    InsertFirst(&head,40);
    InsertFirst(&head,80);
    InsertFirst(&head,40);

    printf("Linked List After InsertFirst call: \n");
    Display(head);

    iRet = Count(head);
    printf("Number of nodes are :%d\n",iRet);
    printf("\n");

   
    iRet = LastOccur(head,40);
    printf("Last occurrence of element 40 : %d\n",iRet);

    return 0;

}

