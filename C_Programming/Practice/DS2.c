#include<stdio.h>
#include<stdlib.h>

#pragma pack(1)

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;

int main()
{
    PNODE head = NULL;
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    



}