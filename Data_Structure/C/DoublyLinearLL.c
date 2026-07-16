#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)
struct node
{
    // 20 bytes memory will allocate
    int data;
    struct node *next;     
    struct node *previous;                         
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

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

void Display(PNODE first)
{
    printf("\nNULL <=> ");

    while(first != NULL)
    {
        printf("| %d | <=> ",first->data);
        first = first->next;
    }

    printf("NULL\n");

}

void InsertFirst(PPNODE first, int iNo)
{
    PNODE newn = NULL;   
    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;
    newn->previous = NULL;                

    if(NULL == *first)                     
    {
        *first = newn;
    }
    else                                 
    {
        newn->next = *first;              
        (*first)->previous = newn;       
        *first = newn;                   
    }

}

void InsertLast(PPNODE first, int iNo)
{
    PNODE temp = NULL;   
    PNODE newn = NULL;  

    newn = (PNODE)malloc(sizeof(NODE));   

    newn->data = iNo;
    newn->next = NULL;
    newn->previous = NULL;              

    if(*first == NULL)                   
    {
        *first = newn;                   
    }
    else
    {     
        temp = *first;
        
        while(temp->next != NULL)
        {
            temp = temp->next;

        }

        temp->next = newn;
        newn->previous = temp;

    }

}

void InsertAtPos(PPNODE first, int iNo, int iPos)
{
    PNODE temp = NULL;              
    PNODE newn = NULL;              

    int iCount = 0;
    iCount = Count(*first);

    int i = 0;                


    if((iPos < 1) || (iPos > iCount + 1))
    {
        printf("Invalid position\n");
        return;
    }
    
    if(iPos == 1)
    {
        InsertFirst(first,iNo);
    }
    else if(iPos == iCount +1)
    {
        InsertLast(first,iNo);
    }

    else                             
    {
        temp = *first;

        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = iNo;
        newn->next = NULL;
        newn->previous = NULL;

        for(i = 1; i < iPos -1; i++)
        {
            temp = temp->next;
        }    
        
        newn->next = temp->next;
        temp->next->previous = newn;

        temp->next = newn;
        newn->previous = temp;

    }

}

void DeleteFirst(PPNODE first)
{
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
        *first = (*first)->next;
        free((*first)->previous);
        (*first)->previous = NULL;

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
   
    int iCount = 0;
    iCount = Count(*first);

    int i = 0;                               

    if((iPos < 1) || (iPos > iCount))        
    {
        printf("Invalid position\n");
        return;
    }
    
    if(iPos == 1)
    {
        DeleteFirst(first);
    }
    else if(iPos == iCount)
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
        
        temp->next = temp->next->next;

        free(temp->next->previous);     

        temp->next->previous = temp;    
        
    }
}
int main()
{
    PNODE head = NULL;
    int iRet = 0;
    
    int iChoice = 0;
    int iValue = 0;
    int iPosition = 0;

    while(iChoice != 9)
    {
        printf("-----------------------------------------\n");
        printf("Enter your choice : \n");
        printf("-----------------------------------------\n");

        printf("1 : Insert node at first position : \n");
        printf("2 : Insert node at last position : \n");
        printf("3 : Insert node at given position : \n");
        printf("4 : Delete node at first position : \n");
        printf("5 : Delete node at last position : \n");
        printf("6 : Delete node at given position : \n");
        printf("7 : Display elements in Linked List : \n");
        printf("8 : Number of nodes in Linked List : \n");
        printf("9 : Exit\n");
        printf("-----------------------------------------\n");

        scanf("%d",&iChoice);

        switch(iChoice)
        {
        case 1:
            printf("Enter the value : \n");
            scanf("%d",&iValue);
            InsertFirst(&head,iValue);
            break;

        case 2:
            printf("Enter the value : \n");
            scanf("%d",&iValue);
            InsertLast(&head,iValue);
            break;

        case 3:
            printf("Enter the value : \n");
            scanf("%d",&iValue);

            printf("Enter position : \n");
            scanf("%d",&iPosition);

            InsertAtPos(&head,iValue,iPosition);
            break;

        case 4:
            
            DeleteFirst(&head);
            break;

        case 5:
            
            DeleteLast(&head);
            break;

        case 6:

            printf("Enter position : \n");
            scanf("%d",&iPosition);
            
            DeleteAtPos(&head,iPosition);
            break;

        case 7:

            printf("Elements of Doubly Linked List are : \n");
            Display(head);
            break;

        case 8:

            iRet = Count(head);
            printf("Number of elements are : %d\n",iRet);  
            break;

        case 9:

            printf("Thank you for using Doubly Linear Linked List Application\n");
            break;
        
        default:
            printf("Invalid choice\n");
            break;
        }
    }

    return 0;
}
