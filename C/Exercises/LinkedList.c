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

struct node* add_beg(struct node *head , int data){
    struct node *ptr = malloc(sizeof(struct node));
    ptr->data = data;
    ptr->link = NULL;
    ptr->link = head;
    head = ptr;
    return head;
}

void add_at_pos(struct node *head , int data , int pos){
    struct node *ptr = head;
    struct node *ptr2 = malloc(sizeof(struct node));
    ptr2->data = data;
    ptr2->link = NULL;
    
    pos--;
    while (pos != 1)
    {
        ptr = ptr->link;
        pos--;
    }
    ptr2->link = ptr->link;
    ptr->link = ptr2;
    
}

struct node* del_first(struct node *head){
    if (head == NULL)
    {
        printf("List is empty !!! \n");
    }
    else
    {
        struct node *temp = head;
        head = head->link;
        free(temp);
    }
    return head;
    
    
}

void free_list(struct node *head) {
    struct node *temp;
    while (head != NULL) {
        temp = head;
        head = head->link;
        free(temp);
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

    // add_at_end(head , 48);
    // add_at_end(head , 12);
    // count_list_nodes(head);
    // print_list(head);
    // free_list(head);
    head = add_beg(head , 24);
    int data = 55 , postion = 3;
    add_at_pos(head , data , postion);
    head = del_first(head);
    struct node *ptr = head;
    while (ptr != NULL)
    {
        printf("%d " , ptr->data);
        ptr = ptr->link;
    }
    
    return 0;
}