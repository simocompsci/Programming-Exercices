#include <stdio.h>
#include <stdlib.h>

struct BST_Node{
    int data;
    struct BST_Node* left;
    struct BST_Node* right;
};
struct BST_Node rootPtr;
rootPtr = NULL;

struct BST_Node* insert (struct BST_Node* rootPtr , int data){
    if (rootPtr == NULL)
    {
        rootPtr = malloc(sizeof(struct BST_Node));
        rootPtr->data = data;
    }
    else if (data <= rootPtr->data)
    {
        rootPtr->left = insert(rootPtr->left , data);
    }
    else
    {
        rootPtr->right = insert(rootPtr->right , data);
    }
    return rootPtr;
}

int main(){
    
    return 0;
}