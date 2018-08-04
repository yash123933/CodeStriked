#include <stdio.h>
#include <stdlib.h>
typedef struct Node{
    struct Node *next;
    int val;
}N;

N *p=NULL;
void create(int i,int value)
{
    int pos;
    N *temp;
    N *newnode;
    newnode=(N *) malloc(sizeof (N));
    newnode->val=value;
    newnode->next=NULL;
    if(p==NULL)
    {
        p=newnode;
    }
    else if(i==1 && p!=NULL)
    {
      newnode->next=p;
      p=newnode;
    }
    else if(i==2)
    {
        temp=p;
        printf("Enter the number of after which node is needed");
        scanf("%d",&pos);
        while(pos>1)
        {
            pos--;
            temp=temp->next;
        }
        newnode->next=temp->next;
        temp->next=newnode;
    }
    else
    {
        temp=p;
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=newnode;
    }
}
int main(){
    //create(1,25);
    int *p=5;
    printf("%d",&p);
    return 0;
}
