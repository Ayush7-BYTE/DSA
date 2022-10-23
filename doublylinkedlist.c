#include<stdio.h>
#include<stdlib.h>

//create node for doublylinkedlist
struct node{
    int data;
    struct node* next;
    struct node* prev;
};


// creating  doublylinkedlist
struct node* createDoubleLinkedList(int n){
    struct node *head=(struct node*)malloc(sizeof(struct node));
    struct node *head1=(struct node*)malloc(sizeof(struct node));
    head1=head;
    for(int i=1;i<=n;i++){
        int a;
        struct node *temp=(struct node*)malloc(sizeof(struct node));
        printf("enter the data for node %d :",i);
        scanf("%d",&a);
        head->data=a;
        if(i!=n){
        head->next=temp;
        temp->prev=head;
        head=temp;
        }else{
            head->next=NULL;
        }
    }
    return head1;

}
// printing the element of the node in the doublylinkedlist
void showList(struct node *head){
    while(head!=NULL){
        printf("%d ",head->data);
        head=head->next;
    }
    printf("\n");
}


// inserting the element in the doublylinkedlist
struct node* insert(struct node *head,int data,int pos){
    struct node *toAdd=(struct node*)malloc(sizeof(struct node));
    struct node *temp=(struct node*)malloc(sizeof(struct node));
    struct node *temp1=(struct node*)malloc(sizeof(struct node));
    temp=head;
    toAdd->data=data;
     if(pos==0){
    toAdd->next=head;
    return toAdd;
   }
    for(int i=0;i<pos-2;i++){
    temp=temp->next;
   }
    toAdd->next=temp->next;
    toAdd->prev=temp;
    temp1=temp->next;
    temp1->prev=toAdd;
   temp->next=toAdd;
   return head;

}

// deleting the element of doublylinkedlist
struct node* delete(struct node *head,int pos){
 if(pos==1){
        return head->next;
    }
   struct node *temp=(struct node*)malloc(sizeof(struct node));
    temp=head;
     for(int i=2;i<pos;i++){
    temp=temp->next;
   }
   if(temp->next->next=NULL){
       temp->next=NULL;
   }
  else if(temp->next->next!=NULL)
   {
    temp->next=temp->next->next;
   temp->next->next->prev=temp;
   }
   return head;
}

int main(){
    int n;
   struct node *head=(struct node*)malloc(sizeof(struct node));
   printf("enter the size of the doublylinkedlist:");
   scanf("%d",&n);
   head=createDoubleLinkedList(n);
   printf("this is our doubyLinkedList\n");
   showList(head);
   printf("enter the positon to insert the data: ");
   int p;
   scanf("%d",&p);
   printf("enter the data to insert the data: ");
   int d;
   scanf("%d",&d);
   head=insert(head,d,p);
   printf("this is our new list after insertion: ");
    showList(head);
    printf("enter the positon to delete the node : ");
   int k;
   scanf("%d",&k);
   head=delete(head,k);
   printf("this is our new list after deletion: ");
    showList(head);
}
