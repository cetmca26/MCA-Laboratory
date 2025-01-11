// Online C compiler to run C program online
#include <stdio.h>
#include <stdlib.h>
struct Node
{
    struct Node *prev;
    char c;
    struct Node *next;
};
struct Node *head, *tail;
void insertEnd(char ch)
{
    struct Node *newNode = malloc(sizeof(struct Node));
    newNode->c = ch;
    newNode->next = NULL;
    if (head == NULL)
    {
        head = newNode;
        tail = newNode;
        newNode->prev = NULL;
    }
    else
    {
        tail->next = newNode;
        newNode->prev = tail;
        tail = newNode;
    }
}
void displayRev()
{
    struct Node *temp = tail;
    while (temp != NULL)
    {
        printf("%c", temp->c);
        temp = temp->prev;
    }
}
int main()
{
    head = NULL;
    tail = NULL;
    // Write C code here
    char name[10];
    printf("\nEnter name:");
    scanf("%s", name);
    for (int i = 0; name[i] != '\0'; i++)
    {
        insertEnd(name[i]);
    }
    printf("\nReversed name is:");
    displayRev();
}