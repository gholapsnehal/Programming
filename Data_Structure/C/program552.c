//if(*first = NULL) = should not be in if() otherwise all LL will lost : WRONG

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


// CHECKNEED
void Display(PNODE first)       // PNODE first = head
{
    if(first != NULL)
    {
        printf("|%d| --> ",first->data);
        Display(first->next);          // Recursive call    
                             
    }    
   
}

int Count(PNODE first)
{
    static int iCount = 0;

    if(first != NULL)
    {
        iCount++;
        first = first->next;

        Count(first);           // Recursive call : tail R
    }
    
    return iCount;
}

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

    printf("\nNumber of nodes are : %d\n",iRet);


    return 0;
}