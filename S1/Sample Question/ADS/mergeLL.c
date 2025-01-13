//7. Merge Linked List

#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

struct node *head1 = NULL, *head2 = NULL, *merge = NULL, *new, *end;

void main()
{
    int n, m;
    printf("Enter number of nodes in LL1 and LL2 : ");
    scanf("%d %d", &n, &m);

    for (int i = 0; i < n + m; i++)
    {
        new = (struct node *)malloc(sizeof(struct node));
        new->link = NULL;

        if (i < n)
        {
            printf("Enter data for LL1 : ");
            scanf("%d", &new->data);
            if (head1 == NULL)
                head1 = new;
            else
            {
                new->link = head1;
                head1 = new;
            }
        }
        else
        {
            if (i == n)
            {
                end = new;
            }

            printf("Enter data for LL2 : ");
            scanf("%d", &new->data);
            if (head2 == NULL)
                head2 = new;
            else
            {
                new->link = head2;
                head2 = new;
            }
        }
        if (merge == NULL)
            merge = new;
        else
        {
            new->link = merge;
            merge = new;
        }
    }

    printf("\nFirst Linked list is : \n");
    new = head1;
    while (new != NULL)
    {
        printf("%d\t", new->data);
        new = new->link;
    }

    printf("\nSecond Linked List is : \n");
    new = head2;
    while (new != end->link)
    {
        printf("%d\t", new->data);
        new = new->link;
    }

    printf("\nMerged Linked List is : ");
    new = merge;
    while (new != NULL)
    {
        printf("%d\t", new->data);
        new = new->link;
    }
}