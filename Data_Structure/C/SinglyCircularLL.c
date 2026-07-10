// Singly Circular LL

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

void Display(PNODE first, PNODE last)
{

    if(first == NULL && last == NULL)
    {
        return;
    }

    do
    {
        printf("| %d | - > ",first->data);
        first = first->next;

    } while(first != (last->next));

    printf("\n");
    
}    

int Count(PNODE first, PNODE last)
{
    int iCount = 0;

    if(first == NULL && last == NULL)
    {
        return iCount;
    }    

    do
    {
        iCount++;
        first = first->next;

    } while(first != (last->next));


    return iCount;

}

void InsertFirst(PPNODE first, PPNODE last, int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(*first == NULL && *last == NULL)
    {
        *first = newn;
        *last = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }

    (*last)->next = *first;          // important line in circular

}

void InsertLast(PPNODE first, PPNODE last, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(*first == NULL && *last == NULL)
    {
        *first = newn;
        *last = newn;
    }
    else
    {
       (*last)->next = newn;
       *last = (*last)->next;  
       //*last = newn        
    }
}

void InsertAtPos(PPNODE first, PPNODE last, int iNo, int iPos)
{
    PNODE temp = NULL;
    PNODE newn = NULL;

    int i = 0;
    int iCount = 0;

    iCount = Count(*first,*last);

    // Input Filter
    if((iPos < 1) || (iPos > iCount + 1))
    {
        printf("Invalid position\n");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(first,last,iNo);
    }

    else if(iPos == iCount + 1)
    {
        InsertLast(first,last,iNo);
    }

    else
    {
        temp = *first;

        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = iNo;
        newn->next = NULL;

        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn;

    }

}

void DeleteFirst(PPNODE first, PPNODE last)
{
    //PNODE temp = NULL;  

    if(*first == NULL & *last == NULL)
    {
        return;
    }

    else if(*first == *last)
    {
        free(*first);

        *first = NULL;
        *last = NULL;
    }

    else
    {
        //temp = *first;

        *first = (*first)->next;
        free((*last)->next);            // due to circular this can done
        
        (*last)->next = *first;      // IMP 
    }
}

void DeleteLast(PPNODE first, PPNODE last)
{
    PNODE temp = NULL;


    if(*first == NULL & *last == NULL)
    {
        return;
    }

    else if(*first == *last)
    {
        free(*first);

        *first = NULL;
        *last = NULL;
    }

    else
    {
        temp = *first;

        while(temp->next != *last)
        {
            temp = temp->next;
        }

        free(*last);             // free(temp->next);
        *last = temp;

        (*last)->next = *first;        
    }

}

void DeleteAtPos(PPNODE first, PPNODE last, int iPos)
{
    PNODE temp = NULL;
    PNODE target = NULL;

    int i = 0;
    int iCount = 0;

    iCount = Count(*first,*last);

    // Input Filter
    if((iPos < 1) || (iPos > iCount))
    {
        printf("Invalid position\n");
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst(first,last);
    }

    else if(iPos == iCount)
    {
        DeleteLast(first,last);
    }

    else
    {
        temp = *first;
        
        for(i = 1; i < (iPos - 1); i++)
        {
            temp = temp->next;
        }

        // target initialized
        target = temp->next;

        temp->next = target->next;
        free(target);

    }
}

int main()
{
    PNODE head = NULL;  
    PNODE tail = NULL;

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
        printf("7 : Display elements : \n");
        printf("8 : Number of nodes are in SinglyCL : \n");
        printf("9 : Exit\n");
        printf("-----------------------------------------\n");

        scanf("%d",&iChoice);

        switch(iChoice)
        {
        case 1:
            printf("Enter the value : \n");
            scanf("%d",&iValue);
            InsertFirst(&head,&tail,iValue);
            break;

        case 2:
            printf("Enter the value : \n");
            scanf("%d",&iValue);
            InsertLast(&head,&tail,iValue);
            break;

        case 3:
            printf("Enter the value : \n");
            scanf("%d",&iValue);

            printf("Enter position : \n");
            scanf("%d",&iPosition);

            InsertAtPos(&head,&tail,iValue,iPosition);
            break;

        case 4:
            
            DeleteFirst(&head,&tail);
            break;

        case 5:
            
            DeleteLast(&head,&tail);
            break;

        case 6:

            printf("Enter position : \n");
            scanf("%d",&iPosition);
            
            DeleteAtPos(&head,&tail,iPosition);
            break;

        case 7:

            printf("Elements of Singly Circular Linked List are : \n");
            Display(head,tail);
            break;

        case 8:

            iRet = Count(head,tail);
            printf("Number of elements are : %d\n",iRet);
            break;

        case 9:

            printf("Thank you for using Singly Circular Linked List Application\n");
            break;
        
        default:
            printf("Invalid choice\n");
            break;
        }
    }
   
    return 0;
}