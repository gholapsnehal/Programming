#include<stdio.h>
#include<stdlib.h>   

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void Display(PNODE first)    
{
    while(first != NULL)       
    {
        printf("| %d | --> ",first->data);
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
         
    }

}

void InsertAtPos(PPNODE first, int iNo, int iPos)     
{
    PNODE newn = NULL;
    PNODE temp = NULL;
    int i = 0;

    int iCount = 0;

    iCount = Count(*first);                           

    // INPUT FILTER
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
        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = iNo;
        newn->next = NULL;

        temp = *first;

        for(i = 1; i < iPos - 1; i++)
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
    else if ((*first)->next == NULL)
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
    int iCount = 0;
    int i = 0;

    PNODE temp = NULL;
    PNODE target = NULL;

    iCount = Count(*first);                           

    // INPUT FILTER
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

        for(i = 1; i < iPos - 1; i++)
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

            printf("Thank you for using Singly Linear Linked List Application\n");
            break;
        
        default:
            printf("Invalid choice\n");
            break;
        }
    }
   
    return 0;
}