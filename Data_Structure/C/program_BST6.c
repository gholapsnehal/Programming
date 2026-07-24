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
// Function Name : Inorder
// Input         : Pointer to NODE
// Output        : None
// Description   : Display elements of Binary Search Tree using Inorder
//                 traversal (Left, Data, Right).
// Date          : 24/07/2026
// Author        : Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////////////////

// L  D  R

void Inorder(PNODE first)
{
    if(first != NULL)
    {
        Inorder(first->lchild);

        printf("%d\n", first->data);

        Inorder(first->rchild);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Preorder
// Input         : Pointer to NODE
// Output        : None
// Description   : Display elements of Binary Search Tree using Preorder
//                 traversal (Data, Left, Right).
// Date          : 24/07/2026
// Author        : Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////////////////

// D  L  R

void Preorder(PNODE first)
{
    if(first != NULL)
    {
        printf("%d\n", first->data);

        Preorder(first->lchild);

        Preorder(first->rchild);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Postorder
// Input         : Pointer to NODE
// Output        : None
// Description   : Display elements of Binary Search Tree using Postorder
//                 traversal (Left, Right, Data).
// Date          : 24/07/2026
// Author        : Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////////////////

// L  R  D

void Postorder(PNODE first)
{
    if(first != NULL)
    {
        Postorder(first->lchild);

        Postorder(first->rchild);

        printf("%d\n", first->data);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function Name : Count
// Input         : Pointer to NODE
// Output        : Integer
// Description   : Count and return the total number of nodes present in
//                 Binary Search Tree.
// Date          : 24/07/2026
// Author        : Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////////////////

int Count(PNODE first)
{
    static int iCount = 0;

    if(first != NULL)
    {
        iCount++;

        Count(first->lchild);

        Count(first->rchild);
    }

    return iCount;
}

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
// Description   : Create Binary Search Tree, insert elements, display
//                 traversals and count total number of nodes.
// Date          : 24/07/2026
// Author        : Snehal Gholap
//
///////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    PNODE Head = NULL;
    int iRet = 0;

    Insert(&Head, 11);
    Insert(&Head, 5);
    Insert(&Head, 17);

    printf("Inorder Display : \n");
    Inorder(Head);

    printf("Preorder Display : \n");
    Preorder(Head);

    printf("Postorder Display : \n");
    Postorder(Head);

    iRet = Count(Head);
    printf("Number of nodes in BST : %d\n", iRet);

    return 0;
}