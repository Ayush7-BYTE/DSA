#include <stdio.h>
int main(){
    int l;
    
    printf("enter the size of an array\n");
    
    scanf("%d",&l);
    int a[l];
    printf("enter the element\n");
    for(int i=0;i<l;i++){
        int e;
        scanf("%d",&e);
        a[i]=e;
    }
    printf("Enter the value to be search\n");
    int s;
    scanf("%d",&s);
    int c=0;
    for(int i=0;i<l;i++){
       if(a[i]==s){
        printf("\nelement found at index: %d",i);
        c++;
       }
        }
        if(c==0){
            printf("not found");
        }
    
    return 0;
}
