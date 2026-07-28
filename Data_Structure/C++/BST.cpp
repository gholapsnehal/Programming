////////////////////////////////////////////////////////////////
//
//  File Name   : BinarySearchTree.cpp
//  Description : Implementation of Binary Search Tree
//  Date        : 24/07/2026
//  Author      : Snehal Gholap
//
////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
        int data;
        struct node *lchild;
        struct node *rchild;
};

typedef struct node NODE;
typedef struct node* PNODE;

class BinarySearchTree
{
    private:
        PNODE root;
        int iCount;

    private:
        void Inorder(PNODE root);  // Recusrion
        void Preorder(PNODE root);
        void Postorder(PNODE root);
        bool Search(PNODE root,int iNo);
        int CountLeaf(PNODE root);
        int CountParent(PNODE root);

    public:
        BinarySearchTree();
        ~BinarySearchTree();

        void Inorder();    //wrapper
        void Preorder();
        void Postorder();
        
        void Insert(int iNo);
        int Count();
        bool Search(int iNo);
        int CountLeaf();
        int CountParent(); 
        
};

BinarySearchTree :: BinarySearchTree()
{
    root = NULL;
    iCount = 0;   
}

BinarySearchTree :: ~BinarySearchTree()
{}

void BinarySearchTree :: Inorder()
{
    Inorder(root);
}

void BinarySearchTree :: Inorder(PNODE root)
{
    if(root != NULL)
    {
        Inorder(root->lchild);

        cout<<root->data<<endl;

        Inorder(root->rchild);
    }

}

void BinarySearchTree :: Preorder()
{
    Preorder(root);
}

void BinarySearchTree :: Preorder(PNODE root)
{
    if(root != NULL)
    {
        cout<<root->data<<"\n";

        Preorder(root->lchild);
        Preorder(root->rchild);
    }
    
}

void BinarySearchTree :: Postorder()
{
    Postorder(root);
}

void BinarySearchTree :: Postorder(PNODE root)
{
    if(root != NULL)
    {
        Postorder(root->lchild);
        Postorder(root->rchild);

        cout<<root->data<<"\n";
    }

}

void BinarySearchTree :: Insert(int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = new NODE;

    newn->data = iNo;
    newn->lchild = NULL;
    newn->rchild = NULL;

    if(root == NULL)
    {
        root = newn;
        iCount++;
    }
    else
    {
        temp = root;

        while(1)
        {
            if(iNo > temp->data)
            {
                if(temp->rchild == NULL)
                {
                    temp->rchild = newn;
                    iCount++;
                    break;
                }

                temp = temp->rchild;
            }
            else if(iNo < temp->data)
            {
                if(temp->lchild == NULL)
                {
                    temp->lchild = newn;
                    iCount++;
                    break;
                }

                temp = temp->lchild;
            }

            else
            {
                cout<<"Unable to insert as element is already present in BST\n";
                delete newn;
                break;
            }
            
        }
    }
}

int BinarySearchTree :: Count()
{
    return iCount;
}

bool BinarySearchTree :: Search(int iNo)
{
    return Search(root,iNo);
}

bool BinarySearchTree :: Search(PNODE root, int iNo)
{
    bool bFlag = false;

    while(root != NULL)
    {
        if(root->data == iNo)
        {
            bFlag = true;
            break;
        }
        else if(iNo > root->data)
        {
            root = root->rchild;
        }
        else
        {
            root = root->lchild;
        }
    }

    return bFlag;

}

int BinarySearchTree :: CountLeaf()
{
    return CountLeaf(root);

}

int BinarySearchTree :: CountLeaf(PNODE root)
{
    if(root == NULL)
    {
        return 0;
    }

    if((root->lchild == NULL) && (root->rchild == NULL))
    {
        return 1;
    }

    return CountLeaf(root->lchild) + CountLeaf(root->rchild);

}

int BinarySearchTree :: CountParent()
{
    return CountParent(root);
}

int BinarySearchTree :: CountParent(PNODE root)
{
    if(root == NULL)
    {
        return 0;
    }

    if((root->lchild != NULL) || (root->rchild != NULL))
    {
        return 1 + CountParent(root->lchild) + CountParent(root->rchild);
    }

    return CountParent(root->rchild) + CountParent(root->rchild);
}



int main()
{
    BinarySearchTree bobj;
    int iRet = 0;


    bobj.Insert(11);
    bobj.Insert(5);
    bobj.Insert(17);
    bobj.Insert(4);
    bobj.Insert(21);
    bobj.Insert(15);
    bobj.Insert(25);
    bobj.Insert(7);

    cout<<"Inorder Display : \n";
    bobj.Inorder();

    cout<<"Preorder Display : \n";
    bobj.Preorder();

    cout<<"Postorder Display : \n";
    bobj.Postorder();

    if((bobj.Search(15) == true))
    {
        cout<<"15 is present in BST\n";
    }
    else
    {
        cout<<"15 is not present\n";
    }

    cout<<endl;

    iRet = bobj.Count();
    cout<<"Total number of nodes in BST : "<<iRet<<endl;

    iRet = bobj.CountLeaf();
    cout<<"Number of Leaf nodes in BST : "<<iRet<<endl;

    iRet = bobj.CountParent();
    cout<<"Number of parent nodes in BST : "<<iRet<<endl;


    return 0;
}