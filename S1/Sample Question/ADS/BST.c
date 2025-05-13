#include <stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *Rchild;
    struct node *Lchild;
};

struct node *create()
{
    struct node *new = (struct node *)malloc(sizeof(struct node));
    new->Rchild = new->Lchild = NULL;
    printf("Enter the data of your Node : ");
    scanf("%d", &new->data);
    return new;
}

struct node *Insert(struct node *root, struct node *new)
{
    if (root == NULL)
        return new;
    if (root->data > new->data)
        root->Lchild = Insert(root->Lchild, new);
    else
        root->Rchild = Insert(root->Rchild, new);
}

struct node *Inorder(struct node *root)
{
    if (root == NULL)
        return NULL;
    Inorder(root->Lchild);
    printf("%d\t", root->data);
    Inorder(root->Rchild);
}

struct node *PrintTree(struct node *root, int num)
{
    if (root == NULL)
        return NULL;

    num++;
    PrintTree(root->Rchild, num);
    for (int i = 0; i < num; i++)
        printf("\t");
    printf("%d", root->data);
    printf("\n");
    PrintTree(root->Lchild, num);
}

void main()
{
    struct node *newnode, *root=NULL;
    int num = 0, n;
    printf("Enter Limit : ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        newnode = create();
        root = Insert(root, newnode);
    }
    printf("Inorder is : \n");
    Inorder(root);
    printf("\nPrinting Tree : \n");
    PrintTree(root, num);
}