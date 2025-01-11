#include <stdio.h>
int n, i, j, adj[20][20], start, visited[20], queue[10], front = -1, rear = -1;
void bfs();
void enqueue(int node);
int dequeue();
int main()
{
    printf("\nEnter the no: of nodes:");
    scanf("%d", &n);
    // Reading the graph from adjacency matrix
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("\nEnter A[%d][%d]:", i, j);
            scanf("%d", &adj[i][j]);
        }
    }
    printf("\nEnter the starting vertex:");
    scanf("%d", &start);
    if (start < 0 || start > n - 1)
    {
        printf("\nInvalid Entry!!");
    }
    else
    {
        printf("BFS visisted order\n");
        bfs(start);
    }
    return 0;
}
void bfs(int start)
{
    enqueue(start);
    visited[start] = 1;
    printf("%d\t", start);
    while (front != -1 && rear != -1)
    {
        int node = dequeue();
        for (int i = 0; i < n; i++)
        {
            if (adj[i][node] == 1 && visited[i] != 1)
            {
                visited[i] = 1;
                printf("%d\t", i);
                enqueue(i);
            }
        }
    }
}
void enqueue(int node)
{
    if (front == -1 && rear == -1)
    {
        front = 0;
        rear = 0;
    }
    else
    {
        rear++;
    }
    queue[rear] = node;
}
int dequeue()
{
    int node = queue[front];
    if (front == rear)
    {
        front = -1;
        rear = -1;
    }
    else
    {
        front++;
    }
    return node;
}
