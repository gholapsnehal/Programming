/////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name:   CountGreater
// Input:           address,number
// Output:          int
// Description:     Consider singly linear linked list and count number greater than given number
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

int CountGreater(PNODE first, int iNo)
{
    int iCount = 0;
    
    while(first != NULL)
    {
        if(first->data > iNo)
        {
            iCount++;
        }

        first = first->next;
    }

    return iCount;
    
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

    int iValue = 0;
    printf("Enter Number to check: ");
    scanf("%d",&iValue);

    iRet = CountGreater(head,iValue);
    printf("Count of elements greater than %d is: %d\n",iValue,iRet);

    return 0;

}

