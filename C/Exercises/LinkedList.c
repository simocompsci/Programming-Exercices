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

void add_at_end(struct node *head , int data){
    struct node *ptr , *temp;
    ptr = head;

    temp = (struct node*)malloc(sizeof(struct node));
    temp->data = data;
    temp->link = NULL;

    while (ptr->link != NULL)
    {
        ptr = ptr->link;
    }
    ptr->link = temp;
}

void print_list(struct node *head){
    if (head == NULL)
    {
        printf("list is empty!!! \n");
    }
    struct node *ptr = NULL;
    ptr = head;
    while (ptr != NULL)
    {
        printf("%d " , ptr->data);
        ptr = ptr->link;
    }
    
    
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

    add_at_end(head , 48);
    add_at_end(head , 12);
    count_list_nodes(head);
    print_list(head);
    free(head);
    free(current);
    return 0;
}