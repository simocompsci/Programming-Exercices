#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

void count_list_nodes(struct node *head){
    int count = 0;
    if (head == NULL)
    {
        printf("the linked list is empty!!! \n");   
    }
    struct node *ptr = NULL;
    ptr = head;
    while (ptr != NULL)
    {
        count++;
        ptr = ptr->link;
    }
    printf("the number of nodes in this linked list is : %d\n" , count);
    
}

int main(){
    struct node *head = (struct node*)malloc(sizeof(struct node));
    head->data = 99;
    head->link = NULL;
    struct node *current = (struct node*)malloc(sizeof(struct node));
    current->data = 50;
    current->link = NULL;
    head->link = current;
    // printf("%d\n" , current->data);
    // printf("%d\n" , current->link);
    // printf("%p\n" , head->link);
    // printf("%d\n" , head->link->data);
    // we can reuse current (ptr) to point to another node (because we can use only the head to access the all lists nodes)
    current = (struct node*)malloc(sizeof(struct node));
    current->data = 78;
    current->link = NULL;
    head->link->link = current;
    // printf("%d\n" , current->data);
    // printf("%p\n" , current->link);

    count_list_nodes(head);
    
    return 0;
}