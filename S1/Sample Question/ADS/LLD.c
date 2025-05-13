// 11. Create a doubly linked list to store a string and display the vowels present in that string.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct link
{
    char lett;
    struct link *next;
};

struct link *head, *newlet, *curr;

struct link *create()
{
    struct link *new;
    new = (struct link *)malloc(sizeof(struct link));
    new->next = NULL;
    return new;
}

void main()
{
    char str[50];
    printf("Enter Your string : ");
    scanf("%s", str);

    for (int i = 0; i < strlen(str); i++)
    {
        newlet = create();
        newlet->lett = str[i];
        if (head == NULL)
        {
            head = curr = newlet;
        }
        else
        {
            curr->next = newlet;
            curr = curr->next;
        }
    }

    newlet = head;
    printf("Vowels in Your String are : \n");
    while (newlet != NULL)
    {
        if (newlet->lett == 'a' || newlet->lett == 'A' || newlet->lett == 'e' || newlet->lett == 'E' || newlet->lett == 'i' || newlet->lett == 'I' || newlet->lett == 'o' || newlet->lett == 'O' || newlet->lett == 'u' || newlet->lett == 'U')
            printf("%c\t", newlet->lett);
        newlet = newlet->next;
    }
}