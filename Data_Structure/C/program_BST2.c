///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Header Files
//
///////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Structure Name : node
// Description    : Structure used to represent a node of Binary Search Tree
// Date           : 24/07/2026
// Author         : Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////////////////

#pragma pack(1)

struct node
{
    int data;
    struct node *lchild;
    struct node *rchild;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Insert
// Input         : Double Pointer to NODE, Integer
// Output        : None
// Description   : Insert a new node into Binary Search Tree
// Date          : 24/07/2026
// Author        : Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////////////////

void Insert(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->lchild = NULL;
    newn->rchild = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(1)
        {
            if(iNo > temp->data)
            {
                if(temp->rchild == NULL)
                {
                    temp->rchild = newn;
                    break;
                }

                temp = temp->rchild;
            }
            else if(iNo < temp->data)
            {
                if(temp->lchild == NULL)
                {
                    temp->lchild = newn;
                    break;
                }

                temp = temp->lchild;
            }
            else
            {
                printf("Unable to insert as element is duplicate\n");
                free(newn);
                break;
            }
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : main
// Input         : None
// Output        : Integer
// Description   : Create Binary Search Tree and insert elements into it
// Date          : 24/07/2026
// Author        : Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    PNODE Head = NULL;

    Insert(&Head, 11);
    Insert(&Head, 5);
    Insert(&Head, 17);

    return 0;
}